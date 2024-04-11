package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class SIG {

    private List<PontoInteresse> pontoInteresses = new ArrayList<>();

    public void cadastrarPOI(String nomePoi, String nomeCategoria, String icone) {
        Categoria categoria = CategoriaFactory.getCategoria(nomeCategoria, icone);
        PontoInteresse poi = new PontoInteresse(nomePoi, categoria);
        pontoInteresses.add(poi);
    }


    public List<String> obterPois(){
        List<String> saida = new ArrayList<String>();
        for (PontoInteresse poi: this.pontoInteresses){
            saida.add(poi.obterPoi());
        }
        return saida;
    }
}
