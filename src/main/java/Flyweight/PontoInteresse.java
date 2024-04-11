package Flyweight;

public class PontoInteresse {

    private String nome;

    private Categoria categoria;

    public PontoInteresse(String nome,Categoria categoria ){
        this.nome = nome;
        this.categoria = categoria;
    }

    public String obterPoi() {
        return "Poi{" +
                "nome='" + this.nome + '\'' +
                ", categoria='" + categoria.getNomeCategoria() + '\'' +
                ", icone='" + categoria.getIcone() + '\'' +
                '}';
    }




}
