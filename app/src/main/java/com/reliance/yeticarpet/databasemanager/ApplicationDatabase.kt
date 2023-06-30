package com.reliance.yeticarpet.databasemanager
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [YetiModel::class],
    version = 4,
    exportSchema = false
)

abstract  class ApplicationDatabase : RoomDatabase(){
    abstract fun favoriteDao(): YetiDao
    companion object {
        private var newInstance: ApplicationDatabase? = null

        fun getDatabase(context: Context): ApplicationDatabase {
            return if (newInstance == null) {
                newInstance = Room.databaseBuilder(context, ApplicationDatabase::class.java, "yeticarpet")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
                newInstance!!
            } else
                newInstance!!
        }
    }
}