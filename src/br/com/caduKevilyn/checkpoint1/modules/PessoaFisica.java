package br.com.caduKevilyn.checkpoint1.modules;

public class PessoaFisica extends Titular{

    private String cpf;

    private ContaCorrente contaCorrente;
    private ContaSalario contaSalario;

    private ContaPoupanca contasPoupancas;

    public PessoaFisica(String nome, String sobrenome, String endereco, String email, String cpf) {
        super(nome, sobrenome, endereco, email);
        this.cpf = cpf;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("CPF: "+this.getCpf());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaSalario getContaSalario() {
        return contaSalario;
    }

    public void setContaSalario(ContaSalario contaSalario) {
        this.contaSalario = contaSalario;
    }
}
