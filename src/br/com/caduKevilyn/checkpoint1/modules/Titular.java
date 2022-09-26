package br.com.caduKevilyn.checkpoint1.modules;


// Criando a classe Titular

import java.util.ArrayList;
import java.util.Objects;

public class Titular {

    public Conta conta;
    public Conta cp;
    public Conta cs;
    //Determinando os objetos da classe
    private String nome;
    private String sobrenome;
    private String endereco;
    private String email;

    public Titular(String nome, String sobrenome, String endereco, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.email = email;

    }
    //Criando os métodos da classe

    public void imprimeDados(){

        //Esse método imprime uma mensagem com as infos do titular

        System.out.println("Nome: "+ nome );
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Endereco: "+ endereco );
        System.out.println("Email: "+ email );
        System.out.println(" ");
        System.out.println("Conta(s):");
        this.cp.dadosConta();
        this.conta.dadosConta();


    }


    public void criarConta(int numeroConta, int numeroAgencia, double saldo, String tipoConta, Titular titular, double chequeEspecial){
        if (Objects.equals(tipoConta, "Poupanca")){
            this.cp = new ContaPoupanca(numeroConta+5000000, numeroAgencia, saldo, "Poupanca", titular);

        }else if(Objects.equals(tipoConta, "Corrente")){
            this.conta = new ContaCorrente(numeroConta, numeroAgencia, saldo, "Corrente", titular, chequeEspecial);
            this.cp = new ContaPoupanca(numeroConta+5000000, numeroAgencia, 0, "Poupanca", titular);

        }else if(Objects.equals(tipoConta, "Salario")){
            this.cs = new ContaSalario(numeroConta+33000000, numeroAgencia, saldo, "Salario", titular);

        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

