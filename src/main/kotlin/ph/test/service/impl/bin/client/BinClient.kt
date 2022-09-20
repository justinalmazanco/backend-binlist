package ph.test.service.impl.bin.client

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import ph.test.service.impl.bin.model.BinResp
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

//@RestClient
@RegisterRestClient(configKey = "bin-service")
interface BinClient {
//REST requests

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun getCardDetailsByID (@PathParam("id") id : String) : Uni<BinResp>
}