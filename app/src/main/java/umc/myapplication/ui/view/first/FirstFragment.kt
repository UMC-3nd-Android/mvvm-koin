package umc.myapplication.ui.view.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.viewModel
import umc.myapplication.R
import umc.myapplication.databinding.FragmentFirstBinding
import umc.myapplication.ui.base.BaseFragment
import umc.myapplication.ui.viewmodel.FirstViewModel

class FirstFragment : BaseFragment<FragmentFirstBinding, FirstViewModel>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_first
    override val viewModel: FirstViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun initAfterBinding() {
        TODO("Not yet implemented")
    }

    override fun initBeforeBinding() {
        TODO("Not yet implemented")
    }
}