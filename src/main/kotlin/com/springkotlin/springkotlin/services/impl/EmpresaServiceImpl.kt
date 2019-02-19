package com.springkotlin.springkotlin.services.impl

import com.springkotlin.springkotlin.documents.Empresa
import com.springkotlin.springkotlin.repositories.EmpresaRepository
import com.springkotlin.springkotlin.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun salvar(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}