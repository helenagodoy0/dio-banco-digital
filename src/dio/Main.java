package dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente helena = new Cliente();
        helena.setNome("Helena");

        Conta cc = new ContaCorrente(helena);
        Conta poupanca = new ContaPoupanca(helena);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Scanner scan = new Scanner(System.in);
        int valor = 0;
        int op = 0;
        do {

        System.out.println("1 - Depositar na Conta Corrente");
        System.out.println("2 - Depositar na Poupança");
        System.out.println("3 - Sacar na Conta Corrente");
        System.out.println("4 - Sacar na Poupança");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção: ");
        op = scan.nextInt();

            if (op == 1) {
                System.out.println("Valor: ");
                valor = scan.nextInt();
                cc.depositar(valor);
                cc.imprimirExtrato();
            } else if (op == 2) {
                System.out.println("Valor: ");
                valor = scan.nextInt();
                poupanca.depositar(valor);
                poupanca.imprimirExtrato();
            } else if (op == 3) {
                System.out.println("Valor: ");
                valor = scan.nextInt();
                cc.sacar(valor);
                cc.imprimirExtrato();
            } else if (op == 4) {
                System.out.println("Valor: ");
                valor = scan.nextInt();
                poupanca.sacar(valor);
                poupanca.imprimirExtrato();
            } else if (op >= 5) {
                System.out.println("Escolha uma opção valida");
            }
        } while (op != 0);

    }
}
