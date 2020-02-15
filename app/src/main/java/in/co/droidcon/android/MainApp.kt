package `in`.co.droidcon.android

import android.app.Application
import android.content.Context
import `in`.co.droidcon.initKoin
import org.koin.dsl.module

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            modules(module { single<Context> { this@MainApp } })
        }
    }
}