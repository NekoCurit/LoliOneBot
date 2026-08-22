package io.github.crypt_loli.loli_onebot.entity.array

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class SegmentType {
    @SerialName("text")
    Text,
    @SerialName("image")
    Image,
    @SerialName("face")
    Face,
    @SerialName("record")
    Record,
    @SerialName("at")
    At,
    @SerialName("rps")
    Rps,
    @SerialName("shake")
    Shake,
    @SerialName("poke")
    Poke,
    @SerialName("share")
    Share,
    @SerialName("reply")
    Reply,
    @SerialName("json")
    Json,
    @SerialName("forward")
    Forward,
    @SerialName("dice")
    Dice,
    @SerialName("video")
    Video,
    @SerialName("contact")
    Contact,
    @SerialName("location")
    Location,
    @SerialName("music")
    Music,
    @SerialName("xml")
    Xml,
    @SerialName("mface")
    MFace,
    @SerialName("node")
    Node,
    @SerialName("file")
    File,
    @SerialName("markdown")
    Markdown,
}