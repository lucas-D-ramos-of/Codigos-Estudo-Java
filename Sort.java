public class Sort {

    public int[] bubbleSort(int[] vetor){
        int aux = 0;
        for (int r = 0; r < vetor.length-1; r++){
            for (int i = 0; i < vetor.length-1; i++){

                if (vetor[i] > vetor[i+1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                }

            }
        }

        return vetor;
    }

    public int[] bubbleSortInverso(int[] vetor){
        int aux = 0;
        for (int r = vetor.length-1; r > 0 ; r--){
            for (int i = vetor.length-1; i > 0; i--){

                if (vetor[i] > vetor[i-1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = aux;
                }

            }
        }

        return vetor;
    }
    public int[] selectionSor(int[] vetor){

        int min = 0;
        int aux = 0;
        for (int i = 0; i < vetor.length-1; i++){
            min = i;
            for (int j = i+1; j < vetor.length-1; j++){

                if (vetor[i] > vetor[j]){
                    min = j;
                }

            }
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }

        return vetor;
    }

    public int[] insertionSort(int[] vetor){

        System.out.println("Insertion");
        int menor = 0;
        int aux = 0;
        for (int i = 0; i < vetor.length-1; i++){

            for (int j = i; j < vetor.length; j++){

                if (vetor[i] > vetor[j]){
                    menor = vetor[j];

                    for (int k = j; k > i; k--){
                       aux = vetor[k];
                       vetor[k] = vetor[k-1];
                       vetor[k-1] = aux;
                    }
                    vetor[i] = menor;
                }

            }

        }
        return vetor;
    }
}
