package exerciciocomparator;

import java.util.Comparator;

public class PokemonOrdenNaturalComparator implements Comparator<Pokemon> {

    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return o1.getNumero() - o2.getNumero();
    }
}
