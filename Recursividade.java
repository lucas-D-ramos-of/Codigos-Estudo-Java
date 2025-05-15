public class Recursividade {

    public int fatorial(int f){

        if (f == 0)
            return 1;

        return f*fatorial(f-1);
    }

    public int progressao(int p){

        if (p <= 0){
            return 0;
        }

        return p+progressao(p-2);
    }

    public int fibonacci(int fi){

        if (fi <= 1){
            return fi;
        }
        return fibonacci(fi - 1) + fibonacci(fi - 2);
    }

    public int somaArray(int[] arr, int indice){

        if (indice == arr.length)
            return 0;

        return arr[indice] + somaArray(arr, indice+1);

    }

    public int contarAte(int n){

        if (n > 10)
            return 0;

        System.out.println(n);
        return contarAte(n+1);

    }

    public int contarInverso(int n){

        if (n == 0)
            return 0;

        System.out.println(n);
        return contarInverso(n-1);

    }

    public int caractere(byte[] b, int i, int upper){

        if (i == b.length)
            return upper;

        if (b[i] > 64 && b[i] < 91){
            upper+= 1;
            System.out.println(b[i]);
        }


        return caractere(b, i+1, upper);
    }

    public int palindromo(byte[] p, int index, int max){

        if (index >= p.length || max < 0){
            return 1;
        }
        if (p[index] != p[max]){
            return -1;
        } else if (index == max){
            return 1;
        }
        return palindromo(p, index+1, max-1);
    }


    public String chamaInverteString(byte[] inverso){

        inverso = inverteString(inverso, 0, inverso.length-1);

        return new String(inverso);
    }
    public byte[] inverteString(byte[] s, int index, int max){
        byte aux = 0;


        if (index >= s.length || max < 0){
            return s;
        } else if (index == max){
            return  s;
        }

        aux = s[index];
        s[index] = s[max];
        s[max] = aux;

        return inverteString(s, index+1, max-1);

    }

    public int potencia(int base, int potencia){
        if (potencia == 0){
            return 1;
        }

        return base * potencia(base, potencia-1);
    }

    public int contaPares(int[] i, int index, int par){
        if (index == i.length)
            return par;

        if (i[index] %2 == 0){
            par++;
        }

        return contaPares(i, index+1, par);
    }
}
