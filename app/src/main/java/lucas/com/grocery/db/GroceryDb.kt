package lucas.com.grocery.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class GroceryDb(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    private val SQL_CREATE_ENTRIES = "CREATE TABLE ${DataEntry.TABLE_NAME} (" +
            "${DataEntry.ID_COl} INTEGER PRIMARY KEY," +
            "${DataEntry.NAME_COL} TEXT," +
            "${DataEntry.DESC_COL} TEXT," +
            "${DataEntry.IMAGE} BLOB" + ")"

    private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${DataEntry.TABLE_NAME}"

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }
}