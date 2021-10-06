package br.com.zup;

import java.util.List;
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
        System.out.println("Para verificar todas as faturas de um consumidor, digite 3");
        int escolhaMenu = capturarDados("Para sair, digite 4").nextInt();
        return escolhaMenu;
    }

    public static List<Fatura> pesquisarFatura () throws Exception{
        String email = capturarDados("Qual é o email do consumidor?").nextLine();
        return ServiceFatura.pesquisarFaturasPorEmail(email);

    }

    public static void executar() throws Exception{
        boolean loop = true;
        while (loop) {
            switch (menuInicial()) {
                case 1:
                    instanciarFatura();
                    break;
                case 2:
                    instanciarConsumidor();
                    break;
                case 3:
                    System.out.println(pesquisarFatura());
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }

    }
}
