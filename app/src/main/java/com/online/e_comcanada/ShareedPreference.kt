package com.online.e_comcanada

import android.content.Context
import android.content.SharedPreferences


object SharedPref {
    private lateinit var prefs: SharedPreferences

    private const val PREFS_NAME = "params"


    const val mSamsungName = "Samsung Galaxy S23"
    const val mSamsungPrice = "$1,649.99"
    const val mSamsungrating = "4.3 *"
    const val mSamsungreview= "50 ratings \\u0026 15 reviews"
    const val mSamsungDescription = "Screen: \t6.1\" 2400 x 1080 FHD+ Dynamic AMOLED 2X\n" +
            "Processor: \tOcta-core Snapdragon® 8 Gen 2\n" +
            "Back Camera: \t50 MP OIS f/1.8 (Wide) 12 MP f/2.2 (Ultra Wide) 10 MP OIS f/2.4 (Tele 3x) 30x Space Zoom\n" +
            "Front Camera: \t12 MP f/2.2\n" +
            "Battery: \t3,900 mAh 25 W Super Fast Charging 2.0 Fast Wireless Charging 2.0 Wireless PowerShare\n" +
            "Internal Memory: \t128 GB / 256 GB\n" +
            "RAM: \t8 GB\n" +
            "Size: \t70.9 x 146.3 x 7.6 mm\n" +
            "Weight: \t168g\n" +
            "Water Resistance: \tIP68\n" +
            "Operating System: \tAndroid 13\n" +
            "Package Content: \tCharger sold separately."

    const val mSamsungs22Name = "Samsung Galaxy S22"
    const val mSamsungs22Price = "$1,469.99"
    const val mSamsung22rating = "4.7 *"
    const val mSamsung22review= "100 ratings \\u0026 45 reviews"
    const val mSamsungs22Description = "Screen: \t6.8” QHD+ (2340 x 1080) Dynamic AMOLED 2X Display\n" +
            "Processor: \tSnapdragon 8 Gen 1\n" +
            "Back Camera: \tUltra-Wide 12 MP Wide 108 MP Telephoto #1 10 MP Telephoto #2 10 MP\n" +
            "Front Camera: \t40 MP\n" +
            "Battery: \t5000 mAh\n" +
            "Internal Memory: \t128 / 256 / 512 GB\n" +
            "RAM: \t8.0 / 12.0 GB / 12.0 GB\n" +
            "Operating System: \tAndroid 12\n" +
            "Size: \t163.3 x 77.9 x 8.9 mm\n" +
            "Weight: \t229 g\n" +
            "Water Resistance: \tIP68\n" +
            "Package Content: \tDevice, data cable, ejection pin, Quick Start Guide\n" +
            "SIM Card: \tNano"


    const val mSamsungs21Name = "Samsung Galaxy S21"
    const val mSamsungs21Price = "$1199.99"
    const val mSamsung21rating = "4.6 *"
    const val mSamsung21review= "80 ratings \\u0026 45 reviews"
    const val mSamsungs21Description = "Screen: \t6.2\"\n" +
            "Processor: \tSnapdragon888\n" +
            "Back Camera: \tUltra wide 12MP, Wide 12MP, Tele 64MP\n" +
            "Front Camera: \t10MP\n" +
            "Battery: \t4,000mAh\n" +
            "Internal Memory: \t128 GB\n" +
            "RAM: \t8GB\n" +
            "Operating System: \tAndroid 11.0\n" +
            "Size: \t151.7 x 71.2 x 7.9 mm\n" +
            "Weight: \t169g\n" +
            "Water Resistance: \tYes (IP68)\n" +
            "Package Content: \tCertified pre-owned phone, data cable\n" +
            "SIM Card: \tNano"

    const val mphone14 = "iPhone - 14"
    const val mIphone14Price = "$1,249.74"
    const val mphone14rating = "4.8 *"
    const val mphone14review= "90 ratings \\u0026 45 reviews"
    const val mIphone14Description = "Screen: \tSuper Retina XDR display; 6.1‑inch (diagonal) all‑screen OLED display; 2556‑by‑1179-pixel resolution at 460 ppi\n" +
            "Processor: \tA16 Bionic chip\n" +
            "Back Camera: \tPro camera system (48MP Main, 12MP Ultra Wide and 12MP Telephoto)\n" +
            "Front Camera: \t12MP TrueDepth front camera\n" +
            "Battery: \tMagSafe and Qi wireless charging with up to 23 hours video playback\n" +
            "Internal Memory: \t128GB, 256GB, 512GB, 1TB\n" +
            "Calling Features: \t5G and Gigabit LTE\n" +
            "Operating System: \tiOS 16\n" +
            "Size: \t5.81 x 2.81 x 0.31 inches\n" +
            "Weight: \t206 g\n" +
            "Water Resistance: \tIP68\n" +
            "SIM Card: \tDual SIM (nano‑SIM and eSIM); Dual eSIM support"

    const val mphone12 = "iPhone - 12"
    const val mIphone12Price = "$999.74"
    const val mphone12rating = "4.3 *"
    const val mphone12review= "75 ratings \\u0026 35 reviews"
    const val mIphone12Description = "Internal Memory: \t128 GB\n" +
            "Screen: \t6.1-inch Super Retina XDR display\n" +
            "Processor: \tA14 Bionic chip\n" +
            "Back Camera: \tPro 12MP camera system (Ultra Wide, Wide and Telephoto), Ultra Wide: ƒ/2.4 aperture Wide: ƒ/1.6 aperture Telephoto: ƒ/2.0 aperture\n" +
            "Front Camera: \t12MP TrueDepth front camera, ƒ/2.2 aperture\n" +
            "Size: \t146.7 x 71.5 x 7.4 mm\n" +
            "Weight: \t187g\n" +
            "Water Resistance: \tYes\n" +
            "SIM Card: \tnano-SIM\n" +
            "eSIM: \tYes\n" +
            "Operating System: \tiOS 14"

