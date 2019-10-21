package com.example.githubrepos.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Tree : Parcelable {

    @SerializedName("sha")
    @Expose
    var sha: String? = null
    @SerializedName("url")
    @Expose
    var url: String? = null

}
