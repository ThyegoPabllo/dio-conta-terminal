public class ContaTerminal2 {
    
public static void main(String[] args) {
    
double saldo = 15;
double valorSolicitado = 22;

// Verificação e processamento do saque
if (saldo >= valorSolicitado){
    saldo -= valorSolicitado;
}

else 
System.out.println("Valor insuficiente");


// Exibindo o saldo após a operação
System.out.println("Saldo atual: " + saldo);


}

}
