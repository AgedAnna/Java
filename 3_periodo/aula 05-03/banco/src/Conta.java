public class Conta {
    private String Titular;
    private int NumeroConta;
    private double Saldo;
    private double Sacar;
    private double Depositar;

    public int getNumeroConta() {
        return NumeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getSacar() {
        return Sacar;
    }

    public void setSacar(double sacar) {
        Sacar = sacar;
    }

    public double getDepositar() {
        return Depositar;
    }

    public void setDepositar(double depositar) {
        Depositar = depositar;
    }

}
