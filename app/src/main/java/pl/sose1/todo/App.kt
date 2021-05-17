package pl.sose1.todo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pl.sose1.core.di.coreModule
import pl.sose1.home.di.homeModule
import pl.sose1.login.di.loginModule
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        configureKoin()
        configureTimber()
    }

    private fun configureKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    homeModule,
                    coreModule,
                    loginModule,
                )
            )
        }
    }

    private fun configureTimber() {
        Timber.plant(Timber.DebugTree())
    }
}