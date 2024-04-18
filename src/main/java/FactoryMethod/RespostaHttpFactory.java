package FactoryMethod;

public class RespostaHttpFactory {

    public static IRespostaHttp criarResposta(String tipoResposta) {
        switch (tipoResposta.toLowerCase()) {
            case "html":
                return new RespostaHtml();
            case "json":
                return new RespostaJson();
            case "xml":
                return new RespostaXml();
            default:
                throw new IllegalArgumentException("Tipo de resposta desconhecido: " + tipoResposta);
        }
    }
}
