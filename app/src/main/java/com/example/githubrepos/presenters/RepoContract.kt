package com.example.githubrepos.presenters

import com.example.githubrepos.models.Repo

interface RepoModelInterface {
    fun getRepos(username: String)
}

interface RepoViewInterface {
    fun displayRepos(repos: List<Repo>)
    fun displayGetReposError()
}