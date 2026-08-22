package io.github.crypt_loli.loli_onebot.entity.event.message

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OneBotGroupMessageEvent(
    @SerialName("group_id")
    val groupId: Long,
): OneBotMessageEvent()