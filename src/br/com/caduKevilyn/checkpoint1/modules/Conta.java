package br.com.caduKevilyn.checkpoint1.modules;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Conta {

    Random randm = new Random();
    private int numeroConta = randm.nextInt(100000); ;
    private int numeroAgencia;
    private double saldo;
    private String tipoConta;
    private Titular titular;


    public void sacar(double valor){

        Date data = new Date();

        if(this.saldo >= valor){
            saldo = this.saldo - valor;
            System.out.println("-Saque efetuado "+ data + " com sucesso!");
            System.out.println("-Saldo atual: R$" + this.saldo );
        }
        else {
            System.out.println("-Saldo insuficiente");
        }


    };
    public void transferir(double valor, Conta contaDestino){

        Date data = new Date();

        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("-Transferencia realizada em "+ data + " com sucesso!");
            System.out.println("-Saldo atual: R$" + this.saldo );
        }
        else {
            System.out.println("-Saldo insuficiente");
        }

    };

    public void dadosConta(){

        System.out.println("-Agencia: "+ this.getNumeroAgencia());
        System.out.println("-Conta: " + this.getNumeroConta());
        System.out.println("-Tipo de Conta: " + this.getTipoConta());
        System.out.println("-Saldo: R$" + this.getSaldo());

    }

    public Conta(int numeroConta, int numeroAgencia, double saldo, String tipoConta, Titular titular) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.titular = titular;

    }

    public void depositar(double valor){

        Date data = new Date();

        this.setSaldo(this.getSaldo() + valor) ;
        System.out.println(" ");
        System.out.println("-Deposito no valor de R$"+ valor + " efetuado com sucesso em sua conta "+ this.getTipoConta()+ " em " + data);
        System.out.println("-Saldo atual: R$" + this.getSaldo() );
        System.out.println(" ");
    }

    public void pagar(double valor, String descricao){

        Date data = new Date();

        if(this.getSaldo()>= valor){
            this.setSaldo(this.getSaldo() - valor) ;
            System.out.println(" ");
            System.out.println("-Seu pagamento referente a "+ descricao + " foi realizado com sucesso em  "+ data +" !");
            System.out.println("-Saldo atual: R$" + this.getSaldo() );
            System.out.println(" ");
        }else {
            System.out.println("-Saldo insuficiente");
        }

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
