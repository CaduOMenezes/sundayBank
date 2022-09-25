package br.com.caduKevilyn.checkpoint1;

import br.com.caduKevilyn.checkpoint1.modules.*;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        /* Criação do scanner e declaração das variáveis*/
        //objeto scanner que recebe a entrada do usuario
        Scanner entradaDoUsuario;
        entradaDoUsuario = new Scanner(System.in);
        //definição das variáveis que criarão o novo cliente
        String nome;
        String sobrenome;
        String endereco;
        String email;
        String CPF;

        //Variavel que confirma se os dados estao corretos
        String confirmaDados;
        //Variaveis que definirão o tipo de conta, saldo, agencia e cheque especial
        String tipoConta;
        double saldoInicial;
        int agencia;
        double chequeEspecial;

        // entrada que determina se o usuario quer fazer operação na conta desejada, qual operação, valor e descrição
        int escolha1;
        int operacaoDesejada;
        String contaDesejada;
        double valorOpercao;
        int confirmaOperacao;
        String descricaoExtrato;
        // variaveis que definem a repetição e recomeço da aplicação

        int novaOperacao=0;
        int novoCliente=0;
        String novoClienteInput;
        String iniciar;
        int listaClientes;
        // array que recebe os clientes criados
        ArrayList<Titular> titulares = new ArrayList<Titular>();


        /*Início da Aplicação*/


        System.out.println("Bem vindo ao Sunday Bank!");
        System.out.println(" ");
        System.out.println("Voce deseja cadastrar um novo cliente? S/N");
        iniciar = entradaDoUsuario.nextLine();

        if (Objects.equals(iniciar, "S")) {
            while (novoCliente<=1) {

                System.out.println("Para fazer seu cadastro, diga seu nome.");
                nome = entradaDoUsuario.nextLine();
                System.out.println(" ");
                System.out.println("Agora seu sobrenome.");
                sobrenome = entradaDoUsuario.nextLine();
                System.out.println(" ");
                System.out.println("Onde voce mora? SP/RJ/Outro");
                endereco = entradaDoUsuario.nextLine();
                if (Objects.equals(endereco, "SP")) {
                    agencia = 4587;
                } else if (Objects.equals(endereco, "RJ")) {
                    agencia = 3586;

                } else if (Objects.equals(endereco, "Outro")) {
                    agencia = 1785;
                } else {
                    throw new RuntimeException("Entrada nao reconhecida");
                }
                System.out.println(" " +
                        "");
                System.out.println("Qual o seu melhor email?");
                email = entradaDoUsuario.nextLine();
                System.out.println(" " +
                        "");
                System.out.println("Qual o seu documento?(CPF)");
                CPF = entradaDoUsuario.nextLine();
                System.out.println(" " +
                        "");
                System.out.println("Confirma seus dados?");
                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
                System.out.println("Endereco: " + endereco);
                System.out.println("Email: " + email);
                System.out.println("CPF: " + CPF);
                System.out.println(" " +
                        "");
                System.out.println("S / N");
                confirmaDados = entradaDoUsuario.nextLine();
                Titular titular = new PessoaFisica(nome, sobrenome, endereco, email, CPF);
                if (Objects.equals(confirmaDados, "S") || Objects.equals(confirmaDados, "s")) {
                    System.out.println(" " +
                            "");
                    System.out.println("Agora vamos aos dados da conta.");
                } else {
                    System.out.println(" " +
                            "");
                    System.out.println("Adios!");
                    return;
                }
                System.out.println("Qual tipo de conta voce deseja abrir? Poupanca ou Corrente?");
                tipoConta = entradaDoUsuario.nextLine();
                System.out.println(" " +
                        "");
                System.out.println("Qual o valor que voce quer adicionar para a abertura?");
                saldoInicial = Double.parseDouble(entradaDoUsuario.nextLine());
                if (saldoInicial <= 500) {
                    chequeEspecial = 100;
                } else if (saldoInicial <= 2000) {
                    chequeEspecial = 300;
                } else {
                    chequeEspecial = 700;
                }
                ;

                //função para criar um numero de conta aleatorio
                Random randm = new Random();
                int numeroConta = randm.nextInt(100000-10000+1);
                titular.criarConta(numeroConta, agencia, saldoInicial, tipoConta, titular, chequeEspecial);

                System.out.println(" " +
                        "");
                System.out.println("Seus Dados:");
                titular.imprimeDados();
                System.out.println(" " +
                        "" +
                        "");
                if (titular.conta != null) {
                    System.out.println("Dados da sua Conta Corrente:");
                    titular.conta.dadosConta();
                    System.out.println(" " +
                            "" +
                            "");
                }
                System.out.println("Dados da sua Conta Poupanca:");
                titular.cp.dadosConta();
                System.out.println(" " +
                        "" +
                        "");
                System.out.println("Parabens! Sua(s) Conta(s) esta(ao) pronta(s)! :)");
                System.out.println("Deseja realizar alguma operacao? S(1) / N(2)");
                escolha1 = Integer.parseInt(entradaDoUsuario.nextLine());

                System.out.println(" " +
                        "");


                if (escolha1 == 1) {
                    System.out.println("De qual conta deseja operar? CC ou CP?");
                    contaDesejada = entradaDoUsuario.nextLine();

                    if (titular.conta == null && Objects.equals(contaDesejada, "CC")) {
                        throw new RuntimeException("Conta inexistente");
                    }


                while (novaOperacao <= 1) {
                    System.out.println("Qual operacao voce deseja fazer? Deposito(1), transferencia(2), saque(3) ou pagamento(4)?");
                    operacaoDesejada = entradaDoUsuario.nextInt();

                    if (Objects.equals(contaDesejada, "CC") && (titular.conta != null)) {
                        if (operacaoDesejada == 1) {
                            System.out.println("Quanto deseja Depositar?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Voce confirma o deposito de R$" + valorOpercao + " na sua conta corrente de numero " + titular.conta.getNumeroConta() + " e agencia " + titular.conta.getNumeroAgencia() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.conta.depositar(valorOpercao);


                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        } else if (operacaoDesejada == 2) {
                            System.out.println("Quanto deseja Transferir?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Voce confirma a transferencia de R$" + valorOpercao + " da sua conta corrente de numero " + titular.conta.getNumeroConta() + " e agencia " + titular.conta.getNumeroAgencia() + " para sua conta poupanca de numero " + titular.cp.getNumeroConta() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.conta.transferir(valorOpercao, titular.cp);
                                System.out.println(" ");

                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        } else if (operacaoDesejada == 3) {
                            System.out.println("Quanto deseja Sacar?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Voce confirma o saque de R$" + valorOpercao + " da sua conta corrente de numero " + titular.conta.getNumeroConta() + " e agencia " + titular.conta.getNumeroAgencia() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.conta.sacar(valorOpercao);


                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        } else if (operacaoDesejada == 4) {
                            System.out.println("Qual o valor do pagamento?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Como deseja que apareca no seu extrato?");
                            descricaoExtrato = entradaDoUsuario.next();
                            System.out.println("Voce confirma o pagamento de " + descricaoExtrato + " no valor de R$" + valorOpercao + " pela sua conta corrente de numero " + titular.conta.getNumeroConta() + " e agencia " + titular.conta.getNumeroAgencia() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.conta.pagar(valorOpercao, descricaoExtrato);

                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        }
                    } else if (Objects.equals(contaDesejada, "CP") || contaDesejada == null) {
                        if (operacaoDesejada == 1) {
                            System.out.println("Quanto deseja Depositar?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Voce confirma o deposito de R$" + valorOpercao + " na sua conta poupanca de numero " + titular.cp.getNumeroConta() + " e agencia " + titular.cp.getNumeroAgencia() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.cp.depositar(valorOpercao);

                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        } else if (operacaoDesejada == 2 && titular.conta != null) {
                            System.out.println("Quanto deseja Transferir?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Voce confirma a transferencia de R$" + valorOpercao + " da sua conta poupanca de numero " + titular.cp.getNumeroConta() + " e agencia " + titular.cp.getNumeroAgencia() + " para sua conta corrente de numero " + titular.conta.getNumeroConta() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.cp.transferir(valorOpercao, titular.conta);

                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        } else if (operacaoDesejada == 2 && titular.conta == null) {
                            System.out.println("Operacao invalida pois voce nao possui conta corrente.");
                        } else if (operacaoDesejada == 3) {
                            System.out.println("Quanto deseja Sacar?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Voce confirma o saque de R$" + valorOpercao + " da sua conta poupanca de numero " + titular.cp.getNumeroConta() + " e agencia " + titular.cp.getNumeroAgencia() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.cp.sacar(valorOpercao);

                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        } else if (operacaoDesejada == 4) {
                            System.out.println("Qual o valor do pagamento?");
                            valorOpercao = entradaDoUsuario.nextDouble();
                            System.out.println("Como deseja que apareca no seu extrato?");
                            descricaoExtrato = entradaDoUsuario.next();
                            System.out.println("Voce confirma o pagamento de " + descricaoExtrato + "no valor de R$" + valorOpercao + " pela sua conta poupanca de numero " + titular.cp.getNumeroConta() + " e agencia " + titular.cp.getNumeroAgencia() + "? S(1)/N(2)");
                            confirmaOperacao = entradaDoUsuario.nextInt();
                            if (confirmaOperacao == 1) {
                                titular.cp.pagar(valorOpercao, descricaoExtrato);

                            } else {
                                System.out.println("  ");
                                System.out.println("Obrigado por usar o Sunday Bank!");
                                return;
                            }
                        }
                    } else {
                        throw new RuntimeException("Tipo de operacao nao reconhecida. Tente novamente mais tarde.");

                    }
                    System.out.println("Deseja realizar uma nova operacao nessa conta? S(1)/N(2)");
                    novaOperacao = entradaDoUsuario.nextInt();
                }}
                titulares.add(titular);
                System.out.println("Voce deseja cadastrar um novo cliente? S/N");
                novoClienteInput = entradaDoUsuario.nextLine();
                if (Objects.equals(novoClienteInput, "S")){
                    novoCliente = 1;
                }else{
                    novoCliente = 2;
                }
            }

        }

        System.out.println("Voce quer ver sua lista de clientes? S(1)/N(2)");
        listaClientes = entradaDoUsuario.nextInt();
        if (listaClientes == 1){
            for (int i = 0; i<= titulares.size()-1; i++){
                titulares.get(i).imprimeDados();
        }}

        System.out.println("  ");
        System.out.println("Obrigado por usar o Sunday Bank!");
    }}



