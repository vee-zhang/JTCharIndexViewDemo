package com.william.charindexviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.william.charindexview.CharIndexView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,CharIndexView.OnCharIndexChangedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val labels = charArrayOf('#','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

        this.civ.setCHARS(labels)
        this.civ.requestLayout()

        this.civ.setOnCharIndexChangedListener(this)
        this.civ.invalidate()
    }


    override fun onCharIndexSelected(currentIndex: String?) {
        Toast.makeText(this,"点击了"+currentIndex,Toast.LENGTH_SHORT).show()
    }
}
