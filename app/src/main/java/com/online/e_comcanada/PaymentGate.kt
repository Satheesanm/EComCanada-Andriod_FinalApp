package com.online.e_comcanada

import com.paypal.android.sdk.payments.PayPalAuthorization
import com.paypal.android.sdk.payments.PayPalConfiguration
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity
import com.paypal.android.sdk.payments.PayPalItem
import com.paypal.android.sdk.payments.PayPalOAuthScopes
import com.paypal.android.sdk.payments.PayPalPayment
import com.paypal.android.sdk.payments.PayPalPaymentDetails
import com.paypal.android.sdk.payments.PayPalProfileSharingActivity
import com.paypal.android.sdk.payments.PayPalService
import com.paypal.android.sdk.payments.PaymentActivity
import com.paypal.android.sdk.payments.PaymentConfirmation
import com.paypal.android.sdk.payments.ShippingAddress


import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

import org.json.JSONException

import java.math.BigDecimal
import java.util.Arrays
import java.util.HashSet

class PaymentGate : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)
        val intent = Intent(this, PayPalService::class.java)
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config)
        startService(intent)
    }

    fun onBuyPressed(pressed: View) {
        val thingToBuy = getThingToBuy(PayPalPayment.PAYMENT_INTENT_SALE)
        val intent = Intent(this@PaymentGate, PaymentActivity::class.java)
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config)
        intent.putExtra(PaymentActivity.EXTRA_PAYMENT, thingToBuy)
        startActivityForResult(intent, REQUEST_CODE_PAYMENT)
    }

    private fun getThingToBuy(paymentIntent: String): PayPalPayment {
        return PayPalPayment(BigDecimal("1699.90"), "CAD", "Phone",
            paymentIntent)
    }

    private fun getStuffToBuy(paymentIntent: String): PayPalPayment {
            val items = arrayOf(
            PayPalItem("Phone #1", 2, BigDecimal("87.50"), "CAD", "sku-12345678"),
            PayPalItem("free Phone #2", 1, BigDecimal("0.00"), "CAD", "sku-zero-price"),
            PayPalItem("Phone #3 with a longer name", 6, BigDecimal("37.99"), "CAD", "sku-33333")
        )
        val subtotal = PayPalItem.getItemTotal(items)
        val shipping = BigDecimal("7.21")
        val tax = BigDecimal("4.67")
        val paymentDetails = PayPalPaymentDetails(shipping, subtotal, tax)
        val amount = subtotal.add(shipping).add(tax)
        val payment = PayPalPayment(amount, "CAD", "Phone", paymentIntent)
        payment.items(items).paymentDetails(paymentDetails)
        payment.custom("This is text that will be associated with the payment that the app can use.")
        return payment
    }

     private fun addAppProvidedShippingAddress(paypalPayment: PayPalPayment) {
        val shippingAddress = ShippingAddress()
            .recipientName("Mom Parker")
            .line1("52 North Main St.")
            .city("Austin")
            .state("TX")
            .postalCode("78729")
            .countryCode("US")
        paypalPayment.providedShippingAddress(shippingAddress)
    }

    private fun enableShippingAddressRetrieval(paypalPayment: PayPalPayment, enable: Boolean) {
        paypalPayment.enablePayPalShippingAddressesRetrieval(enable)
    }



    private val oauthScopes: PayPalOAuthScopes
        get() {
            val scopes = HashSet(
                Arrays.asList(
                    PayPalOAuthScopes.PAYPAL_SCOPE_EMAIL,
                    PayPalOAuthScopes.PAYPAL_SCOPE_ADDRESS
                )
            )
            return PayPalOAuthScopes(scopes)
        }

    protected fun displayResultText(result: String) {
        var resultView:TextView = findViewById(R.id.txtResult)
        resultView.text = "Result : " + result
        Toast.makeText(
            applicationContext,
            result, Toast.LENGTH_LONG).show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE_PAYMENT) {
            if (resultCode == Activity.RESULT_OK) {
                val confirm = data?.getParcelableExtra<PaymentConfirmation>(PaymentActivity.EXTRA_RESULT_CONFIRMATION)
                if (confirm != null) {
                    try {
                        Log.i(TAG, confirm.toJSONObject().toString(4))
                        Log.i(TAG, confirm.payment.toJSONObject().toString(4))
                        displayResultText("PaymentConfirmation info received from PayPal")

                    } catch (e: JSONException) {
                        Log.e(TAG, "an extremely unlikely failure occurred: ", e)
                    }

                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.i(TAG, "The user canceled.")
            } else if (resultCode == PaymentActivity.RESULT_EXTRAS_INVALID) {
                Log.i(
                    TAG,
                    "An invalid Payment or PayPalConfiguration was submitted. Please see the docs.")
            }
        } else if (requestCode == REQUEST_CODE_FUTURE_PAYMENT) {
            if (resultCode == Activity.RESULT_OK) {
                val auth = data?.getParcelableExtra<PayPalAuthorization>(PayPalFuturePaymentActivity.EXTRA_RESULT_AUTHORIZATION)
                if (auth != null) {
                    try {
                        Log.i("FuturePaymentExample", auth.toJSONObject().toString(4))

                        val authorization_code = auth.authorizationCode
                        Log.i("FuturePaymentExample", authorization_code)

                        sendAuthorizationToServer(auth)
                        displayResultText("Future Payment code received from PayPal")

                    } catch (e: JSONException) {
                        Log.e("FuturePaymentExample", "an extremely unlikely failure occurred: ", e)
                    }

                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.i("FuturePaymentExample", "The user canceled.")
            } else if (resultCode == PayPalFuturePaymentActivity.RESULT_EXTRAS_INVALID) {
                Log.i(
                    "FuturePaymentExample",
                    "Probably the attempt to previously start the PayPalService had an invalid PayPalConfiguration. Please see the docs.")
            }
        } else if (requestCode == REQUEST_CODE_PROFILE_SHARING) {
            if (resultCode == Activity.RESULT_OK) {
                val auth = data?.getParcelableExtra<PayPalAuthorization>(PayPalProfileSharingActivity.EXTRA_RESULT_AUTHORIZATION)
                if (auth != null) {
                    try {
                        Log.i("ProfileSharingExample", auth.toJSONObject().toString(4))

                        val authorization_code = auth.authorizationCode
                        Log.i("ProfileSharingExample", authorization_code)

                        sendAuthorizationToServer(auth)
                        displayResultText("Profile Sharing code received from PayPal")

                    } catch (e: JSONException) {
                        Log.e("ProfileSharingExample", "an extremely unlikely failure occurred: ", e)
                    }

                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.i("ProfileSharingExample", "The user canceled.")
            } else if (resultCode == PayPalFuturePaymentActivity.RESULT_EXTRAS_INVALID) {
                Log.i(
                    "ProfileSharingExample",
                    "Probably the attempt to previously start the PayPalService had an invalid PayPalConfiguration. Please see the docs.")
            }
        }
    }

    private fun sendAuthorizationToServer(authorization: PayPalAuthorization) {  }



    public override fun onDestroy() {
        stopService(Intent(this, PayPalService::class.java))
        super.onDestroy()
    }

    companion object {
        private val TAG = "paymentExample"
          private val CONFIG_ENVIRONMENT = PayPalConfiguration.ENVIRONMENT_NO_NETWORK

        // note that these credentials will differ between live & sandbox environments.
        private val CONFIG_CLIENT_ID = "credentials from developer.paypal.com"

        private val REQUEST_CODE_PAYMENT = 1
        private val REQUEST_CODE_FUTURE_PAYMENT = 2
        private val REQUEST_CODE_PROFILE_SHARING = 3

        private val config = PayPalConfiguration()
            .environment(CONFIG_ENVIRONMENT)
            .clientId(CONFIG_CLIENT_ID)
            .merchantName("Example Merchant")
            .merchantPrivacyPolicyUri(Uri.parse("https://www.example.com/privacy"))
            .merchantUserAgreementUri(Uri.parse("https://www.example.com/legal"))
    }
}
