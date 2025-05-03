package com.example.lazycolumns.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazycolumns.util.sampleUserList

@Composable
fun UserListScreen() {
    val users = sampleUserList()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("NIM: 2251550407111018", fontSize = 18.sp)
        Text("Nama: Dewi Rahmawati", fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(users) { user ->
                UserItem(user)
                Divider()
            }
        }
    }
}
