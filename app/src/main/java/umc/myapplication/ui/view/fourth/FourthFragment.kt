package umc.myapplication.ui.view.fourth

import android.os.Bundle import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.viewModel
import umc.myapplication.R
import umc.myapplication.databinding.FragmentFourthBinding
import umc.myapplication.ui.base.BaseFragment
import umc.myapplication.ui.viewmodel.FourthViewModel

class FourthFragment : BaseFragment<FragmentFourthBinding, FourthViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.fragment_fourth

    override val viewModel: FourthViewModel by viewModel()

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
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }
}