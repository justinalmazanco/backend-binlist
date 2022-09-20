package ph.test

import io.quarkus.vertx.web.Param
import io.quarkus.vertx.web.Route
import io.smallrye.mutiny.Uni
import io.vertx.ext.web.RoutingContext
import ph.test.service.ServiceInterface
import ph.test.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.core.MediaType

@ApplicationScoped
class SampleResource (
    private val service: ServiceInterface,
) {
    @Route(
        path = "/identifyCardDetailsByID",
        methods = [Route.HttpMethod.GET],
        produces = [MediaType.APPLICATION_JSON]
    )
    fun identifyCardDetailsByID(
        @Param(value = "cardNo") id: String? = null,
        rc: RoutingContext
    ): Uni<BinResp> {
        return this.service.identifyCardDetailsByID("{cardNo}")
    }
}
