package com.example.foodykotlin

import android.content.pm.PackageInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_flashscreen.*

class FlashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_flashscreen)
        val packageInfo = packageManager.getPackageInfo(packageName, 0)
        txtVersion.setText("Version : " + packageInfo.versionName);

    }
}
