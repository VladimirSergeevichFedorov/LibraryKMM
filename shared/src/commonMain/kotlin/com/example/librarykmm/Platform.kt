package com.example.librarykmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform