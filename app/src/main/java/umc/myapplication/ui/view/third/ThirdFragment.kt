package umc.myapplication.ui.view.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import umc.myapplication.R
import umc.myapplication.databinding.FragmentThirdBinding
import umc.myapplication.ui.base.BaseFragment
import umc.myapplication.ui.viewmodel.ThirdViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding, ThirdViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.fragment_third

    override val viewModel: ThirdViewModel by viewModel()

    override fun initAfterBinding() {
        TODO("Not yet implemented")
    }

    override fun initBeforeBinding() {
        TODO("Not yet implemented")
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

}