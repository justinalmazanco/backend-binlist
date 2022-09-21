package ph.test

import io.quarkus.vertx.web.Body
import io.quarkus.vertx.web.Param
import io.quarkus.vertx.web.Route
import io.smallrye.mutiny.Uni
import io.vertx.ext.web.RoutingContext
import ph.test.service.ServiceInterface
import ph.test.service.impl.bin.model.*
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.core.MediaType

@ApplicationScoped
class SampleResource(
    private val service: ServiceInterface,
) {

    @Route(
        path = "/postNewCard",
        methods = [Route.HttpMethod.POST],
        produces = [MediaType.APPLICATION_JSON],
        consumes = [MediaType.APPLICATION_JSON]
    )
    fun postNewCard(
        @Body payload: BinResp? = null,
        rc: RoutingContext
    ): Uni<BinResp> {

        return this.service.postNewCard(payload)
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
