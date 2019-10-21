package com.example.githubrepos.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Verification {

    @SerializedName("verified")
    @Expose
    var verified: Boolean? = null
    @SerializedName("reason")
    @Expose
    var reason: String? = null
    @SerializedName("signature")
    @Expose
    var signature: Any? = null
    @SerializedName("payload")
    @Expose
    var payload: Any? = null

}
