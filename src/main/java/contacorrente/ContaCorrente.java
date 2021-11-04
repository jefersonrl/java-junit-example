package contacorrente;

public class ContaCorrente {
    
    private double saldo;
    
    public void depositar(double valorEsperado){
        saldo += valorEsperado;
        System.out.println("Deposito realizado.");
    }
    
    public void sacar(double valorSaque){
        if(valorSaque <= this.saldo){
            saldo -= valorSaque;
            System.out.println("Saque realizado.");
        }else{
            System.out.println("Saldo insuficiente. Saque não realizado");
        }
    }
    
    public double consultaSaldo(){
        return saldo;
    }
    
}