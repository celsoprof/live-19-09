package br.com.fiap.vetores;

import br.com.fiap.vetores.model.Game;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Colecoes {

    public static void main(String[] args) {

        //Double valor = 2.0;
        Integer y = 10;

        List<Integer> valores = new ArrayList<>();

        valores.add(10);
        valores.add(101);
        valores.add(23);
        valores.add(45);
        valores.add(67);
        valores.add(333);
        valores.add(321);
        valores.add(234);
        valores.add(45);
        valores.add(90);

        for(int valor: valores){
            System.out.println(valor);
        }

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

        List<Game> games = new ArrayList<>();
        games.add(g2);
        games.add(g2);
        games.add(g3);
        games.add(g1);
        games.add(g2);

        for(Game game : games){
            System.out.println(game.getTitulo());
        }

        boolean existe = games.contains(g1);
        System.out.println(existe);

        if(valores.contains(45)){
            System.out.println("ACHEI!!");
        } else {
            System.out.println("NÃO ACHEI!!!");
        }
        System.out.println("--------------");
        games.remove(g2);
        System.out.printf("TAMANHO DO VETOR: %s\n", games.size());
        for(Game game : games){
            System.out.println(game.getTitulo());
        }
        System.out.println("--------------");
        games.remove(1);
        System.out.printf("TAMANHO DO VETOR: %s\n", games.size());
        for(Game game : games){
            System.out.println(game.getTitulo());
        }

    }

}
