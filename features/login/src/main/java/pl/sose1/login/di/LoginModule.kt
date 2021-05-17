package pl.sose1.login.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import pl.sose1.login.ui.loginForm.LoginFormViewModel
import pl.sose1.login.ui.main.MainFragmentViewModel
import pl.sose1.login.ui.register.ConfirmCodeViewModel
import pl.sose1.login.ui.register.RegisterFormViewModel

val loginModule = module {
    viewModel { MainFragmentViewModel() }
    viewModel { LoginFormViewModel() }
    viewModel { RegisterFormViewModel() }
    viewModel { ConfirmCodeViewModel() }
}