package br.com.caduKevilyn.checkpoint1.modules;

import java.util.ArrayList;

public class PessoaJuridica  extends Titular{

    private String cnpj;

    private ContaCorrente contaCorrente;

    private ContaPoupanca contaPoupanca;

    public PessoaJuridica(String nome, String sobrenome, String endereco, String email, String cnpj) {
        super(nome, sobrenome, endereco, email);
        this.cnpj = cnpj;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("CNPJ: "+this.getCnpj());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
