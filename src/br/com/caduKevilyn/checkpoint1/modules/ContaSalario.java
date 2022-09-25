package br.com.caduKevilyn.checkpoint1.modules;

import java.util.Date;

public class ContaSalario extends Conta{

    public ContaSalario(int numeroConta, int numeroAgencia, double saldo, String tipoConta, Titular titular) {
        super(numeroConta, numeroAgencia, saldo, tipoConta, titular);
    }

    /* public void investir(double valor, ContaPoupanca contaDestino){

        Date data = new Date();

        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor) ;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println(" ");
            System.out.println("Você Investiu R$"+ valor + " reais em sua conta poupanca de numero: "+contaDestino.getNumeroConta() + "em "+ data + " com sucesso!");
            System.out.println(" ");
            System.out.println("Saldo atual da sua conta Salario: R$" + this.getSaldo() + " Reais");
            System.out.println(" ");
            System.out.println("Saldo atual em sua conta pupanca de numero "+contaDestino.getNumeroConta()+ ": R$" + contaDestino.getSaldo() + " Reais");
            System.out.println(" ");
        }
        else {
            System.out.println("Saldo insuficiente");
        }

    } */
    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
    }

    public void pagar(double valor, String descricao){

        Date data = new Date();

        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor) ;
            System.out.println(" ");
            System.out.println("-Seu pagamento referente a "+ descricao + " foi realizado com sucesso em  "+ data +" !");
            System.out.println("-Saldo atual: R$" + this.getSaldo() );
            System.out.println(" ");
        }else {
            System.out.println("Saldo insuficiente");
        }

    }
}
