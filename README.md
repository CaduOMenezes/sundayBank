# sundayBank

Programação Orientada a Objetos

Dupla: Carlos Eduardo Menezes e Kevilyn Queiroz Domingos

Checkpoint 1 e 2

Diagrama: 

https://drive.google.com/file/d/15532oIrjNjZ4DZWy7rPO4XLT6PRyxzPb/view?usp=sharing

Código no link do GitHub:

https://github.com/CaduOMenezes/sundayBank

Enunciado:

Uma agência bancária de uma cidade pequena deseja incorporar um novo sistema financeiro para melhorar a experiência tanto dos novos clientes quanto dos clientes mais antigos. 

O sistema do Sunday Bank funciona através da interação do usuário pelo console. Ao iniciar a aplicação, o sistema pedirá que o colaborador do banco inicie o seu login para que assim ele possa fazer o cadastro dos seus novos clientes. 

Para o cadastro de seus clientes, o operador precisará fornecer o nome, o sobrenome, o e-mail e o documento do cliente. Além disso, como o Sunday Bank ainda não opera fisicamente no Brasil todo, sendo assim o operador poderá informar que o cliente reside nos estados do RJ (Rio de Janeiro) ou de SP (São Paulo). Caso o cliente resida em outro local, poderá abrir uma conta no modelo digital. 

Após fornecer essas informações a aplicação irá pedir que o operador confirme se os dados estão corretos. Caso a resposta seja positiva, ele poderá abrir a conta do cliente, sendo essa uma conta Corrente ou uma conta Poupança, e caso haja interesse em apenas se ter uma conta salário, apenas as empresas poderão abrir essas contas salários.

Com o preenchimento do cadastro (informações e modalidade da conta), o operador poderá colocar o valor inicial desejado pelo cliente. Para contas do tipo Corrente, o valor inicial afetará o valor do cheque especial liberado pelo Sunday Bank.

Com os documentos preenchidos, a modalidade da conta selecionada e o valor inicial aplicado, o sistema criará automaticamente a conta do cliente, mostrará imediatamente ao operador, que por sua vez, poderá realizar operações nesta conta criada e armazenará os dados em uma pasta de Clientes.

Antes de finalizar sua sessão no aplicativo, o operador ainda terá a opção de cadastrar novos clientes e/ou de ver os clientes já cadastrados com suas respectivas contas.

O sistema precisa seguir algumas regras:

Sempre que um novo cliente chega ao banco, ele precisa realizar um cadastro, sendo permitido que seja  tanto um titular como  pessoa física quanto um  titular pessoa jurídica. 

Para o cadastro, é necessário o fornecimento das seguintes informações: Nome, sobrenome, email, CPF ou CNPJ e endereço.

Após o cadastro do titular, existe a opção de abrir uma conta poupança, uma conta corrente ou conta salário e todas as contas possuem o número de agência, conta, saldo independente e um identificador de tipo, para facilitar ao buscar no sistema. Contudo, a conta corrente permite que o usuário tenha um valor de cheque especial, para emergências.

Algumas características precisam constar: 

Se o cliente optar por abrir uma conta corrente, obrigatoriamente será aberta uma conta poupança associada, mas caso ele opte por ter apenas uma conta poupança, essa será independente e, caso este tente realizar alguma operação como conta corrente, o sistema apresentará erro. Já a conta salário, é somente uma conta a mais que não contempla todas as funções de uma conta corrente ou poupança. 

Todas as contas podem executar funções básicas como Saque e Transferência, no entanto o usuário só pode utilizar o saldo das contas corrente e da conta salário para realizar pagamentos, sendo que para realizar pagamentos é obrigatório inserir uma descrição, assim o extrato fica bem organizado.

Além disso, o usuário pode fazer depósitos tanto na conta Corrente quanto na conta Poupança, visto que a conta salário só pode receber dinheiro do seu empregador.
