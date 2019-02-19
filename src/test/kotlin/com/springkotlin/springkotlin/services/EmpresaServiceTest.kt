package com.springkotlin.springkotlin.services

import com.springkotlin.springkotlin.documents.Empresa
import com.springkotlin.springkotlin.repositories.EmpresaRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class EmpresaServiceTest {

    @Autowired
    val empresaService: EmpresaService? = null

    @MockBean
    private val empresaRepository: EmpresaRepository? = null

    private val CNPJ = "08714925582"

    @Before
    @Throws(Exception::class)
    fun setUp(){
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
    }

    @Test
    fun testBuscarEmpresaPorCnpj(){
       val empresa: Empresa? = empresaService?.buscarPorCnpj(CNPJ)
        Assert.assertNotNull(empresa)
    }

    @Test
    fun testSalvarEmpresa(){
        val empresa: Empresa? = empresaService?.salvar(empresa())
        Assert.assertNotNull(empresa)
    }

    private fun empresa(): Empresa = Empresa( "Razão Social", CNPJ, "1")

}