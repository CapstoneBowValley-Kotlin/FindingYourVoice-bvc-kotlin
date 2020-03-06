package com.example.findingyourvoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_chat__case1.*
import com.example.findingyourvoice.databinding.ChatItemBinding
import com.example.findingyourvoice.databinding.ReplyItemBinding

class Chat_Case1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat__case1)

        val chats = arrayListOf<Chat>()
        chats.add(Chat("One day, you come into work and when you arrive, your supervisor asks you to do a task you were not trained to do.",0))
        chats.add(Chat("Do you do it?",0))
        chats.add(Chat("Yes",1))
        recycler_view.apply {
            layoutManager= LinearLayoutManager(this@Chat_Case1)
            adapter =ChatAdapter(chats)
        }
    }
}

class ChatAdapter(val items:List<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class ChatViewHolder(val binding : ChatItemBinding): RecyclerView.ViewHolder(binding.root)
    class ReplyViewHolder(val binding : ReplyItemBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            0 -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.chat_item, parent, false)
                val viewHolder = ChatViewHolder(ChatItemBinding.bind(view))
                return viewHolder
            }
            else -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.reply_item, parent, false)
                val viewHolder = ReplyViewHolder(ReplyItemBinding.bind(view))
                return viewHolder
            }
        }
    }



    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder.itemViewType){
            0 -> {
                (holder as ChatViewHolder).binding.chat=items[position]
            }
            else -> {
                (holder as ReplyViewHolder).binding.chat=items[position]
            }
            }
        }
/*
    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.binding.chat=items[position]
    }
*/
}

