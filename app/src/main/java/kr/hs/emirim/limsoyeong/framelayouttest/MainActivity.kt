package kr.hs.emirim.limsoyeong.framelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    lateinit var btn2: Button
    lateinit var btn3:Button
    lateinit var l1:LinearLayout
    lateinit var l2:LinearLayout
    lateinit var l3:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        l1 = findViewById(R.id.l1)
        l2 = findViewById(R.id.l2)
        l3 = findViewById(R.id.l3)
        btn1.setOnClickListener(btnListener)
        btn2.setOnClickListener(btnListener)
        btn3.setOnClickListener(btnListener)

    }

    var btnListener = OnClickListener{
        l1.visibility = View.INVISIBLE
        l2.visibility = View.INVISIBLE
        l3.visibility = View.INVISIBLE

        when(it.id){
            R.id.btn1 -> l1.visibility = View.VISIBLE
            R.id.btn2 -> l2.visibility = View.VISIBLE
            R.id.btn3 -> l3.visibility = View.VISIBLE
        }
    }

}