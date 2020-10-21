package nl.herika.level2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nl.herika.level2task1.data.Place
import nl.herika.level2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
