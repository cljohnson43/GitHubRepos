package com.example.githubrepos.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepos.R
import com.example.githubrepos.models.Commit

class CommitAdapter(val commits: List<Commit>): RecyclerView.Adapter<CommitAdapter.CommitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_commit, parent, false)
        return CommitViewHolder(view)
    }

    override fun getItemCount(): Int = commits.size

    override fun onBindViewHolder(holder: CommitViewHolder, position: Int) {
        holder.apply{
            tvCommitDate.text = commits.get(position).commit?.author?.date
            tvCommitMessage.text = commits.get(position).commit?.message
            //ivProfilePic set profile pic
        }
    }

    class CommitViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvCommitMessage: TextView = view.findViewById(R.id.tv_commit_message)
        val tvCommitDate: TextView = view.findViewById(R.id.tv_commit_date)
        val ivProfilePic: ImageView = view.findViewById(R.id.iv_user_profile_pic)
    }
}