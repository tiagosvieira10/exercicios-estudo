package ContaBancaria;

public class Conta {
    String nome;
    double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    void Depositar(int valor) {
        saldo += valor;
    }

    void Sacar(int valor) {
        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente");
        } if (valor <0) {
            throw new RuntimeException("Valor invalido");
        }
        saldo -= valor;
    }

    public void Transferir(int valor) {

    }


}
