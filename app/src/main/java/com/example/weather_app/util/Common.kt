package com.example.weather_app.util

inline fun <R, A, B> nonNull(a: A?, b: B?, block: (A, B) -> R): R? = when {
    a != null && b != null -> block(a, b)
    else -> null
}