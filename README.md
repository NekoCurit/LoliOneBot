<div align="center"><h1>LoliOneBot</h1></div>

LoliOneBot 是一个使用 Kotlin跨平台 实现的轻量 OneBot SDK

项目处于早期阶段, 稳定性较低


## 说说优点?

- 可以将其附加到现有的 ktor-server 实例上 (而不像某些实现必须额外开启 http 端口)
- 反向 WebSocket 支持多个客户端同时连接
- 可以按需导入需要的模块, 减少项目体积

## 功能列表

- 🟩 连接方式
    - 🟥 双向 HTTP
    - 🟥 正向 Websocket
    - 🟩 反向 Websocket

## 作为库使用

```kotlin
repositories {
    mavenCentral()
}

// 还没发布第一个 release 暂不可用
dependencies {
    // 把 ${version} 替换成最新版本
    implementation("io.github.cryptloli:loli-onebot:${version}")
    // 同时还需要引入一个 ktor 客户端或服务端 引擎 
    // https://ktor.io/docs/client-engines.html
    implementation("io.ktor:ktor-client-java:${ktorVersion}")
}
```

## 快速开始

这是一个简单的示范 适用于 `kotlin/jvm`

```kotlin
// TODO
```

## 一些常见问题

TODO

## Issues

如果你发现了 bug 或者需要新的功能, 你可以创建一个新的 issue

我们也欢迎您提交 pull request
