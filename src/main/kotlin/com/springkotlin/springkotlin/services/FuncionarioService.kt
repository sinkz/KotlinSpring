package com.springkotlin.springkotlin.services

import com.springkotlin.springkotlin.documents.Funcionario

interface FuncionarioService {

    fun salvar(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf: String): Funcionario?

    fun buscarPorEmail(email: String): Funcionario?

    fun buscarPorId(id: String): Funcionario?

}