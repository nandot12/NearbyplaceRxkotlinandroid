package id.co.imastudio.nearbyplacerxkotlinandroid

import id.co.imastudio.nearbyplacerxkotlinandroid.model.ResponseServer
import id.co.imastudio.nearbyplacerxkotlinandroid.model.ResultsItem
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by nandoseptianhusni on 2/18/18.
 */
interface ApiService {

    @GET("json?location=-7.0511601,110.4321671" +
            "&radius=500&type=restaurant" +
            "&key=AIzaSyCemxMWDrcjiuQZywCpMVK7mrijHHf5Y7c")
    fun getPlace():Observable<ResponseServer>

}