    const val mphone13 = "iPhone - 13"
    const val mIphone13Price = "$1,099.74"
    const val mphone13rating = "4.4 *"
    const val mphone13review= "75 ratings \\u0026 35 reviews"
    const val mIphone13Description = "Screen: \tSuper Retina XDR display 6.1-inch (diagonal) all-screen OLED display 2532-by-1170-pixel resolution at 460 ppi\n" +
            "Processor: \tA15 Bionic chip\n" +
            "Back Camera: \tDual 12MP camera system (Wide and Ultra Wide) Wide: ƒ/1.6 aperture Ultra Wide: ƒ/2.4 aperture\n" +
            "Front Camera: \tTrueDepth camera 12MP photos ƒ/2.2 aperture\n" +
            "Battery: \tBuilt-in rechargeable lithium‑ion battery\n" +
            "Internal Memory: \t128 GB\n" +
            "Operating System: \tiOS 15\n" +
            "Size: \t146.7 x 71.5 x 7.65 mm\n" +
            "Weight: \t173g\n" +
            "SIM Card: \tNano\n" +
            "eSIM: \tYes\n" +
            "Water Resistant: \tYes\n" +
            "SIM Card: \tNano"


    const val mGooglePixel7 = "Google Pixel 7"
    const val mGooglePixel7Price = "$1,099.74"
    const val mGooglePixel7rating = "3.8 *"
    const val mGooglePixel7review= "175 ratings \\u0026 35 reviews"
    const val mGooglePixel7Description = "Screen: \t6.3” FHD+ OLED display\n" +
            "Processor: \tGoogle Tensor G2, Titan M2 security coprocessor\n" +
            "Back Camera: \t50 MP Octa PD Quad Bayer wide camera ƒ/1.85 | 12 MP ultrawide camera ƒ/2.2\n" +
            "Front Camera: \t10.8 MP ƒ/2.2\n" +
            "Battery: \t4335 mAh, 30W charger\n" +
            "Internal Memory: \t128 GB / 256 GB UFS 3.1 storage\n" +
            "RAM: \t8 GB LPDDR5 RAM\n" +
            "Operating System: \tAndroid 13\n" +
            "Size: \t155.6 x 73.2 x 8.7 mm\n" +
            "Weight: \t197g\n" +
            "Water Resistance: \tIP68\n" +
            "Package Content: \t1 m USB-C® to USB-C cable (USB 2.0), Quick start guide, Quick Switch adaptor, SIM tool\n" +
            "SIM Card: \tNano, eSIM"

    const val mGooglePixel6 = "Google Pixel 6"
    const val mGooglePixel6Price = "$999.74"
    const val mGooglePixel6rating = "4.8 *"
    const val mGooglePixel6review= "175 ratings \\u0026 35 reviews"
    const val mGooglePixel6Description = "Screen: \t6.1” FHD+ OLED display\n" +
            "Processor: \tGoogle Tensor, Titan M2™ security coprocessor\n" +
            "Back Camera: \t12.2MP dual pixel wide camera f1.7 | 12MP ultrawide camera f2.2\n" +
            "Front Camera: \t8MP F2.0\n" +
            "Battery: \t4410 mAh\n" +
            "Internal Memory: \t128 GB storage UFS 3.1 storage\n" +
            "RAM: \t6 GB LPDDR5 RAM\n" +
            "Operating System: \tAndroid 12\n" +
            "Size: \t152.2 x 71.8 x 8.9 mm\n" +
            "Weight: \t178g\n" +
            "Water Resistance: \tIP67\n" +
            "Package Content: \t1 m USB-C to USB-C cable (USB 2.0) Quick start guide Quick Switch adaptor SIM tool\n" +
            "SIM Card #1: \tNano\n" +
            "SIM Card #2: \teSim"

    const val mGooglePixel5 = "Google Pixel 5"
    const val mGooglePixel5Price = "$499.74"
    const val mGooglePixel5Description = "\n" +
            "Brand\tGoogle\n" +
            "Model Name\tPixel 5\n" +
            "Wireless Carrier\tT-Mobile, Unlocked, Verizon, Sprint\n" +
            "OS\tandroid\n" +
            "Cellular Technology\t5G\n" +
            "Connectivity technologies\tWi-Fi\n" +
            "Color\tSorta Sage\n" +
            "Formfactor\tSmartphone\n" +
            "Other camera features"


    fun init(context: Context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun read(key: String, value: String): String? {
        return prefs.getString(key, value)
    }

    fun read(key: String, value: Long): Long? {
        return prefs.getLong(key, value)
    }

    fun write(key: String, value: String) {
        val prefsEditor: SharedPreferences.Editor = prefs.edit()
        with(prefsEditor) {
            putString(key, value)
            commit()
        }
    }

    fun write(key: String, value: Long) {
        val prefsEditor: SharedPreferences.Editor = prefs.edit()
        with(prefsEditor) {
            putLong(key, value)
            commit()
        }
    }
}