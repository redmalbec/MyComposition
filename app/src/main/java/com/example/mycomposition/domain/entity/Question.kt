package com.example.mycomposition.domain.entity

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
)