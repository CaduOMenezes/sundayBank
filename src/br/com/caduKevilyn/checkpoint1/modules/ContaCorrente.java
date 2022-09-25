package br.com.caduKevilyn.checkpoint1.modules;

import java.util.Date;

public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(int numeroConta, int numeroAgencia, double saldo, String tipoConta, Titular titular, double chequeEspecial) {
        super(numeroConta, numeroAgencia, saldo, tipoConta, titular);
        this.chequeEspecial = chequeEspecial;

    }


    public void sacar(double valor) {

        Date data = new Date();

        if(this.getSaldo() + chequeEspecial >= valor){
            this.setSaldo(this.getSaldo() - valor) ;
            System.out.println("-Saque efetuado em "+ data + " com sucesso!");
            System.out.println("-Saldo atual: R$" + this.getSaldo() );
            System.out.println("-Saldo atual + cheque especial: R$" + (this.getSaldo()+chequeEspecial) );
        }else {
        System.out.println("-Saldo insuficiente");
        }

    };

    public void transferir(double valor, Conta contaDestino) {
        Date data = new Date();

        if(this.getSaldo() + chequeEspecial >= valor){
            this.setSaldo(this.getSaldo() - valor) ;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("-Transferência realizada em "+ data + " com sucesso!");
            System.out.println("-Saldo atual: R$" + this.getSaldo() );
            System.out.println("-Saldo atual + cheque especial: R$" + (this.getSaldo()+chequeEspecial) );
        }
        else {
            System.out.println("-Saldo insuficiente");
        }

    };

    public void investir(double valor, ContaPoupanca contaDestino){

        Date data = new Date();

        if(this.getSaldo() + chequeEspecial >= valor){
            this.setSaldo(this.getSaldo() + chequeEspecial - valor) ;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println(" ");
            System.out.println("-Você Investiu R$"+ valor + " reais em sua conta poupanca de numero: "+contaDestino.getNumeroConta() + "em "+ data + " com sucesso!");
            System.out.println("-Saldo atual da sua conta Corrente: R$" + this.getSaldo() + " Reais");
            System.out.println("-Saldo atual em sua conta pupanca de numero "+contaDestino.getNumeroConta()+ ": R$" + contaDestino.getSaldo() + " Reais");
            System.out.println(" ");
        }
        else {
            System.out.println("-Saldo insuficiente");
        }

    }

    public void pagar(double valor, String descricao){

        Date data = new Date();

        if(this.getSaldo() + chequeEspecial >= valor){
            this.setSaldo(this.getSaldo() - valor) ;
            System.out.println(" ");
            System.out.println("-Seu pagamento referente a "+ descricao + " foi realizado com sucesso em  "+ data +" !");
            System.out.println("-Saldo atual: R$" + this.getSaldo() );
            System.out.println("-Saldo atual + cheque especial: R$" + (this.getSaldo()+chequeEspecial) );
            System.out.println(" ");
        }else {
            System.out.println("-Saldo insuficiente");
        }

    }

    public void depositar(double valor){

        Date data = new Date();

        this.setSaldo(this.getSaldo() + valor) ;
        System.out.println(" ");
        System.out.println("-Deposito no valor de R$"+ valor + " efetuado com sucesso em sua conta "+ this.getTipoConta()+ " em " + data);
        System.out.println("-Saldo atual: R$" + this.getSaldo() );
        System.out.println("-Saldo atual + cheque especial: R$" + (this.getSaldo()+chequeEspecial) );
        System.out.println(" ");
    }

    @Override
    public void dadosConta() {
        super.dadosConta();
        System.out.println("-Saldo + Cheque Especial: R$" +(this.getSaldo()+chequeEspecial));

    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
