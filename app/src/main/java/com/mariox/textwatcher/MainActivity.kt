package com.mariox.textwatcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//       altura.addTextChangedListener(object :TextWatcher {
//           override fun afterTextChanged(s: Editable?) {
//
//              tv_h.text = s.toString()
//
//           }
//
//           override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//           }
//
//           override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//           }
//
//       })
//
//
//
//       base.addTextChangedListener(object :TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//
//                tv_base.text = s.toString()
//
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//            }
//
//        })

          // aqui llamamos al TextWatcher con la clase personalizada 'CustomTextWatcher' para cada TextView
          altura.addTextChangedListener(CustomTextWatcher(tv_h))
          base.addTextChangedListener(CustomTextWatcher(tv_base))


        //cálculp de area del triangulo
        calcular.setOnClickListener { view ->

            val base: Float = base.text.toString().toFloat()
            val altura: Float = altura.text.toString().toFloat()

            tv_resultado.text = (base*altura/2).toString()
        }



    }

   // clase personalizada para el TextWatcher ( se puede usar para varios textView)
    private class CustomTextWatcher(private val miTextView: TextView) : TextWatcher {

        override fun afterTextChanged(s: Editable?) {

            miTextView.text = s.toString()

        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }

    }






}