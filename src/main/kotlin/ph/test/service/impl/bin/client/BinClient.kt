package ph.test.service.impl.bin.client

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import ph.test.service.impl.bin.model.*
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@RegisterRestClient(configKey = "bin-service")
interface BinClient {
//https://lookup.binlist.net/45717360

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun readCardDetailsByID(@PathParam("id") id: String?) : Uni<BinResp>

    @POST
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun createNewCard(payload: BinResp?): Uni<BinResp>

//    fun createNewCard(
//        length: Int?,
//        luhn: Boolean?,
//        scheme: String?,
//        type: String?,
//        brand: String?,
//        prepaid: Boolean?,
//        longitude: Int?,
//        latitude: Int?,
//        name: String?,
//        alpha2: String?,
//        numeric: String?,
//        emoji: String?,
//        currency: String?,
//        url: String?,
//        name2: String?,
//        city: String?,
//        phone: String?
//    ): Uni<BinResp>

//    fun createNewCard(payload: String): Uni<BinResp>
}