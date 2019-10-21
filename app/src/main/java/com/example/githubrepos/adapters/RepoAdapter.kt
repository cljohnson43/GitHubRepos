package com.example.githubrepos.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepos.R
import com.example.githubrepos.models.Repo

class RepoAdapter(val repos: List<Repo>) : RecyclerView.Adapter<RepoAdapter.RepoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_repos, parent, false)
        return RepoViewHolder(view)
    }

    override fun getItemCount(): Int = repos.size

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        holder.tvRepoName.text = repos.get(position).name
        holder.tvUserName.text = repos.get(position).owner.login
    }

    class RepoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvRepoName: TextView = view.findViewById(R.id.tv_repo_name)
        val tvUserName: TextView = view.findViewById(R.id.tv_username)
    }
}