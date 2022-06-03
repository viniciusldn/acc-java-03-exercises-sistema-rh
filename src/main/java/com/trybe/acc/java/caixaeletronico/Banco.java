package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;

public class Banco {

  private ArrayList<PessoaCliente> pessoasClientes = new ArrayList<PessoaCliente>();
  private ArrayList<String> contas = new ArrayList<String>();

  public ArrayList<PessoaCliente> getPessoasClientes() {
    return pessoasClientes;

  }

  public ArrayList<String> getContas() {
    return contas;

  }

  public void setPessoasClientes(PessoaCliente pessoaCliente) {
    this.pessoasClientes.add(pessoaCliente);

  }

  public void setContas(String conta) {
    this.contas.add(conta);

  }

  public String gerarNumeroNovaConta() {
    // TODO Auto-generated method stub
    return null;
  }

  public PessoaCliente adicionarPessoaCliente(PessoaCliente pessoaCliente) {
    // TODO Auto-generated method stub
    return null;
  }

  public PessoaCliente pessoaClienteLogin(PessoaCliente pessoaCliente) {
    // TODO Auto-generated method stub
    return null;
  }

}
