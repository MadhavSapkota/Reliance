package com.reliance.yeticarpet.app
import android.content.Context
import androidx.room.Room
import com.reliance.yeticarpet.databasemanager.ApplicationDatabase


import dagger.Module
import dagger.Provides

@Module
open class DatabaseModule {
    @AppScope
    @Provides
    fun provideDatabase(context: Context): ApplicationDatabase {
        return Room.databaseBuilder(context, ApplicationDatabase::class.java, "yeticarpet_db")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
    }
}