package com.example.mycomposition.domain.usecases

import com.example.mycomposition.domain.entity.GameSettings
import com.example.mycomposition.domain.entity.Level
import com.example.mycomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}