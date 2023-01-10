package umc.myapplication.ui.view.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import umc.myapplication.R
import umc.myapplication.databinding.FragmentSecondBinding
import umc.myapplication.ui.base.BaseFragment
import umc.myapplication.ui.viewmodel.SecondViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : BaseFragment<FragmentSecondBinding, SecondViewModel>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_second

    override val viewModel: SecondViewModel by viewModel()

    override fun initAfterBinding() {
    }

    override fun initBeforeBinding() {
    }

    override fun initView() {
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
}