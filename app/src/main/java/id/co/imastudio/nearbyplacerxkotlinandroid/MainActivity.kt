package id.co.imastudio.nearbyplacerxkotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import id.co.imastudio.nearbyplacerxkotlinandroid.model.ResponseServer
import id.co.imastudio.nearbyplacerxkotlinandroid.model.ResultsItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Network.service.getPlace()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ( {t: ResponseServer? ->

                    pindah(t?.results)

                    Log.d("data server : " ,t?.results.toString())
                   },
                        {e -> Log.d("Error : " ,e.localizedMessage)} )

    }

    private fun pindah(results: List<ResultsItem?>?) {
        recycler.adapter = RecyclerAdapter(results as List<ResultsItem>)
        recycler.layoutManager = LinearLayoutManager(this)
    }
}
