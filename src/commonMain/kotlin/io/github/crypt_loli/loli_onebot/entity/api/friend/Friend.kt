package io.github.crypt_loli.loli_onebot.entity.api.friend

import io.github.crypt_loli.loli_onebot.entity.api.ApiBase
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiFriendList(
    val action: String = "get_friend_list"
): ApiBase()

@Serializable
data class ApiFriendDelete(
    val params: Params,
    val action: String = "delete_friend"
): ApiBase() {
    @Serializable
    data class Params(
        @SerialName("user_id")
        val userId: Long,
        val block: Boolean
    )
}