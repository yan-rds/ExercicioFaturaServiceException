package br.com.zup;

import java.util.Scanner;

public class Sistema {





    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Consumidor instanciarConsumidor() throws Exception{
        String email = capturarDados("Qual é o email deste consumidor?").nextLine();
        return ServiceConsumidor.cadastrarConsumidor(email);
    }

    public static Fatura instanciarFatura() throws Exception{
        String email = capturarDados("Qual é o email do consumidor à ter esta fatura adicionada?").nextLine();
        double valor = capturarDados("Qual o valor da fatura?").nextDouble();
        String vencimento = capturarDados("Qual é a data de vencimento?").nextLine();
        return ServiceFatura.cadastrarFatura(email, valor, vencimento);
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
