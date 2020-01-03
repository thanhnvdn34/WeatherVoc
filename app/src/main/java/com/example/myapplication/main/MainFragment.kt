package com.example.myapplication.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.models.ApiResponse
import com.example.myapplication.data.models.Sample


class MainFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list: MutableList<Sample> = arrayListOf()
        list.add(Sample("Mon", 20.0, 2, 80, 15.0, 25.0))
        list.add(Sample("Tue", 20.0, 2, 80, 15.0, 25.0))
        list.add(Sample("Wed", 20.0, 2, 80, 15.0, 25.0))
        list.add(Sample("Thu", 20.0, 2, 80, 15.0, 25.0))
        list.add(Sample("Fri", 20.0, 2, 80, 15.0, 25.0))
        viewManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        viewAdapter = ListDateRVAdapter(list)
        recyclerView = getView()!!.findViewById<RecyclerView>(R.id.rvPlayer).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

//        ////
//        val apiKey: String = "5e996f81ccc52c8cb14ccfacc2b7a87c"
//        val baseURL: String = "http://api.openweathermap.org/data/2.5/"
//        val retrofit: Retrofit = Retrofit.Builder()
//            .baseUrl(baseURL)
//            .addConverterFactory(GsonConverterFactory.create()).build()
//        val weatherService: WeatherService = retrofit.create(WeatherService::class.java)
//        val textView= view.findViewById<TextView>(R.id.txtTest)
//        weatherService.currentWeatherByCityName(
//            "London,uk",
//            units = "metric",
//            lang = "",
//            appId = apiKey
//        ).enqueue(object :
//            Callback<ApiResponse.CurrentResponse> {
//            override fun onFailure(call: Call<ApiResponse.CurrentResponse>, t: Throwable) {
//                Toast.makeText(view.context,"50/50", Toast.LENGTH_LONG).show()
//            }
//
//            override fun onResponse(
//                call: Call<ApiResponse.CurrentResponse>,
//                response: Response<ApiResponse.CurrentResponse>
//            ) {
//                if (response.isSuccessful) {
//                    textView.text = response.body()?.timeZone
//                }
//            }
//
//        })

    }

}
