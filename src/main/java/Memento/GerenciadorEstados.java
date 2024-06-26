package Memento;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstados {
    private final List<EstadoGrafico> states = new ArrayList<>();

    public void addState(EstadoGrafico state) {
        states.add(state);
    }


    public EstadoGrafico getState(int index) {
        return states.get(index);
    }
}
