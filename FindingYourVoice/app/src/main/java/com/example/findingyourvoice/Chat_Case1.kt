package com.example.findingyourvoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_chat__case1.*
import com.example.findingyourvoice.databinding.ChatItemBinding
import com.example.findingyourvoice.databinding.ReplyItemBinding
import java.util.Arrays

class Chat_Case1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat__case1)
        val chats = arrayListOf<Chat>()
        var p:Int=0
        fun logic(type:Int){
        when(type){
            3->{
                chats.add(Chat("It's good idea to ask for more information.",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                chats.add(Chat("Do you feel safe to ask?",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
            }
            12->{
                chats.add(Chat("You have a right to ask which is given to you by OHS",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                chats.add(Chat("So you should always ask questions untill you feel safe",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                yes_button.isClickable=false
                yes_button.visibility= View.INVISIBLE
                no_button.isClickable=false
                no_button.visibility= View.INVISIBLE
            }
            8->{
                chats.add(Chat("It's bad to do a task when you are not trained.",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                chats.add(Chat("Do you feel safe to ask?",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
            }
            17->{
                chats.add(Chat("That's great!",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                chats.add(Chat("Information is one of the best tools workers can have,as it helps you maneuver the copicate world of the workplac and healthand safety lesiglation",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                yes_button.isClickable=false
                yes_button.visibility= View.INVISIBLE
                no_button.isClickable=false
                no_button.visibility= View.INVISIBLE
            }
            67->{
                chats.add(Chat("You have a right to ask which is given to you by OHS",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                chats.add(Chat("So you should always ask questions untill you feel safe",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                yes_button.isClickable=false
                yes_button.visibility= View.INVISIBLE
                no_button.isClickable=false
                no_button.visibility= View.INVISIBLE
            }
            72->{
                chats.add(Chat("It's bad to do a task when you are not trained.",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                chats.add(Chat("Do you feel safe to ask?",0))
                recycler_view.apply {
                    adapter?.notifyItemChanged(p)
                    p++
                }
                recycler_view.scrollToPosition(p-1)
                yes_button.isClickable=false
                yes_button.visibility= View.INVISIBLE
                no_button.isClickable=false
                no_button.visibility= View.INVISIBLE
            }
            else->{
                println("Invalid option")
            }
        }
        }

        var type:Int=0

        chats.add(Chat("One day, you come into work and when you arrive, your supervisor asks you to do a task you were not trained to do.",0))
        p++
        chats.add(Chat("Do you do it?",0))
        p++
        yes_button.setOnClickListener {
            chats.add(Chat("Yes",1))
            recycler_view.apply {
                adapter?.notifyItemChanged(p)
                p++
            }
            recycler_view.scrollToPosition(p-1)
            type=type*type+8
            logic(type)
        }
        no_button.setOnClickListener {
            chats.add(Chat("No",1))
            recycler_view.apply {
                adapter?.notifyItemChanged(p)
                p++
            }
            recycler_view.scrollToPosition(p-1)
            type=type*type+3
            logic(type)
        }
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

