package com.neotica.retrofitdemo

//Step 6: The data class.
data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)