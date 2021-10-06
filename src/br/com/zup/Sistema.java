package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static List<Fatura> listaDeFaturas = new ArrayList<>();



    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Consumidor instanciarConsumidor() throws Exception{
        String email = capturarDados("Qual é o email deste consumidor?").nextLine();
        return ServiceConsumidor.cadastrarConsumidor(email);
    }

    public static Fatura instanciarFatura() throws Exception{
        Consumidor consumidor = instanciarConsumidor();
        double valor = capturarDados("Qual o valor da fatura?").nextDouble();
        String vencimento = capturarDados("Qual é a data de vencimento?").nextLine();
        Fatura fatura = new Fatura(consumidor, valor, vencimento);
        listaDeFaturas.add(fatura);
        return fatura;
    }

    public static int menuInicial(){
        System.out.println("Para cadastrar uma fatura, digite 1");
        System.out.println("Para cadastrar apenas um consumidor, digite 2");
        int escolhaMenu = capturarDados("Para sair, digite 3").nextInt();
        return escolhaMenu;
    }

    public static void executar(){
        boolean loop = true;
        while (loop) {
            switch (menuInicial()) {
                case 1:
                    instanciarFatura();
                    System.out.println(listaDeFaturas);
                    break;
                case 2:
                    instanciarConsumidor();
                case 3:
                    loop = false;
                    break;
            }
        }

    }
}
