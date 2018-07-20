package cubex.mahesh.toolbarandmenu

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tBar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        b1.setOnClickListener({
            startActivity(Intent(this@MainActivity,
                    NextActivity::class.java))
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
      menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        Toast.makeText(this, item!!.title,
                Toast.LENGTH_LONG).show()

        return super.onOptionsItemSelected(item)
    }



}