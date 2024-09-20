package br.com.fiap.vetores;

import br.com.fiap.vetores.model.Game;

import java.time.Year;

public class Vetor {

    public static void main(String[] args) {

        /*double[] notas = new double[4];
        notas[0] = 9.8;
        notas[1] = 8.7;
        notas[2] = 10;
        notas[3] = 6.7;

        System.out.println("A terceira nota é: " + notas[2]);

        String nomes[] = new String[5];
        nomes[0] = "Ana";
        nomes[1] = "Fabiana";
        nomes[2] = "Carlos";
        nomes[3] = "Pedro";
        nomes[4] = "Julia";

        System.out.println(nomes[3]);

        nomes[3] = "Pedro da Silva";

        System.out.println(nomes[3]);
        System.out.println();
        System.out.println("------WHILE--------");
        System.out.println(nomes.length);
        int i = 0;
        while (i < nomes.length){
            System.out.println(nomes[i]);
            i++; // i = i + 1
        }
        System.out.println("FIM");

        System.out.println();
        System.out.println("------FOR--------");
        for(int cont = 0; cont < nomes.length; cont++){
            System.out.println(nomes[cont]);
        }

        System.out.println();
        System.out.println("------FOR EACH--------");
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println();
        System.out.println("--------------");

        String[] estados = {"SP", "CE", "RJ", "PE", "AM", "PI"};

        for(String estado: estados){
            System.out.println(estado);
        }*/

        Game g1 = new Game();
        g1.setTitulo("Ikari Warriors");
        g1.setEstudio("Namco");
        g1.setValor(199.99);
        g1.setAnoLancamento(Year.of(1985));

        Game g2 = new Game();
        g2.setTitulo("Ninja Turtles");
        g2.setEstudio("Konami");
        g2.setValor(209.99);
        g2.setAnoLancamento(Year.of(1988));

        Game g3 = new Game();
        g3.setTitulo("Street Fighter II");
        g3.setEstudio("Capcom");
        g3.setValor(299.99);
        g3.setAnoLancamento(Year.of(1992));

        Game[] games = new Game[3];
        games[0] = g1;
        games[1] = g2;
        games[2] = g3;

        System.out.println(games[1].getTitulo());
        System.out.println();
        System.out.println("--------------------");

        for(Game game: games){
            System.out.printf("Nome do jogo %s.\nEstúdio: %s\n", game.getTitulo(), game.getEstudio());
//            System.out.println(game.getEstudio());
//            System.out.println(game.getAnoLancamento());
//            System.out.println(game.getValor());
            System.out.println("--------------------");
        }

        System.out.println();
        System.out.println("---------FOR TRADICIONAL -----------");

        for(int contador = 0; contador < games.length; contador++){
            System.out.println(games[contador].getTitulo());
            System.out.println(games[contador].getEstudio());
            System.out.println(games[contador].getAnoLancamento());
            System.out.println(games[contador].getValor());
            System.out.println("--------------------");
        }

    }

}
