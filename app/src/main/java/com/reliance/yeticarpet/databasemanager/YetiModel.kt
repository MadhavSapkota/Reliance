package com.reliance.yeticarpet.databasemanager
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_yeti")
data class YetiModel(
    @PrimaryKey(autoGenerate = true) var tblId: Int = 0,
    @ColumnInfo(name = "carpetId") var carpetId: Int,
    @ColumnInfo(name = "carpetName")  var carpetName: String,
    @ColumnInfo(name = "carpetInfo") var carpetInfo:String)
