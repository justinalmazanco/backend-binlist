package ph.test.service.impl.bin.client

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import ph.test.service.impl.bin.model.BinResp
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@RegisterRestClient(configKey = "bin-service")
interface BinClient {
//https://lookup.binlist.net/45717360

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getCardDetailsByID (@PathParam("id") id : String?) : Uni<BinResp>
}