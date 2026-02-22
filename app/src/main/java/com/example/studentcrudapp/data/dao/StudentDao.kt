package com.example.studentcrudapp.data.dao

import androidx.room.* //Insert all queries
import kotlinx.coroutines.flow.Flow //Fo handling Real time updates of the UI
import com.example.studentcrudapp.data.entity.Student

@Dao
interface StudentDao {
    @Query("SELECT * FROM student")
    fun getAllStudents(): Flow<List<Student>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Update
    suspend fun updateStudent(student: Student)

    @Delete
    suspend fun deleteStudent(student: Student)
}
