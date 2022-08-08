package com.example.android.guesstheword.screens.game

import  android.lyfecycle.ViewModel
class GameViewModel : ViewModel(){
    init {
        log.i(tag: "GameViewModel",msg:"GameViewModel created!")

    }
    override fun onCleared(){
        super.onCleared()
        log.i(tag: "GameViewModel",msg:"GameViewModel created!")
    }
}