package com.example.contactsmanager.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDAO {

    // Insert data
    @Insert
    /**
     * A suspend function is used to execute a long running operation that
     * we have to wait for till its done... enable pause and starting option
     */
    suspend fun insertUser(user:User):Long

    // Update user
    suspend fun updateUser(user: User)

    // Delete data
    suspend fun deleteUser(user: User)

    // or use custom queries
    @Query("DELETE FROM user")
    suspend fun deleteAll()

    // Getting all user
    @Query("SELECT * FROM user")
    suspend fun getAllUsers():LiveData<List<User>>

}