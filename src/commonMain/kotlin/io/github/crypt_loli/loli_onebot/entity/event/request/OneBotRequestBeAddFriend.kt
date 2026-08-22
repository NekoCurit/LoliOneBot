package io.github.crypt_loli.loli_onebot.entity.event.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 被添加好友事件
 *
 * @param userId 对方账号
 * @param comment 严重信息
 */
@Serializable
data class OneBotRequestBeAddFriend(
    @SerialName("user_id")
    val userId: Long,
    val comment: String
): OneBotRequestEvent()

