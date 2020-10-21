package nl.herika.level2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import nl.herika.level2task1.data.Place
import nl.herika.level2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val places = arrayListOf<Place>()
    private lateinit var binding: ActivityMainBinding
    private val placeAdapter = PlaceAdapter(places)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.DataList.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.DataList.adapter = placeAdapter;

        for (i in Place.PLACE_NAMES.indices) {
            places.add(Place(Place.PLACE_NAMES[i],        Place.PLACE_RES_DRAWABLE_IDS[i]))
        }

        placeAdapter.notifyDataSetChanged()
    }
}
