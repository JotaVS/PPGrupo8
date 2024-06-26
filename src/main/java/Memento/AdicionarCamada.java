package Memento;

public class AdicionarCamada {

    private static AdicionarCamada instance = new AdicionarCamada();

    public static AdicionarCamada getInstance() {
        return instance;
    }


    public String getEstado() {
        return "Camada Adicionada";
    }

}
