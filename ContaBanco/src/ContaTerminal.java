public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        double saldo = 25;
        double valorSolicitado = 18;


        // Verificação e processamento do saque
        if (saldo >= valorSolicitado) {
            saldo -=valorSolicitado;
        }


      
        else
        System.out.println("Saldo insuficiente");


        // Exibindo o saldo após a operação
        System.out.println("Saldo atual: " + saldo);

        //Ação efetuada com sucesso, valor do saldo após saque, sendo exibido sem erros

    }
}
