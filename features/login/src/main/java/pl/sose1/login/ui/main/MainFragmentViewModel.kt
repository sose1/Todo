package pl.sose1.login.ui.main

import androidx.lifecycle.ViewModel
import pl.sose1.base.SingleLiveData

class MainFragmentViewModel : ViewModel() {
    val events = SingleLiveData<MainFragmentViewEvent>()

    fun openLoginFormFragment() {
        events.value = MainFragmentViewEvent.OpenLoginFormFragment
    }

    fun loginWithGoogle() {}

    sealed class MainFragmentViewEvent {
        object OpenLoginFormFragment : MainFragmentViewEvent()
    }
}