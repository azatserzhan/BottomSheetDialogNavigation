package kz.home.bottomsheetnavigation

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentA : Fragment(R.layout.fragment_a) {

    private val args: FragmentAArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textView)

        textView.text = args.title
        textView.setOnClickListener {
            findNavController().navigate(FragmentADirections.toFragmentB("Fragment B by Click"))
        }
    }
}