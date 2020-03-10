package com.example.findingyourvoice
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_menu.*
class Menu : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val myIntent1 = Intent(this, MainActivity::class.java)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }
    fun onNavigationItemsSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_workplace_safety -> {
                loadFirst(frag1 = FirstFragment())
            }
            R.id.nav_human_rights -> {
                loadSecond(frag2 = SecondFragment())
            }
            R.id.nav_employment_standards -> {
                loadThird(frag3 = ThirdFragment())
            }
            R.id.nav_occupational_health_and_safety -> {
                loadFourth(frag4 = FourthFragment())
            }
            R.id.nav_finding_your_voice -> {
                loadFifth(frag5= FifthFragment())
            }
            R.id.nav_resources -> {
                loadSixth(frag6= SixthFragment())
            }
            R.id.nav_disclaimer -> {
                loadSeventh(frag7= SeventhFragment())
            }
            R.id.nav_settings -> {
                loadEigth(frag8= EigthFragment())
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
    private fun loadFirst(frag1: FirstFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag1)
        fm.commit()
    }
    private fun loadSecond(frag2: SecondFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag2)
        fm.commit()
    }
    private fun loadThird(frag3: ThirdFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag3)
        fm.commit()
    }
    private fun loadFourth(frag4: FourthFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag4)
        fm.commit()
    }
    private fun loadFifth(frag5: FifthFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag5)
        fm.commit()
    }
    private fun loadSixth(frag6: SixthFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag6)
        fm.commit()
    }
    private fun loadSeventh(frag7: SeventhFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag7)
        fm.commit()
    }
    private fun loadEigth(frag8: EigthFragment) {
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.nav_host_fragment, frag8)
        fm.commit()
    }
}