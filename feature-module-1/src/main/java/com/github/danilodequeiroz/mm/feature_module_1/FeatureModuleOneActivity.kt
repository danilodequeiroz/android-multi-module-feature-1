package com.github.danilodequeiroz.mm.feature_module_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.danilodequeiroz.mm.feature_module_2.ui.MainActivity

class FeatureModuleOneActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        MainActivity::class.java
        super.onCreate(savedInstanceState)
    }

}