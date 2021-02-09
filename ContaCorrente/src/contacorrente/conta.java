
package contacorrente;

import java.util.Scanner;


public class conta {
    String numero,nome;
  float saldo,limite,limEspecial;
  boolean especial=true;

  Scanner scan = new Scanner(System.in);


void sacar(){
  float saque;
  if(especial){
    limite = saldo+limEspecial;
    System.out.println("Informe o valor para saque:");
    saque = scan.nextFloat();
      if(saque>limite){
        System.out.println("Saldo insuficiente");
        System.out.println("Solicitado: "+saque+"\n Disponivel: "+limite);
      }else{
        limite = limite-saque;
        System.out.println("Saque efetivado\nSaldo: "+limite);
        saldo = saldo - saque;
    }
  }else{
    System.out.println("Informe o valor para saque:");
    saque = scan.nextFloat();
    if(saque>saldo){
      System.out.println("Saldo insuficiente");
        System.out.println("Solicitado: "+saque+"\n Disponivel: "+saldo);
    }else{
      saldo = saldo-saque;
      System.out.println("Saque efetivado\nSaldo: "+saldo);
    }
  }
  
  
}

void depositar(){
  float deposito;
  if(especial){
    System.out.println("Informe o valor do deposito");
    deposito = scan.nextFloat();
    saldo += deposito;
    System.out.println("Deposito efetivado\nSaldo atual: "+saldo);
    
  }else{
    System.out.println("Informe o valor do deposito");
    deposito = scan.nextFloat();
    saldo += deposito;
    System.out.println("Deposito efetivado\nSaldo atual: "+saldo);
  }

}
void consultarSaldo(){
  float total;
  if(especial){
    total = limEspecial+saldo;
    System.out.println("Saldo: "+saldo+"\nEspecial: "+limEspecial+"\nTotal para saque: "+total);

}else{
   System.out.println("Saldo: "+saldo);
}
}
    
}
