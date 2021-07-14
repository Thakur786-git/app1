package com.example.androidday1.Exception

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ContentProviderActivity : AppCompatActivity() {
    lateinit var listview: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ontent_provider)
        var listview = findViewById(R.id.cp_listview)
        val allMessages: Uri = Uri.parse("content://sms/")

        val selection
        val cursor: Cursor? = this.contentResolver.query(
            allMessages, projection null,
            selection:null,
        selectionArgs:null, sortOrder:null
        )
var fromColNames = ArrayStrings<String>(size 1){"body"}
        var toTextViewIds = Array<Int>(size 1){android.R.id.text1}
        var cursorAdapter = simpleCursorAdapter()
        android.R.layout.simple_list_item_1,
        cursor,
        fromColNames,
        toTextviewIds)
        listview.adapter = cursorAdapter

    }
}