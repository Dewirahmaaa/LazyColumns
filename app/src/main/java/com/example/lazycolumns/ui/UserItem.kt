package com.example.lazycolumns.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazycolumns.data.User

@Composable
fun UserItem(user: User) {
    // Wrapper untuk memberikan padding dan border di sekitar setiap item
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Nama pengguna
            Text(
                text = user.name,
                style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            // Username pengguna
            Text(
                text = "@${user.username}",
                style = MaterialTheme.typography.subtitle1.copy(color = Color.Gray),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Email pengguna
            Text(
                text = "Email: ${user.email}",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Telepon pengguna
            Text(
                text = "Phone: ${user.phone}",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Alamat pengguna
            Text(
                text = "Alamat: ${user.address.street}, ${user.address.suite}, ${user.address.city}, ${user.address.zipcode}",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Geo (Latitude dan Longitude)
            Text(
                text = "Latitude: ${user.address.geo.lat}, Longitude: ${user.address.geo.lng}",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Website pengguna
            Text(
                text = "Website: ${user.website}",
                style = MaterialTheme.typography.body2.copy(color = Color.Blue),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Nama perusahaan pengguna
            Text(
                text = "Perusahaan: ${user.company.name}",
                style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Catchphrase perusahaan
            Text(
                text = "Catchphrase: ${user.company.catchPhrase}",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Bisnis perusahaan
            Text(
                text = "Bisnis: ${user.company.bs}",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}
