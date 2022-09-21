package ph.test.service

import io.smallrye.mutiny.Uni
import ph.test.service.impl.bin.model.*

interface ServiceInterface {
    fun getCardDetailsByID(cardNo: String?): Uni<BinResp>
    fun postNewCard(payload: BinResp?): Uni<BinResp>
}