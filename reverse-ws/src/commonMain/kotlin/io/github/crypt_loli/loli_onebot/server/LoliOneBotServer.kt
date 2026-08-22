package io.github.crypt_loli.loli_onebot.server

import io.github.crypt_loli.loli_onebot.server.module.ReverseWSClient
import io.github.crypt_loli.loli_onebot.server.sdk.OneBotWSReverseListener
import io.github.crypt_loli.loli_onebot.utils.OneBotMessageHandler
import io.github.crypt_loli.loli_onebot.utils.SuspendedRequests

class LoliOneBotServer(val listener: OneBotWSReverseListener) {
    val clients = mutableSetOf<ReverseWSClient>()
    val requests = SuspendedRequests()
    val handler = OneBotMessageHandler(listener, requests)
}