package ac.id.stmiklombok.siakad

import ac.id.stmiklombok.siakad.databinding.ActivityDashboardMahasiswaBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_mahasiswa)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationView = findNavController(R.id.fragments)

        bottomNavigation.setupWithNavController(navigationView)
    }
}