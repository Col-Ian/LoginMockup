package com.example.loginmockup.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginmockup.navigation.PostOfficeAppRouter
import com.example.loginmockup.navigation.Screen
import com.example.loginmockup.screens.SignUpScreen
import com.example.loginmockup.screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp (){
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = PostOfficeAppRouter.currentScreen) {currentState->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen ->{
                    TermsAndConditionsScreen()
                }
            }
        }
    }
}