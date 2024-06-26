package Memento;

public class Redimensionar {

    private static Redimensionar instance = new Redimensionar();

    public static Redimensionar getInstance() {
        return instance;
    }


    public String getEstado() {
        return "Redimensionado";
    }

}
