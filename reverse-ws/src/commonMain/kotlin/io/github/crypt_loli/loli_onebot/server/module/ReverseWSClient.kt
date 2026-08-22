package io.github.crypt_loli.loli_onebot.server.module

import io.github.crypt_loli.loli_onebot.OneBotApi
import io.github.crypt_loli.loli_onebot.module.WSSend
import io.github.crypt_loli.loli_onebot.server.LoliOneBotServer
import io.ktor.server.websocket.*
import io.ktor.websocket.*

class ReverseWSClient(
    val system: LoliOneBotServer,
    val wrapped: DefaultWebSocketServerSession
): WSSend {

    val api = OneBotApi(this, system.handler)

    suspend fun onTextReceived(text: String) {
        system.handler.handleEvent(api, text)
    }

    override suspend fun send(text: String) {
        wrapped.send(text)
    }

    override suspend fun disconnect() {
        wrapped.close()
    }

}