class Exercicio1 {
  public static void main(String[] args) {
    int maior = 0;
    int[] vetor = new int[10];
    vetor[0] = 1;
    vetor[1] = 3;
    vetor[2] = 9;
    vetor[3] = 5;
    vetor[4] = 4;
    vetor[5] = 10;
    for (int i=0; i < vetor.length; i++ ) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }
    System.out.println("Maior elemento no vetor: " + maior);
  }
}