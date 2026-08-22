package io.github.crypt_loli.loli_onebot.entity.api.message

import io.github.crypt_loli.loli_onebot.entity.api.ApiBase
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiMessageGet(
    val action: String = "get_msg",
    val params: Params
): ApiBase() {
    @Serializable
    data class Params(
        @SerialName("message_id")
        val groupId: Long
    )
}