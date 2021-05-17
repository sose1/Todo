package pl.sose1.login.ui.register

import androidx.lifecycle.ViewModel
import pl.sose1.base.SingleLiveData

class RegisterFormViewModel : ViewModel() {
    val events = SingleLiveData<RegisterFormViewEvent>()

    fun signUp() {
        events.value = RegisterFormViewEvent.OpenConfirmCodeFragment
    }

    sealed class RegisterFormViewEvent {
            object OpenConfirmCodeFragment : RegisterFormViewEvent()
    }
}