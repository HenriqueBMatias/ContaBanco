package edu.dio.desafiobanco;

import java.util.Scanner;

public class ContaTerminal {
    Scanner sc = new Scanner(System.in);
    int User;
    String Agency;
    String ClientName;
    double Balance;
    public void Execute() {
        System.out.println("Abrir conta? Digite 1 para sim e 2 para não:");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Insira o N° de usuario");
            int user = sc.nextInt();
            sc.nextLine();
            System.out.println("Insira o N° da agencia. Exemplo 0000-0");
            String Agency = sc.nextLine();
            System.out.println("Insira o nome do cliente");
            String ClientName = sc.nextLine();
            System.out.println("Valor do primeiro deposito");
            while (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida! Por favor, insira um valor numérico.");
            }
            Balance = sc.nextDouble();
            if (Balance > 0){
                System.out.println("Olá "+ ClientName + ", obrigado por criar uma conta em nosso banco, sua agência é "+ Agency +", conta " + User + " e seu saldo "+ Balance + " já está disponível para saque");
            }else{
                System.out.println("conta não validada");
                System.exit(0);
            }
        } else if (choice == 2) {
            System.out.println("Programa encerrado.");
            System.exit(0);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
            Execute();

        }
    }
}
