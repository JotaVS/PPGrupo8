package Memento;

public class FiltroPretoBranco {

    private static FiltroPretoBranco instance = new FiltroPretoBranco();

    public static FiltroPretoBranco getInstance() {
        return instance;
    }


    public String getEstado() {
        return "Filtro Preto e Branco Adicionado";
    }
}
