package io.github.crypt_loli.loli_onebot.server

import io.github.crypt_loli.loli_onebot.server.module.ReverseWSClient
import io.ktor.server.application.install
import io.ktor.server.engine.*
import io.ktor.server.routing.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import kotlinx.coroutines.launch

/**
 * 附加到外部 ktor-server 上
 * 请务必确保该实例已安装 WebSockets 插件
 */
fun Route.applyLoliOneBotServer(path: String = "/", system: LoliOneBotServer) {
    webSocket(path) {
        val client = ReverseWSClient(system, this)
        system.clients += client
        system.listener.onClientOnline(client)

        runCatching {
            for (frame in incoming) {
                when (frame) {
                    is Frame.Text -> launch { client.onTextReceived(frame.readText()) }
                    else -> {}
                }
            }
        }

        system.clients -= client
        system.listener.onClientOffline(client)
    }
}

fun <TEngine : ApplicationEngine, TConfiguration : ApplicationEngine.Configuration> LoliOneBotServer.listenerWSServer(
    factory: ApplicationEngineFactory<TEngine, TConfiguration>,
    host: String = "0.0.0.0",
    port: Int = 8080,
    path: String = "/"
) = embeddedServer(factory = factory, host = host, port = port) {
    install(WebSockets)
    routing {
        applyLoliOneBotServer(path = path, this@listenerWSServer)
    }
}.start(wait = false)