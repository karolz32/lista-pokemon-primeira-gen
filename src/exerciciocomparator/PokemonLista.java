package exerciciocomparator;
//construindo uma lista de pokemons

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PokemonLista {
    public static void main(String[] args) {

        List<Pokemon> primeiraGen = new ArrayList<>();

        primeiraGen.add(new Pokemon(5, "Charmeleon", "Fogo"));
        primeiraGen.add(new Pokemon(3, "Venusaur", "Planta/Venenoso"));
        primeiraGen.add(new Pokemon(4, "Charmander", "Fogo"));
        primeiraGen.add(new Pokemon(1, "Bulbasaur", "Planta/Venenoso"));
        primeiraGen.add(new Pokemon(2, "Ivysaur", "Planta/Venenoso"));
        primeiraGen.add(new Pokemon(7, "Squirtle", "Água"));
        primeiraGen.add(new Pokemon(9, "Blastoise", "Água"));
        primeiraGen.add(new Pokemon(6, "Charizard", "Fogo/Voador"));
        primeiraGen.add(new Pokemon(8, "Wartortle", "Água"));

        System.out.println("----Ordem de Inserção da Lista----");
        System.out.println(primeiraGen);

        //Ordene implementando a interface java.util.Comparator
        Collections.sort(primeiraGen, new PokemonOrdenNaturalComparator());
        System.out.println("----Ordenamento natural pelo número do pokémon----");
        System.out.println(primeiraGen);
        Collections.sort(primeiraGen, new PokemonOrdemInversaComparator());
        System.out.println("----Ordenamento reverso pelo número do pokémon----");
        System.out.println(primeiraGen);

        //Ordene implementando a interface java.util.Comparable
        Collections.sort(primeiraGen);
        System.out.println("----Ordenamento natural pelo número do pokémon----");
        System.out.println(primeiraGen);

        //Ordene usando uma expressão lamda
        primeiraGen.sort((first, second) -> first.getNumero() - second.getNumero());
        System.out.println("----Ordenamento natural pelo número do pokémon----");
        System.out.println(primeiraGen);

        //Ordene usando referências de métodos
        primeiraGen.sort(Comparator.comparingInt(Pokemon::getNumero));
        System.out.println("----Ordem natural pelo número do pokémon (method reference)----");
        System.out.println(primeiraGen);

        primeiraGen.sort(Comparator.comparingInt(Pokemon::getNumero).reversed());
        System.out.println("----Ordenamento reverso pelo número do pokémon (method reference)----");
        System.out.println(primeiraGen);




    }
}
