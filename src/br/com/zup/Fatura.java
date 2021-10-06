package br.com.zup;

import java.util.Date;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private String vencimento;

    public Fatura(Consumidor consumidor, double valor, String vencimento) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public Fatura() {
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        StringBuilder concatenador = new StringBuilder();
        concatenador.append("\nConsumidor " + consumidor);
        concatenador.append("\nValor " + valor);
        concatenador.append(("\nVencimento" + vencimento));
        return concatenador.toString();
    }
}
