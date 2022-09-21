package ph.test.service.impl.bin

import com.google.gson.Gson
import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RestClient
import ph.test.service.ServiceInterface
import javax.enterprise.context.ApplicationScoped
import ph.test.service.impl.bin.client.BinClient
import ph.test.service.impl.bin.model.*


@ApplicationScoped
class BinImpl( @RestClient private val client: BinClient ) : ServiceInterface {

    override fun getCardDetailsByID(cardNo: String?): Uni<BinResp> = this.client.readCardDetailsByID(cardNo)

    override fun postNewCard(payload: BinResp?): Uni<BinResp> = this.client.createNewCard(payload) //{

//        val length = payload?.number?.length
//        val luhn = payload?.number?.luhn
//        val scheme = payload?.scheme
//        val type = payload?.type
//        val brand = payload?.brand
//        val prepaid = payload?.prepaid
//        val longitude = payload?.country?.longitude
//        val latitude = payload?.country?.latitude
//        val name = payload?.country?.name
//        val alpha2 = payload?.country?.alpha2
//        val numeric = payload?.country?.numeric
//        val emoji = payload?.country?.emoji
//        val currency = payload?.country?.currency
//        val url = payload?.bank?.url
//        val name2 = payload?.bank?.name
//        val city = payload?.bank?.city
//        val phone = payload?.bank?.phone
//
//        return this.client.createNewCard(
//            length,
//            luhn,
//            scheme,
//            type,
//            brand,
//            prepaid,
//            longitude,
//            latitude,
//            name,
//            alpha2,
//            numeric,
//            emoji,
//            currency,
//            url,
//            name2,
//            city,
//            phone
//        )

//        var gson = Gson()
//        var jsonString = gson.toJson(payload)
//
//        return this.client.createNewCard(jsonString)

//        return this.client.createNewCard(payload)
//    }
}

