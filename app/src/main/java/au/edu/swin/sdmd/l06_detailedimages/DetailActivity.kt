package au.edu.swin.sdmd.l06_detailedimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import l06_detailedimages.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // process the data passed in
        /*version 1.0: pass primitive values
        val vName = findViewById<TextView>(R.id.name)
        val name = intent.getStringExtra("name")
        vName.text = name

        val vAuthor = findViewById<TextView>(R.id.author)
        val author = intent.getStringExtra("author")
        vAuthor.text = author
        */

        /**
         * version 2.0: pass Parcelizable object
         */
        val location = intent.getParcelableExtra<Location>("location")

        location?.let {
            val vName = findViewById<TextView>(R.id.name)
            vName.text = it.name

            val vAuthor = findViewById<TextView>(R.id.author)
            vAuthor.text = it.author
        }
    }
}