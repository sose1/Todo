package pl.sose1.login.ui.register

import androidx.navigation.fragment.NavHostFragment
import org.koin.android.viewmodel.ext.android.viewModel
import pl.sose1.base.view.BaseFragment
import pl.sose1.login.R
import pl.sose1.login.databinding.FragmentRegisterFormBinding
import pl.sose1.login.ui.register.RegisterFormViewModel.RegisterFormViewEvent

class RegisterFormFragment : BaseFragment<FragmentRegisterFormBinding, RegisterFormViewModel>(layoutId = R.layout.fragment_register_form) {
    override val viewModel by viewModel<RegisterFormViewModel>()

    override fun onInitDataBinding() {
        binding.viewModel = viewModel

        viewModel.events.observe(viewLifecycleOwner, this::onViewEvent)
    }

    private fun onViewEvent(event: RegisterFormViewEvent) {
        when (event) {
            RegisterFormViewEvent.OpenConfirmCodeFragment -> openConfirmCodeFragment()
        }
    }

    private fun openConfirmCodeFragment() {
        NavHostFragment.findNavController(this).navigate(R.id.registerFormFragmentToConfirmCodeFragment)
    }
}