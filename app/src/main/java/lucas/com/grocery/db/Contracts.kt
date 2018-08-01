package lucas.com.grocery.db

import android.provider.BaseColumns

val DATABASE_NAME = "grocery.db"
val DATABASE_VERSION = 10

object DataEntry : BaseColumns {
    val TABLE_NAME = "product"
    val ID_COl = "id"
    val NAME_COL = "name"
    val DESC_COL = "description"
    val IMAGE = "image"
}