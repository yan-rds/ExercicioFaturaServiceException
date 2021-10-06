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

    public static void verificarEmailRepetido (String email) throws Exception{
        for (Consumidor consumidorReferencia : listaDeConsumidores){
            if (consumidorReferencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email repetido");
            }
        }
    }

    public static Consumidor procurarConsumidorPeloEmail (String email) throws Exception{
        for (Consumidor consumidorReferencia : listaDeConsumidores){
            if (consumidorReferencia.getEmail().equalsIgnoreCase(email)){
                return consumidorReferencia;
            }
        }
        throw new Exception("Email não cadastrado");
    }

    public static Consumidor cadastrarConsumidor (String email) throws Exception{
        validarEmail(email);
        verificarEmailRepetido(email);
        Consumidor consumidor = new Consumidor(email);
        listaDeConsumidores.add(consumidor);
        return consumidor;
    }
}
