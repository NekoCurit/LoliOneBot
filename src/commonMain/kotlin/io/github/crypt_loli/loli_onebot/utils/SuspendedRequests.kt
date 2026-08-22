package io.github.crypt_loli.loli_onebot.utils

import kotlinx.coroutines.CompletableDeferred
import kotlinx.serialization.json.JsonObject
import kotlin.uuid.Uuid

class SuspendedRequests {

    val storage = hashMapOf<String, CompletableDeferred<JsonObject>>()

    fun create(echo: String = Uuid.random().toString()) = CompletableDeferred<JsonObject>()
        .also { storage[echo] = it }

}