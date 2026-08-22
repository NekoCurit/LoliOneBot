package io.github.crypt_loli.loli_onebot.entity.event.message

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OneBotPrivateMessageEvent(
    @SerialName("temp_source")
    val tempSource: Int = 0,
): OneBotMessageEvent()