package vitor.avellar.github.criptomonitor.service

import retrofit2.Response
import retrofit2.http.GET
import vitor.avellar.github.criptomonitor.model.TickerResponse

interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}