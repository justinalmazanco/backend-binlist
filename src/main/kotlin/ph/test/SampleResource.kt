package ph.test

import io.opentracing.Tracer
import io.quarkus.vertx.web.Header
import io.quarkus.vertx.web.Param
import io.quarkus.vertx.web.Route
import io.smallrye.mutiny.Uni
import io.vertx.ext.web.RoutingContext
import org.eclipse.microprofile.rest.client.inject.RestClient
import ph.test.service.ServiceInterface
import ph.test.service.impl.bin.model.BinBank
import ph.test.service.impl.bin.model.BinNumber
import ph.test.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.core.MediaType


@ApplicationScoped
class SampleResource (
    private val service: ServiceInterface,
) { //"https://lookup.binlist.net/45717360"
//    @Route(
//        path = "/token",
//        methods = [Route.HttpMethod.POST],
//        produces = [MediaType.APPLICATION_JSON],
//        consumes = [MediaType.APPLICATION_JSON]
//    )
//    fun token(
//        @Param(value = "id") id: String? = null,
//        rc: RoutingContext
//    ): Uni<BinResp> {
//        return Uni.createFrom().voidItem().onItem()
//            .invoke { _ ->
//                this.log.apiRequest(rc = rc)
//            }
//            .flatMap { _ ->
//                this.service.requestToken(token, grantType)
//            }
//    }

    @Route(
        path = "/introspect",
        methods = [Route.HttpMethod.GET],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun introspect(
        @Param(value = "id") id: String? = null,
        rc: RoutingContext
    ): Uni<BinResp> {
//        val resp = BinResp(
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
//
//        return Uni.createFrom().item(resp)
    }
}
