package ph.test.service

import io.smallrye.mutiny.Uni
import ph.test.service.impl.bin.model.BinResp

interface ServiceInterface {
//    fun requestToken(token: String): Uni<BinResp>
    fun introspect(token: String): Uni<BinResp>
}