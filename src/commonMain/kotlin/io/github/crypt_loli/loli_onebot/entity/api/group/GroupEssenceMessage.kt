package io.github.crypt_loli.loli_onebot.entity.api.group

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
internal data class ApiGroupEssenceMessageList(
    val action: String = "get_essence_msg_list",
    val params: Params
) {
    @Serializable
    data class Params(
        @SerialName("group_id")
        val groupId: Long
    )
}



@Serializable
internal data class ApiGroupEssenceMessageDelete(
    val action: String = "delete_essence_msg",
    val params: Params,
) {
    @Serializable
    data class Params(
        @SerialName("message_id")
        val messageId: Long
    )
}

@Serializable
internal data class ApiGroupEssenceMessageSet(
    val action: String = "set_essence_msg",
    val params: Params
) {
    @Serializable
    data class Params(
        @SerialName("message_id")
        val messageId: Long
    )
}