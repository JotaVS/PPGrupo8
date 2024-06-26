package Memento;

public class ProjetoGrafico {
    private String currentState;

    private String tipoProjeto;

    public void setState(String state) {
        this.currentState = state;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }


    public String getState() {
        return currentState;
    }
    public EstadoGrafico saveStateToMemento() {
        return new EstadoGrafico(currentState);
    }

    public void setStateFromMemento(EstadoGrafico memento) {
        currentState = memento.getState();
    }
}
