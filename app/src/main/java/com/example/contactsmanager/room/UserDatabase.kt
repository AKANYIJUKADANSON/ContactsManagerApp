package com.example.contactsmanager.room

import androidx.room.Database

@Database(entities = [User::class], version = 1)
abstract class UserDatabase {
    abstract val userDAO:UserDAO

    // singleton is a design pattern that creates one object every time on run
    
}