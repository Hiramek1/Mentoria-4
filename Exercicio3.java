/*
Proposta: Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. Fazer um programa que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
Dica: PODE ser usado Vetores, mas não de forma obrigatória
*/
import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {
        int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

    //Inicialização do Scanner
        Scanner entrada = new Scanner(System.in);

    //Loop para preencher 10 entidades
        for (int i=0; i<10; i++) {
            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção sexo inválido!");
            }
            if (altura > maior) {
                 maior = altura;
            } else if (altura < menor){
                menor = altura;
            }
        }
    //Calculo da media
        mediaHomens = somaH / qtHomens;

    //Impressão dos resultados na tela
        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);

    // Boa prática sempre fechar o Scanner
        entrada.close();
    }
}