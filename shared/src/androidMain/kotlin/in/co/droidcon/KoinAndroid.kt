package `in`.co.droidcon

import `in`.co.droidcon.db.DroidconInDb
import com.russhwolf.settings.AndroidSettings
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module = module {
    single<SqlDriver> {
        AndroidSqliteDriver(
            DroidconInDb.Schema,
            get(),
            "DroidConInDb"
        )
    }

    single { AndroidSettings.Factory(get()).create("KAMPSTARTER_SETTINGS") }
}