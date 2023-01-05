package umc.myapplication.ui.view

import android.graphics.Color
import android.view.View
import umc.myapplication.R
import umc.myapplication.databinding.ActivityMainBinding
import umc.myapplication.ui.base.BaseActivity
import umc.myapplication.ui.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import umc.myapplication.ui.view.first.FirstFragment
import umc.myapplication.ui.view.fourth.FourthFragment
import umc.myapplication.ui.view.second.SecondFragment
import umc.myapplication.ui.view.third.ThirdFragment

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.activity_main

    override val viewModel: MainViewModel by viewModel()

    private val firstFragment: FirstFragment by lazy { FirstFragment() }
    private val secondFragment: SecondFragment by lazy { SecondFragment() }
    private val thirdFragment: ThirdFragment by lazy { ThirdFragment() }
    private val fourthFragment: FourthFragment by lazy { FourthFragment() }

    override fun initAfterBinding() {}

    override fun initBeforeBinding() {}

    override fun initView() {
        initToolBar()
        initBottomNavigation()
        replacePage1()
    }

    private fun initToolBar() {
        setSupportActionBar(binding.tbMain)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun initBottomNavigation() {
        binding.bnvMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_page1 -> {
                    replacePage1()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_page2 -> {
                    replacePage2()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_page3 -> {
                    replacePage3()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_page4 -> {
                    replacePage4()
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }
    }

    private fun replacePage1() {
        supportFragmentManager.popBackStack()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, firstFragment)
        binding.tvTitle.text = getString(R.string.menu_one)
        binding.tvTitle.visibility = View.VISIBLE
        binding.tvTitle.setTextColor(Color.BLACK)
    }

    private fun replacePage2() {
        supportFragmentManager.popBackStack()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, secondFragment)
        binding.tvTitle.text = getString(R.string.menu_two)
        binding.tvTitle.visibility = View.VISIBLE
        binding.tvTitle.setTextColor(Color.BLACK)
    }

    private fun replacePage3() {
        supportFragmentManager.popBackStack()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, thirdFragment)
        binding.tvTitle.text = getString(R.string.menu_three)
        binding.tvTitle.visibility = View.VISIBLE
        binding.tvTitle.setTextColor(Color.BLACK)
    }

    private fun replacePage4() {
        supportFragmentManager.popBackStack()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, fourthFragment)
        binding.tvTitle.text = getString(R.string.menu_four)
        binding.tvTitle.visibility = View.VISIBLE
        binding.tvTitle.setTextColor(Color.BLACK)
    }
}