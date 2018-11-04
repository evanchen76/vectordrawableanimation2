package evan.chen.tutorial.vectordrawableanimation2

import android.graphics.drawable.Animatable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        anim_triangle.setOnClickListener {
            val drawable = anim_triangle.drawable
            (drawable as Animatable).start()
        }
    }
}
