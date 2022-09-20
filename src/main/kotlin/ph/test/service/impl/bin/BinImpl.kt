package ph.test.service.impl.bin

import io.smallrye.mutiny.Uni
import org.eclipse.microprofile.rest.client.inject.RestClient
import ph.test.service.ServiceInterface
import ph.test.service.impl.bin.model.BinResp
import javax.enterprise.context.ApplicationScoped
import ph.test.service.impl.bin.client.BinClient


@ApplicationScoped
class BinImpl ( @RestClient private val client: BinClient )
    : ServiceInterface {

    override fun identifyCardDetailsByID(cardNo: String): Uni<BinResp> = this.client.getCardDetailsByID(cardNo)
}

