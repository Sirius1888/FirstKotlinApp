package com.example.firstkotlinapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.utils.UIManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val nameList = mutableListOf("444", "hello", "text", "!!!")
    val passList = mutableListOf("444", "123456", "!!!")

    val namePList = mutableListOf("444", "333", "111")
    val passPList = mutableListOf("444", "333", "111")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainClick()
    }

    private fun mainClick() {
        click_btn.setOnClickListener {
            val userName = username_txt.text.toString()
            val password = password_txt.text.toString()
            UIManager.showToast(
                "$userName $password",
                this
            )
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (namePList.contains(userName) && passPList.contains(password)) {
            startActivity(
                Intent(this, ThirdActivity::class.java)
                    .putExtra("condition", userName)
            )
        } else if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password)
            )
        else UIManager.showToast(
            "ERROR",
            this
        )
    }

}
