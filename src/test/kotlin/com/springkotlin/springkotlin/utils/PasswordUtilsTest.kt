package com.springkotlin.springkotlin.utils

import org.junit.Assert
import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtilsTest {

    private val SENHA = "12345"
    private val bCryptEnconder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashSenha(){
        val hash = PasswordUtils().generateCrypt(SENHA)
        Assert.assertTrue(bCryptEnconder.matches(SENHA, hash))
    }
}