package kz.home.bottomsheetnavigation

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentB : Fragment(R.layout.fragment_b) {
    private val args: FragmentBArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textViewB)
        textView.text = args.title
        textView.setOnClickListener {
            findNavController().navigate(FragmentBDirections.toFragmentA("Fragment A by Click"))
        }
    }
}