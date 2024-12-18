package com.mustafa.loginscreen

import android.renderscript.Sampler.Value
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")

    }
    var password by remember {
        mutableStateOf("")
    }


    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Image(painter = painterResource(id = R.drawable.x) , contentDescription = "login_image",
            modifier = Modifier.size(200.dp))
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Login to your account ")

        Spacer(modifier = Modifier.height(5.dp))
        
        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "E mail Address")
        })

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")

        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(5.dp))

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forgot Password")
        }
        Spacer(modifier = Modifier.height(5.dp))
        
        Text(text = "Or sign in with")

        Spacer(modifier = Modifier.height(25.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.x),
                contentDescription = "x",
                modifier = Modifier.size(100.dp))
            Image(painter = painterResource(id = R.drawable.facebook),
                contentDescription = "x",
                modifier = Modifier.size(100.dp))
            Image(painter = painterResource(id = R.drawable.gogg),
                contentDescription = "x",
                modifier = Modifier.size(100.dp))
        }



    }
}