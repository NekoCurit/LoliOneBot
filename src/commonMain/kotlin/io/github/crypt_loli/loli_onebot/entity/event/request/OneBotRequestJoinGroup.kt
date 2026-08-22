package io.github.crypt_loli.loli_onebot.entity.event.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OneBotRequestJoinGroup(
    @SerialName("user_id")
    val userId: Long,
    @SerialName("group_id")
    val groupId: Long,
    @SerialName("invitor_id")
    val invitorId: Long?,
    val comment: String
): OneBotRequestEvent()

