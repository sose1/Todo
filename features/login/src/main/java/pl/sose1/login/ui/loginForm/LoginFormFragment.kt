package pl.sose1.login.ui.loginForm

import androidx.navigation.fragment.NavHostFragment
import org.koin.android.viewmodel.ext.android.viewModel
import pl.sose1.base.view.BaseFragment
import pl.sose1.login.R
import pl.sose1.login.databinding.FragmentLoginFormBinding
import pl.sose1.login.ui.loginForm.LoginFormViewModel.LoginFormFragmentViewEvent

class LoginFormFragment : BaseFragment<FragmentLoginFormBinding, LoginFormViewModel>(layoutId = R.layout.fragment_login_form) {
    override val viewModel by viewModel<LoginFormViewModel>()

    override fun onInitDataBinding() {
        binding.viewModel = viewModel

        viewModel.events.observe(viewLifecycleOwner, this::onViewEvent)
    }

    private fun onViewEvent(event: LoginFormFragmentViewEvent) {
        when (event) {
            LoginFormFragmentViewEvent.OpenRegisterFormFragment -> openRegisterFormFragment()
        }
    }

    private fun openRegisterFormFragment() {
        NavHostFragment.findNavController(this).navigate(R.id.loginFormFragmentToRegisterFormFragment)
    }
}