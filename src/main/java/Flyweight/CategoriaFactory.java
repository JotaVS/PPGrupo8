package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CategoriaFactory {

    private static Map<String, Categoria> categorias = new HashMap<>();

    public static Categoria getCategoria(String categoriaNome, String icone){
        Categoria categoria = categorias.get(categoriaNome);
        if (categoria == null) {
            categoria = new Categoria(categoriaNome, icone);
            categorias.put(categoriaNome, categoria);
        }
        return categoria;
    }

    public static int getTotalCategorias() {
        return categorias.size();
    }


}
