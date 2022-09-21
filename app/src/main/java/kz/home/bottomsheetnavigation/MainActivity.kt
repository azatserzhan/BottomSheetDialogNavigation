package kz.home.bottomsheetnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.showAButton).setOnClickListener{
            ContainerBottomSheetDialog(Destination.FRAGMENT_A).show(
                supportFragmentManager,
                ContainerBottomSheetDialog::class.java.name
            )
        }

        findViewById<Button>(R.id.showBButton).setOnClickListener{
            ContainerBottomSheetDialog(Destination.FRAGMENT_B).show(
                supportFragmentManager,
                ContainerBottomSheetDialog::class.java.name
            )
        }
    }
}