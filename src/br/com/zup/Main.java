package br.com.zup;

public class Main {

    public static void main(String[] args) {
        boolean loopException = true;
        while (loopException) {
            try {
                Sistema.executar();
            } catch (Exception excecao) {
                System.out.println(excecao.getMessage());

            }
        }
    }
}
