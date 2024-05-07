package da.gavrilova

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart = findViewById<Button>(R.id.btnStart)
        val textViewOperand = findViewById<TextView>(R.id.ZeroZero1)
        val textViewEqulars = findViewById<TextView>(R.id.txtEqulars)
        val textViewResult = findViewById<TextView>(R.id.txtResult)


        buttonStart.setOnClickListener {
            val operatorList = listOf('+', '-', '*', '/')
            val operator = operatorList[Random.nextInt(operatorList.size)]
            val num1 = Random.nextInt(90) + 10 // Генерирует число от 10 до 99
            val num2 = Random.nextInt(90) + 10 // Генерирует число от 10 до 99

            textViewOperand.text = "$num1 $operator $num2"
        }
    }
}
