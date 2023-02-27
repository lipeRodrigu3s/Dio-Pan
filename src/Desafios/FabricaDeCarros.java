package Desafios;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //int PercentualImpostos = scan.nextInt();
    System.out.println("Qual o custo de fabricação? ");
    int custoFabrica = scan.nextInt();

    System.out.println("Qual a porcentagem do distribuidor? ");
    int porcentagemDistribuidor = scan.nextInt();

    int custoConsumidor;
       
    int Distribuidor;
    //int ValorImpostos;
   
    Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
    custoConsumidor = Distribuidor;

    System.out.println("o valor final do carro novo é: " + custoConsumidor);
    }
    
}

