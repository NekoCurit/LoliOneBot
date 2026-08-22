package io.github.crypt_loli.loli_onebot.entity.api.group

import io.github.crypt_loli.loli_onebot.entity.api.ApiBase
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiGroupList(
    val action: String = "get_group_list"
): ApiBase()

@Serializable
data class ApiGroupMemberList(
    val action: String = "get_group_member_list",
    val params: Params
): ApiBase() {
    @Serializable
    data class Params(
        @SerialName("group_id")
        val groupId: Long
    )
}

@Serializable
data class ApiGroupMemberLeave(
    val action: String = "set_group_leave",
    val params: Params
): ApiBase() {
    @Serializable
    data class Params(
        @SerialName("group_id")
        val groupId: Long,
        @SerialName("is_dismiss")
        val isDismiss: Boolean
    )
}

@Serializable
data class ApiGroupMemberSign(
    val action: String = "set_group_sign",
    val params: Params,
): ApiBase() {
    @Serializable
    data class Params(
        @SerialName("group_id")
        val groupId: Long
    )
}