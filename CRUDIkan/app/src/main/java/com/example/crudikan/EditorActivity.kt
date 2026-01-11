package com.example.crudikan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.crudikan.data.AppDatabase
import com.example.crudikan.data.entity.User

class EditorActivity : AppCompatActivity() {

    private lateinit var fullName: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var address: EditText
    private lateinit var btnSave: Button
    private lateinit var database: AppDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)
        fullName = findViewById(R.id.merk_mobil)
        email = findViewById(R.id.type_mobil)
        phone = findViewById(R.id.kubikasi_mesin)
        address = findViewById(R.id.bahan_bakar)
        btnSave = findViewById(R.id.btn_save)

        database = AppDatabase.getInstance(applicationContext)

        val intent = intent.extras
        if (intent!=null){
            val id = intent.getInt("id", 0)
            val user = database.UserDao().get(id)

            fullName.setText(user.fullName)
            email.setText(user.email)
            phone.setText(user.phone)
            address.setText(user.address)
        }

        btnSave.setOnClickListener {
            if (fullName.text.isNotEmpty() && email.text.isNotEmpty() && phone.text.isNotEmpty()) {
                if (intent!=null){
                    database.UserDao().update(
                        User(
                            intent.getInt("id", 0),
                            fullName.text.toString(),
                            email.text.toString(),
                            phone.text.toString(),
                            address.text.toString()
                        )
                    )
                }else {
                    database.UserDao().insertAll(
                        User(
                            null,
                            fullName.text.toString(),
                            email.text.toString(),
                            phone.text.toString(),
                            address.text.toString()
                        )
                    )
                }

                finish()
            } else {
                Toast.makeText(
                    applicationContext,
                    " Warning : Mohon isi data dengan valid ! ",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}