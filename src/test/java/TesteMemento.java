import Memento.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TesteMemento {
    @Test
    public void testeAdicionarCamada(){
        ProjetoGrafico projeto = new ProjetoGrafico();
        projeto.setTipoProjeto("Imagem");
        GerenciadorEstados gerenciador = new GerenciadorEstados();

        gerenciador.addState(projeto.saveStateToMemento());

        assertNull(projeto.getState());

        projeto.setState(AdicionarCamada.getInstance().getEstado());
        gerenciador.addState(projeto.saveStateToMemento());

        assertEquals("Camada Adicionada",projeto.getState());

        EstadoGrafico memento = gerenciador.getState(0);
        projeto.setStateFromMemento(memento);

        assertNull(projeto.getState());






    }




    @Test
    public void testMemento() {
        ProjetoGrafico projeto = new ProjetoGrafico();
        projeto.setTipoProjeto("Imagem");
        GerenciadorEstados gerenciador = new GerenciadorEstados();

        projeto.setState(AdicionarCamada.getInstance().getEstado());
        gerenciador.addState(projeto.saveStateToMemento());

        projeto.setState(FiltroPretoBranco.getInstance().getEstado());
        gerenciador.addState(projeto.saveStateToMemento());

        projeto.setState(Redimensionar.getInstance().getEstado());
        gerenciador.addState(projeto.saveStateToMemento());

        EstadoGrafico memento = gerenciador.getState(1);
        projeto.setStateFromMemento(memento);

        assertEquals("Filtro Preto e Branco Adicionado", projeto.getState());

        memento = gerenciador.getState(2);
        projeto.setStateFromMemento(memento);

        assertEquals("Redimensionado", projeto.getState());

        memento = gerenciador.getState(0);
        projeto.setStateFromMemento(memento);

        assertEquals("Camada Adicionada", projeto.getState());


        assertEquals("Imagem",projeto.getTipoProjeto());
    }
}
