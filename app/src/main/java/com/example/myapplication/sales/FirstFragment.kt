package com.example.myapplication.sales

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDirections
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private lateinit var viewModel: FirstFragmentViewModel
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val root: View = binding.getRoot()

        viewModel = ViewModelProvider(this).get(FirstFragmentViewModel::class.java)
        viewModel.FirstFragmentViewModelInit(context)
        viewModel.allContactList.observe(viewLifecycleOwner,
            Observer<ContactModel?> {   //set up rv
                 Log.e("model", it?.userlist?.size.toString())
            })

        return root;
    }


}