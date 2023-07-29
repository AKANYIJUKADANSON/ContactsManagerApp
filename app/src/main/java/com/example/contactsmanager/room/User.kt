package com.example.contactsmanager.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
// If you dont specify the table name, then android takes the class name as the default table name
data class User(

    // Make the room db to autogenerate a primarykey
    @PrimaryKey(autoGenerate = true)

    // Creating the column using columnInfo
    @ColumnInfo(name = "user_id")
    val id :Int,

    @ColumnInfo(name = "user_name")
    val name:String,

    @ColumnInfo(name = "user_email")
    val email:String
)
