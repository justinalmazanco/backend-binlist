package ph.test.service.impl.bin

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RestClient
import ph.test.service.ServiceInterface
import ph.test.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped
import ph.test.service.impl.bin.client.BinClient
import ph.test.service.impl.bin.model.BinBank
import ph.test.service.impl.bin.model.BinCountry
import ph.test.service.impl.bin.model.BinNumber


@ApplicationScoped
class BinImpl( @RestClient private val client: BinClient ) : ServiceInterface {

    override fun getCardDetailsByID(cardNo: String?): Uni<BinResp> = this.client.readCardDetailsByID(cardNo)

    override fun postNewCard(
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
    ): Uni<BinResp> = this.client.createNewCard(
        scheme,
        bank,
        brand,
        country,
        number,
        prepaid,
        type,
        length,
        luhn,
        numeric,
        alpha2,
        name,
        emoji,
        currency,
        latitude,
        longitude,
        name2,
        url,
        phone,
        city
    )
}

