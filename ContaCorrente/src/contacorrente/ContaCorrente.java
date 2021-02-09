
package contacorrente;

import java.util.Date;
import java.util.Scanner;


public class ContaCorrente {


    public static void main(String[] args) {
        Date data = new Date();
        Scanner scan = new Scanner(System.in);
    

    conta conta1 = new conta();
    conta1.numero = "12345";
    conta1.nome = "jonas";
    conta1.especial = true;
    conta1.saldo = 0;
    conta1.limEspecial = 100;

    System.out.println(data);
    System.out.println("Bem vindo "+conta1.nome);
    System.out.println();
    int opcao = -1;
    while(opcao != 0){
    System.out.println("Escolha sua opção:\n(1)Consultar saldo\n(2)Sacar\n(3)Depositar\n(0)Sair");
    opcao = scan.nextInt();
    if(opcao == 1){
      System.out.println("--------------------");
      conta1.consultarSaldo();
      System.out.println("--------------------");
    }else if(opcao == 2){
      System.out.println("--------------------");
      conta1.sacar();
      System.out.println("--------------------");
    }else if(opcao == 3){
      System.out.println("--------------------");
      conta1.depositar();
      System.out.println("--------------------");
    }else if(opcao == 0){
      System.out.println("Volte sempre!");
    }else{
      System.out.println("Opção inválida");
    }
    }
    }
    
}
