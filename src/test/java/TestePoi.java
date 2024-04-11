import Flyweight.CategoriaFactory;
import Flyweight.SIG;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestePoi {

    @Test
    void retornarPois(){
        SIG sig = new SIG();
        sig.cadastrarPOI("Restaurante do Mineiro","Restaurante","rest.png");
        sig.cadastrarPOI("Restaurante do Paulista","Restaurante","rest.png");
        sig.cadastrarPOI("Praça Vargas","Praça","prac.png");
        sig.cadastrarPOI("Escola Academia","Escola","esc.png");

        List<String> saida = Arrays.asList(
                "Poi{nome='Restaurante do Mineiro', categoria='Restaurante', icone='rest.png'}",
                "Poi{nome='Restaurante do Paulista', categoria='Restaurante', icone='rest.png'}",
                "Poi{nome='Praça Vargas', categoria='Praça', icone='prac.png'}",
                "Poi{nome='Escola Academia', categoria='Escola', icone='esc.png'}");

        assertEquals(saida, sig.obterPois());

    }

    @Test
    void retornarTotalCategorias(){

        SIG sig = new SIG();
        sig.cadastrarPOI("Restaurante do Mineiro","Restaurante","rest");
        sig.cadastrarPOI("Restaurante do Paulista","Restaurante","rest");
        sig.cadastrarPOI("Praça Vargas","Praça","prac");
        sig.cadastrarPOI("Escola Academia","Escola","esc");

        assertEquals(3, CategoriaFactory.getTotalCategorias());


    }
}
