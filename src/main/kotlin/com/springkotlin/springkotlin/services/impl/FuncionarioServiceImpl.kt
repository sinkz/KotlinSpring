package com.springkotlin.springkotlin.services.impl

import com.springkotlin.springkotlin.documents.Funcionario
import com.springkotlin.springkotlin.repositories.FuncionarioRepository
import com.springkotlin.springkotlin.services.FuncionarioService
import org.springframework.stereotype.Service
import java.util.*

@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun salvar(funcionario: Funcionario): Funcionario = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findById(id).orElse(null)
}