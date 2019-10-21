package com.example.githubrepos.factories

import com.example.githubrepos.models.Repo
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GitHubFactory {
    val BASE_URL = "https://api.github.com/"

    private var gitHubService: GitHubService

    init {
        gitHubService = createGitService(getRetrofitInstance())
    }

    private fun createGitService(retrofitInstance: Retrofit): GitHubService {
        return retrofitInstance.create(GitHubService::class.java)
    }

    private fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getGithubRepos(username: String): Call<List<Repo>> {
        return gitHubService.getRepos(username)
    }


}
