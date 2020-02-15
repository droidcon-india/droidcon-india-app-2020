package `in`.co.droidcon

import `in`.co.droidcon.db.DroidConInDb
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.ios.NativeSqliteDriver

actual fun testDbConnection(): SqlDriver = NativeSqliteDriver(DroidConInDb.Schema, "DroidConInDb")