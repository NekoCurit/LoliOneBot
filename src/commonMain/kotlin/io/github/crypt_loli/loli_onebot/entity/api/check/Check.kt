package io.github.crypt_loli.loli_onebot.entity.api.check

import io.github.crypt_loli.loli_onebot.entity.api.ApiBase
import kotlinx.serialization.Serializable

@Serializable
data class ApiCheckCanSendImageApi(
    val action: String = "can_send_image"
): ApiBase()

@Serializable
data class ApiCheckCanSendRecordApi(
    val action: String = "can_send_record"
): ApiBase()