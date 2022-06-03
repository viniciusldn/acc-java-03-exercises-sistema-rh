package com.trybe.acc.java.caixaeletronico;

import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes para a classe Banco")
class BancoTest {
  Banco objTeste = new Banco();
  PessoaCliente pessoaClienteCadastradaMock = null;
  PessoaCliente pessoaClienteNaoCadastradaMock = null;

  @Test
  @DisplayName("1 - Testa o gerador de número único para nova conta.")
  void gerarNumeroNovaContaTest() {
    assertEquals(10, objTeste.gerarNumeroNovaConta().length());
  }

  @Test
  @DisplayName("2 - Testa o método adicionar pessoa cliente retorna o objeto pessoa cliente.")
  void adicionarPessoaClienteTest() {
    PessoaCliente pessoaClienteMock = null;
    ArrayList<PessoaCliente> arrTeste = objTeste.getPessoasClientes();
    PessoaCliente resposta = objTeste.adicionarPessoaCliente(pessoaClienteMock);
    assertEquals(pessoaClienteMock, resposta);
    assertNotSame(arrTeste, objTeste.getPessoasClientes());

  }

  @Test
  @DisplayName("3 - Testa o método login da pessoa cliente retorna o objeto pessoa cliente corretamente.")
  void pessoaClienteLoginTest() {
    assertEquals("Login inválido", objTeste.pessoaClienteLogin(pessoaClienteNaoCadastradaMock));
    assertEquals(pessoaClienteCadastradaMock,
        objTeste.pessoaClienteLogin(pessoaClienteCadastradaMock));

  }

  @Test
  @DisplayName("4 - Testa se o método transferir fundos está transferindo corretamente.")
  void depositarTestTransferirFundosTestmostrarExtratoTest() {

  }

  @Test
  @DisplayName("5 - Testa se o método sacar está funcionando corretamente.")
  void depositarTestSacarTestMostrarExtratoTest() {
    fail("Não implementado");

  }

}
