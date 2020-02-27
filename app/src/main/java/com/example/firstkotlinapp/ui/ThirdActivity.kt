package com.example.firstkotlinapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.utils.UIManager

class ThirdActivity : AppCompatActivity() {

    lateinit var utils: UIManager
    var count: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

    /*
        Необходимо создать модель, замокать её данными, после создать recyclerView,
        добавить TextView address_txt, date_txt, recycler_view,
        и заполнить их данными, сделать всё по дизайну.
        Доп задание: сделать отображение amount_txt, discount_amount_txt и кто сможет менять цвет через ячейку
    */

    }

}
