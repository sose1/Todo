package pl.sose1.login.ui.main

import androidx.navigation.fragment.NavHostFragment
import org.koin.android.viewmodel.ext.android.viewModel
import pl.sose1.base.view.BaseFragment
import pl.sose1.login.R
import pl.sose1.login.databinding.FragmentMainBinding
import pl.sose1.login.ui.main.MainFragmentViewModel.MainFragmentViewEvent

class MainFragment : BaseFragment<FragmentMainBinding, MainFragmentViewModel>(layoutId = R.layout.fragment_main) {
    override val viewModel by viewModel<MainFragmentViewModel>()

    override fun onInitDataBinding() {
        binding.viewModel = viewModel

        viewModel.events.observe(viewLifecycleOwner, this::onViewEvent)
    }

    private fun onViewEvent(event: MainFragmentViewEvent) {
        when (event) {
            MainFragmentViewEvent.OpenLoginFormFragment -> openLoginFormFragment()
        }
    }

    private fun openLoginFormFragment() {
        NavHostFragment.findNavController(this).navigate(R.id.mainFragmentToLoginFormFragment)
    }
}