package com.rachidbs.todo.tasklist

data class Task(
    val id: String,
    val title: String,
    val description: String = ""
)