package it.proxy.todocompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import it.proxy.todocompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}