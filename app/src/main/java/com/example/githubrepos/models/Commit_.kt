package com.example.githubrepos.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Commit_ : Parcelable {

    @SerializedName("author")
    @Expose
    var author: Author? = null
    @SerializedName("committer")
    @Expose
    var committer: Committer? = null
    @SerializedName("message")
    @Expose
    var message: String? = null
    @SerializedName("tree")
    @Expose
    var tree: Tree? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("comment_count")
    @Expose
    var commentCount: Int? = null
    @SerializedName("verification")
    @Expose
    var verification: Verification? = null

}
