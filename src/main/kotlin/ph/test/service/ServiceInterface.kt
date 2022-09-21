package ph.test.service

import io.smallrye.mutiny.Uni
import ph.test.service.impl.bin.model.BinBank
import ph.test.service.impl.bin.model.BinCountry
import ph.test.service.impl.bin.model.BinNumber
import ph.test.service.impl.bin.model.BinResp

interface ServiceInterface {
    fun getCardDetailsByID(cardNo: String?): Uni<BinResp>
    fun postNewCard(
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