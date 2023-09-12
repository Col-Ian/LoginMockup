package com.example.loginmockup.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginmockup.R
import com.example.loginmockup.components.CheckboxComponent
import com.example.loginmockup.components.HeadingTextComponent
import com.example.loginmockup.components.MyTextField
import com.example.loginmockup.components.NormalTextComponent
import com.example.loginmockup.components.PasswordTextField
import com.example.loginmockup.navigation.PostOfficeAppRouter
import com.example.loginmockup.navigation.Screen

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier = Modifier.fillMaxSize()) {
            // Ctrl+Shift+F to find xml file strings through a search
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.first_name),
                Icons.Default.Person
            )
            MyTextField(
                labelValue = stringResource(id = R.string.last_name),
                Icons.Default.Person
            )
            MyTextField(
                labelValue = stringResource(id = R.string.email),
                Icons.Default.Email
            )
            PasswordTextField(
                labelValue = stringResource(id = R.string.password),
                Icons.Default.Lock
            )
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })
        }

    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}