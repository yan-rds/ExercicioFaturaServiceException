package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    private static List<Fatura> listaDeFaturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String vencimento) throws Exception{
        Consumidor consumidorReferencia = ServiceConsumidor.procurarConsumidorPeloEmail(email);
        Fatura novaFatura = new Fatura(consumidorReferencia, valor, vencimento);
        listaDeFaturas.add(novaFatura);
        return novaFatura;
    }

}
