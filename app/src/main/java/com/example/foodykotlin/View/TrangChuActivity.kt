package com.example.foodykotlin.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodykotlin.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_trang_chu.*

class TrangChuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trang_chu)
        btout.setOnClickListener(View.OnClickListener { FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this, DangNhapActivity::class.java))
        })
    }
}
