package ph.test.service.impl.bin.client

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import ph.test.service.impl.bin.model.BinBank
import ph.test.service.impl.bin.model.BinCountry
import ph.test.service.impl.bin.model.BinNumber
import ph.test.service.impl.bin.model.BinResp
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
    fun createNewCard(
        scheme: String?,
        bank: BinBank?,
        brand: String?,
        country: BinCountry?,
        number: BinNumber?,
        prepaid: Boolean?,
        type: String?,
        length: Int?,
        luhn: Boolean?,
        numeric: String?,
        alpha2: String?,
        name: String?,
        emoji: String?,
        currency: String?,
        latitude: Int?,
        longitude: Int?,
        name2: String?,
        url: String?,
        phone: String?,
        city: String?
    ): Uni<BinResp>
}