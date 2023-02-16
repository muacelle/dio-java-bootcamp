package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Xandinha", 3, "preto"));
            add(new Gato("Trocinho", 4, "tigrado-cinza"));
            add(new Gato("Bia", 6, "tigrado-laranja"));
        }};

        System.out.println(meusGatos);

        // Ordene a lista em ordem natural (nome)

        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // Ordene a lista por ordem de idade

        Collections.sort(meusGatos, new ComparatorIdade());
        // OU meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

    }
}
