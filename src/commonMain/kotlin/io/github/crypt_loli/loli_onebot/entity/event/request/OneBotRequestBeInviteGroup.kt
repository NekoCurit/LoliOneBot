package io.github.crypt_loli.loli_onebot.entity.event.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 被邀请入群事件
 *
 * @param groupId 群号
 * @param invitorId 邀请者账号
 */
@Serializable
data class OneBotRequestBeInviteGroup(
    @SerialName("group_id")
    val groupId: Long,
    @SerialName("user_id")
    val invitorId: Long
): OneBotRequestEvent()

