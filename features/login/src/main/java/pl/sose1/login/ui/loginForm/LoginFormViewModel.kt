package pl.sose1.login.ui.loginForm

import androidx.lifecycle.ViewModel
import pl.sose1.base.SingleLiveData

class LoginFormViewModel : ViewModel() {
    val events = SingleLiveData<LoginFormFragmentViewEvent>()

    fun signIn() {

    }

    fun openRegisterFormFragment() {
        events.value = LoginFormFragmentViewEvent.OpenRegisterFormFragment
    }
    sealed class LoginFormFragmentViewEvent {
        object OpenRegisterFormFragment : LoginFormFragmentViewEvent()
    }
}