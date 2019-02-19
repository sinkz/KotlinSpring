package com.springkotlin.springkotlin.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtils {

    fun generateCrypt(senha: String): String = BCryptPasswordEncoder().encode(senha)
}