package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crie uma lista e adicione três notas

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);

        // Exiba a posição da nota 8.5

        notas.indexOf(8.5);

        // Adicione na lista a nota 8.0 na posição 2

        notas.add(2, 8d);

        // Substitua a nota 7.0 por 5.0

        notas.set(notas.indexOf(7d), 5.0);

        // Confira se a nota 5.0 está na lista

        notas.contains(5d);

        // Exiba a terceira nota da lista

        notas.get(2);

        // Exiba a menor e a maior nota

        Collections.min(notas);
        Collections.max(notas);

        // Some todas as notas

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        // Exiba a média das notas

        Double media = soma / notas.size();

        // Exiba a lista em ordem aleatória

        Collections.shuffle(notas);

        // Remova a nota 8.0

        notas.remove(8d);

        // Remova a nota na posição 0

        notas.remove(0);

        // Apague toda a lista

        notas.clear();

        // Confira se a lista está vazia

        notas.isEmpty();

    }
}
