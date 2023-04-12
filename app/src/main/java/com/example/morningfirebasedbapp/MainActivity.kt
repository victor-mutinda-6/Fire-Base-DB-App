package com.example.morningfirebasedbapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var edtName:EditText
    lateinit var edtEmail:EditText
    lateinit var edtIdNumber: EditText
    lateinit var btnSave:Button
    lateinit var btnView:Button
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName=findViewById(R.id.mEditName)
        edtEmail=findViewById(R.id.mEditEmail)
        edtIdNumber=findViewById(R.id.mEditIdNumber)
        btnSave=findViewById(R.id.mBtnSave)
        btnView=findViewById(R.id.mBtnView)
        progressDialog=ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait...")
        btnSave.setOnClickListener {

        }
        btnView.setOnClickListener {

        }

    }
}