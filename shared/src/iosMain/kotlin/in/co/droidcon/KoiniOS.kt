package `in`.co.droidcon

import `in`.co.droidcon.db.DroidconInDb
import com.russhwolf.settings.AppleSettings
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.ios.NativeSqliteDriver
import org.koin.dsl.module

fun initKoin() = `in`.co.droidcon.initKoin {}
actual val platformModule = module {
    single<SqlDriver> { NativeSqliteDriver(DroidconInDb.Schema, "DroidConInDb") }
    single { AppleSettings.Factory().create("KAMPSTARTER_SETTINGS") }
}