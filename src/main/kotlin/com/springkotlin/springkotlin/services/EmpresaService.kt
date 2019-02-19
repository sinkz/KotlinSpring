package com.springkotlin.springkotlin.services

import com.springkotlin.springkotlin.documents.Empresa

interface EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun salvar(empresa: Empresa): Empresa

}