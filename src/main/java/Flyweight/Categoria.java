package Flyweight;

public class Categoria {

    private String nomeCategoria;

    private String icone;

    public Categoria(String nomeCategoria, String icone){
        this.nomeCategoria = nomeCategoria;
        this.icone = icone;

    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public String getIcone(){
        return icone;
    }
}
