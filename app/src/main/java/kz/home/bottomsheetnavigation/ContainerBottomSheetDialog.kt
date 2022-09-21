package kz.home.bottomsheetnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavArgument
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

private const val TITLE = "title"

class ContainerBottomSheetDialog(
    private val destination: Destination
) : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.dialog_container, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavGraph()
    }

    private fun setupNavGraph() {
        val navHostFragment =
            childFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val graph = navHostFragment.navController.navInflater.inflate(R.navigation.main_graph)
        val startDestinationId = when (destination) {
            Destination.FRAGMENT_A -> R.id.fragmentA
            Destination.FRAGMENT_B -> R.id.fragmentB
        }

        graph.addArgument(TITLE, NavArgument.Builder().setDefaultValue(destination.title).build())
        graph.setStartDestination(startDestinationId)
        navController.graph = graph
    }
}