package br.com.fiap.vetores;

public class Matriz {

    public static void main(String[] args) {

        int[][] valores = new int[2][3];

        valores[0][0] = 8;
        valores[0][1] = 3;
        valores[0][2] = 13;
        valores[1][0] = 10;
        valores[1][1] = 14;
        valores[1][2] = 65;

        System.out.println(valores[1][0]);
        valores[1][0] = 99;
        System.out.println(valores[1][0]);
        System.out.println(valores[1][2]);

        System.out.println();
        System.out.println("---------ITERAÇÃO NA MATRIZ-----------");

        //System.out.println(valores.length);

        for(int linha = 0; linha < valores.length; linha++){
            //System.out.println(valores[linha].length);
            for(int coluna = 0; coluna < valores[linha].length; coluna++){
                System.out.print(valores[linha][coluna] + " ");
            }
            System.out.println();
        }

    }

}
