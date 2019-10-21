package com.example.githubrepos.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Commit {

    @SerializedName("sha")
    @Expose
    var sha: String? = null
    @SerializedName("node_id")
    @Expose
    var nodeId: String? = null
    @SerializedName("commit")
    @Expose
    var commit: Commit_? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null
    @SerializedName("comments_url")
    @Expose
    var commentsUrl: String? = null
    @SerializedName("author")
    @Expose
    var author: Author_? = null
    @SerializedName("committer")
    @Expose
    var committer: Committer_? = null

}
