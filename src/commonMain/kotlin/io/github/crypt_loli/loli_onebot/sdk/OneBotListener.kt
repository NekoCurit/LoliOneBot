package io.github.crypt_loli.loli_onebot.sdk

import io.github.crypt_loli.loli_onebot.entity.event.message.OneBotGroupMessageEvent
import io.github.crypt_loli.loli_onebot.entity.event.message.OneBotPrivateMessageEvent
import io.github.crypt_loli.loli_onebot.entity.event.request.OneBotRequestBeAddFriend
import io.github.crypt_loli.loli_onebot.entity.event.request.OneBotRequestBeInviteGroup
import io.github.crypt_loli.loli_onebot.entity.event.request.OneBotRequestJoinGroup

interface OneBotListener {
    suspend fun onPrivateMessage(event: OneBotPrivateMessageEvent) { }
    suspend fun onGroupMessage(event: OneBotGroupMessageEvent) { }

    suspend fun onRequestBeAddFriend(event: OneBotRequestBeAddFriend) { }

    suspend fun onRequestBeInviteGroup(event: OneBotRequestBeInviteGroup) { }

    suspend fun onRequestJoinGroup(event: OneBotRequestJoinGroup) { }
}