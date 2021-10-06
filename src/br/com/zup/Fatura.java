package br.com.zup;

import java.util.Date;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private Date vencimento;

    public Fatura(Consumidor consumidor, double valor, Date vencimento) {
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

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
}
