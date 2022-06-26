package com.hariom.noteapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class RegisterFragment : Fragment() {
    val TAG = "Lifecycle RegisterFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val textRedirect = view.findViewById<TextView>(R.id.txtRedirect)
        textRedirect.setOnClickListener {
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
        Log.d(TAG, "onCreateView() ")
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() ")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated() ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored() ")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() ")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() ")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState() ")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach() ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach() ")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() ")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() ")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() ")
    }

}