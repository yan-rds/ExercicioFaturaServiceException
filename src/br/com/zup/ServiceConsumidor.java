package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceConsumidor {
    private static List<Consumidor> listaDeConsumidores = new ArrayList<>();

    public static void validarEmail (String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido");
        }
    }

    public static Consumidor cadastrarConsumidor (String email) throws Exception{
        validarEmail(email);
        Consumidor consumidor = new Consumidor(email);
        listaDeConsumidores.add(consumidor);
        return consumidor;
    }
}
