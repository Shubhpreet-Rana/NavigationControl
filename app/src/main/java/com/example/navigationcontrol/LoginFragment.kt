package com.example.navigationcontrol

import android.os.Bundle
import android.os.UserHandle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcontrol.databinding.FragmentLoginBinding
import com.example.navigationcontrol.databinding.FragmentWelcomeBinding

class LoginFragment:Fragment(R.layout.fragment_login) {

    private var _binding : FragmentLoginBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSubmit.setOnClickListener {
            binding.apply {
                val Username = editTextUsername.text.toString()
                val Password = editTextPassword.text.toString()
                val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(Username , Password)
                findNavController().navigate(action)
            }
        }
    }
}