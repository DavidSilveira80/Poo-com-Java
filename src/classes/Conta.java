package classes;

public class Conta {
    private double saldo;
    private String agencia;
    private int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public void transfere(double valor, Conta recebedor){
        this.saldo -= valor;
        recebedor.saldo += valor;
    }
}
