package yap.hub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform