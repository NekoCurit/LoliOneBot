package io.github.crypt_loli.loli_onebot.entity.event.request

import io.github.crypt_loli.loli_onebot.entity.event.OneBotEvent
import kotlinx.serialization.Serializable

@Serializable
open class OneBotRequestEvent(
    val flag: String = ""
): OneBotEvent()