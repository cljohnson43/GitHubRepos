package com.example.githubrepos.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.githubrepos.R
import com.example.githubrepos.models.Repo
import com.example.githubrepos.presenters.RepoPresenter
import com.example.githubrepos.presenters.RepoViewInterface
import kotlinx.android.synthetic.main.activity_main.*

const val REPO_KEY = "repo.key"

class MainActivity : AppCompatActivity(), RepoViewInterface {

    val repoPresenter: RepoPresenter by lazy {
        RepoPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_find_repos -> repoPresenter.getRepos(et_username.text.toString())
        }
    }

    override fun displayGetReposError() {
        //TODO

    }

    override fun displayRepos(repos: List<Repo>) {

        val fragment = ReposFragment()
        fragment.arguments = Bundle().apply {
            putParcelableArray(REPO_KEY, repos.toTypedArray())
        }
        supportFragmentManager.beginTransaction().apply {
            add(R.id.fragment_container, fragment)
            // TODO: check backstack
            commit()
        }
    }
}
