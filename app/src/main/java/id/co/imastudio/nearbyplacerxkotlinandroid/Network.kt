package id.co.imastudio.nearbyplacerxkotlinandroid

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


/**
 * Created by nandoseptianhusni on 2/18/18.
 */
object Network {

    var retrofit = Retrofit.Builder()
            .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
}

