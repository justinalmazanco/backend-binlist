package ph.test.service

import io.smallrye.mutiny.Uni
import ph.test.service.impl.bin.model.BinResp

interface ServiceInterface {
    fun identifyCardDetailsByID(cardNo: String?): Uni<BinResp>
}