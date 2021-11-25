package exerciciocomparator;

import java.util.Comparator;

public class PokemonOrdemInversaComparator implements Comparator<Pokemon> {

    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return o2.getNumero() - o1.getNumero();
    }
}
