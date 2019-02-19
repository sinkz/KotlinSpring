package com.springkotlin.springkotlin.repositories

import com.springkotlin.springkotlin.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj: String): Empresa
}