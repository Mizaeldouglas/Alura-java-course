import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ContaBancaria extends Cliente{

    private double saldo;


 public  void depositar(double valor) {
        saldo += valor;
        if (saldo < 0){

        }
     System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);

 }

 public void sacar(double valor) {
     if (valor > saldo) {
         System.out.println("Saldo insuficiente.");
     } else {
         saldo -= valor;
         System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
     }

 }

 public void verificarSaldo() {
     System.out.println("Seu saldo atual é de: " + saldo);
 }


}
