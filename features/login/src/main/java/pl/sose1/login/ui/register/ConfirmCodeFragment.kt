package pl.sose1.login.ui.register

import org.koin.android.viewmodel.ext.android.viewModel
import pl.sose1.base.view.BaseFragment
import pl.sose1.login.R
import pl.sose1.login.databinding.FragmentConfirmCodeBinding


class ConfirmCodeFragment : BaseFragment<FragmentConfirmCodeBinding, ConfirmCodeViewModel>(layoutId = R.layout.fragment_confirm_code) {
    override val viewModel by viewModel<ConfirmCodeViewModel>()

    override fun onInitDataBinding() {
        binding.viewModel = viewModel
    }
}