package com.ysn.navigationarchcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // basic example
        // way 1
        /*val s = Navigation.createNavigateOnClickListener(R.id.action_blankFragment_to_otherFragment)
        val button = view.findViewById<Button>(R.id.button_frag1)
        button.setOnClickListener(s)*/

        // way 2
        /*val navController = Navigation.findNavController(activity!!, R.id.nav_host_fragment)
        button.setOnClickListener {
            navController.navigate(R.id.action_blankFragment_to_otherFragment)
        }*/

        // way 3
        /*val navDirections = BlankFragmentDirections.actionBlankFragmentToOtherFragment()
        val navController = Navigation.findNavController(activity!!, R.id.nav_host_fragment)
        button.setOnClickListener {
            navController.navigate(navDirections)
        }*/

        // with argument
        val bundle = Bundle()
        bundle.putString("test_string", "hello world from previous screen")
        val s = Navigation.createNavigateOnClickListener(R.id.action_blankFragment_to_otherFragment, bundle)
        val button = view.findViewById<Button>(R.id.button_frag1)
        button.setOnClickListener(s)
    }

}
