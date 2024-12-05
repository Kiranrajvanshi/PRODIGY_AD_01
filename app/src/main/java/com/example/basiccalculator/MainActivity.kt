package com.example.basiccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val myButton: Button=findViewById(R.id.btnadd);
        val ed1:EditText=findViewById(R.id.ed1);
        val ed2:EditText=findViewById(R.id.ed2);
        val myBtnSub:Button=findViewById(R.id.btnsub);
        val myBtnMul:Button=findViewById(R.id.btnMul);
        val myBtnDiv:Button=findViewById(R.id.btnDiv);

        myButton.setOnClickListener{
            if(ed1.text.toString()!="" && ed2.text.toString()!=""){
            val nol=ed1.text.toString().toInt()
                val no2=ed2.text.toString().toInt()
                val sum=nol+no2
                Toast.makeText(this,"The sum is $sum",Toast.LENGTH_LONG).show();


            }
            else{
                Toast.makeText(this,"Please fill all the Required blanks.",Toast.LENGTH_LONG).show();

            }

        }
        //sub button coding here
        myBtnSub.setOnClickListener{
            if(ed1.text.toString()!="" && ed2.text.toString()!=""){
                val nol=ed1.text.toString().toInt()
                val no2=ed2.text.toString().toInt()
                val sub:Int
                if (nol>no2) {
                    sub=nol-no2
                }
                else {
                    sub=no2-nol
                }
                Toast.makeText(this,"The difference is $sub",Toast.LENGTH_LONG).show()


            }
            else{
                Toast.makeText(this,"Please fill all the Required blanks.",Toast.LENGTH_LONG).show()

            }

        }
        //coding of multi here

        myBtnMul.setOnClickListener{
            if(ed1.text.toString()!="" && ed2.text.toString()!=""){
                val nol=ed1.text.toString().toInt()
                val no2=ed2.text.toString().toInt()
                var mul=nol*no2


                Toast.makeText(this,"The Product is $mul",Toast.LENGTH_LONG).show()


            }
            else{
                Toast.makeText(this,"Please fill all the Required blanks.",Toast.LENGTH_LONG).show()

            }

        }
        // coding of div here

        myBtnDiv.setOnClickListener {
            if(ed1.text.toString()!="" && ed2.text.toString()!=""){
                val nol=ed1.text.toString().toInt()
                val no2=ed2.text.toString().toInt()
                var div=nol/no2
                if(no2==0) {
                    div = 0
                    Toast.makeText(this,"A number can't be divided by zero as produces infinite solution",Toast.LENGTH_LONG).show()
                }
                else {
                    div = nol / no2
                }



                Toast.makeText(this,"The division is $div",Toast.LENGTH_LONG).show()


            }
            else{
                Toast.makeText(this,"Please fill all the Required blanks.",Toast.LENGTH_LONG).show()
            }

        }
    }

}




