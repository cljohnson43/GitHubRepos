package com.example.githubrepos.presenters

import com.example.githubrepos.factories.GitHubFactory
import com.example.githubrepos.models.Repo
import com.example.githubrepos.utils.Logger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoPresenter(private val repoViewer: RepoViewInterface) : RepoModelInterface {

    private val gitHubService: GitHubFactory by lazy { GitHubFactory() }

    override fun getRepos(username: String) {
        gitHubService.getGithubRepos(username).enqueue(object : Callback<List<Repo>> {
            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
                Logger.error("error fetching repos: ${t.message}")
                repoViewer.displayGetReposError()
            }

            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {
                response.body()?.also { repos ->
                    repoViewer.displayRepos(repos)
                }
            }
        })
    }
}
