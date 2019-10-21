package com.example.githubrepos.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubrepos.R
import com.example.githubrepos.adapters.RepoAdapter
import com.example.githubrepos.models.Repo
import kotlinx.android.synthetic.main.fragment_repo_list.*

class ReposFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_repo_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val repos = arguments?.getParcelableArray(REPO_KEY)?.map { parcel -> parcel as Repo }
            ?: listOf<Repo>()

        rv_repo_list.adapter = RepoAdapter(repos)
        rv_repo_list.layoutManager = LinearLayoutManager(this.context)
    }

}