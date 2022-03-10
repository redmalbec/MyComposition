package com.example.mycomposition.domain.repository

import com.example.mycomposition.domain.entity.GameSettings
import com.example.mycomposition.domain.entity.Level
import com.example.mycomposition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}