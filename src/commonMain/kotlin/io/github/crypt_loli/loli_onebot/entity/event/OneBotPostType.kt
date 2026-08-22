package io.github.crypt_loli.loli_onebot.entity.event

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class OneBotPostType {
    @SerialName("notice")
    Notice,
    @SerialName("message")
    Message,
    @SerialName("request")
    Request,
    @SerialName("meta_event")
    MetaEvent,

    Invalid
}