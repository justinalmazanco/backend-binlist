package ph.test

import io.quarkus.vertx.web.Param
import io.quarkus.vertx.web.Route
import io.smallrye.mutiny.Uni
import io.vertx.ext.web.RoutingContext
import ph.test.service.ServiceInterface
import ph.test.service.impl.bin.model.BinBank
import ph.test.service.impl.bin.model.BinCountry
import ph.test.service.impl.bin.model.BinNumber
import ph.test.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.core.MediaType

@ApplicationScoped
class SampleResource (
    private val service: ServiceInterface,
    private val data: BinResp,
    private val data2: BinNumber,
    private val data3: BinCountry,
    private val data4: BinBank
) {
    @Route(
        path = "/postNewCard",
        methods = [Route.HttpMethod.POST],
        produces = [MediaType.APPLICATION_JSON],
        consumes = [MediaType.APPLICATION_JSON]
    )
    fun postNewCard(
//        @Param(value = "cardNo") id: String? = null,
        rc: RoutingContext
    ): Uni<BinResp> {
//        val requestData = BinResp(
//            number = BinNumber(
//                length = 10,
//                luhn = true
//            ),
//
//            prepaid = false,
//
//            bank = BinBank(
//                name = "Jyske Bank",
//                url = "www.jyskebank.dk",
//                phone = "+4589893300",
//                city = "Hjørring"
//            )
//        )
        return this.service.postNewCard(
            data.scheme,
            data.bank,
            data.brand,
            data.country,
            data.number,
            data.prepaid,
            data.type,
            data2.length,
            data2.luhn,
            data3.numeric,
            data3.alpha2,
            data3.name,
            data3.emoji,
            data3.currency,
            data3.latitude,
            data3.longitude,
            data4.name,
            data4.url,
            data4.phone,
            data4.city
        )
    }

    @Route(
//        path = "/getCardDetailsByID",
        path = "/getCardDetailsByID/:cardNo",
        methods = [Route.HttpMethod.GET],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun getCardDetailsByID(
        @Param(value = "cardNo") id: String? = null,
        rc: RoutingContext
    ): Uni<BinResp> {
        return this.service.getCardDetailsByID(id)
    }
}
