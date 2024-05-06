package id.slava.nt.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform