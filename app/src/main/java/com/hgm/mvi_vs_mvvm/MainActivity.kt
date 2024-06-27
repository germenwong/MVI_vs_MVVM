package com.hgm.mvi_vs_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.hgm.mvi_vs_mvvm.ui.theme.MVI_vs_MVVMTheme

class MainActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                  MVI_vs_MVVMTheme {

                  }
            }
      }
}
