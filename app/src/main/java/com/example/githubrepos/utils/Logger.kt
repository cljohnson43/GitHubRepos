package com.example.githubrepos.utils

import android.util.Log

const val ERROR_TAG = "error.tag"

object Logger {
    fun error(msg: String, tag: String = ERROR_TAG) {
        Log.e(tag, msg)
    }
}