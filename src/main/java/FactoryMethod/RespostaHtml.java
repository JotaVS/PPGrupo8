package FactoryMethod;

public class RespostaHtml implements IRespostaHttp {

    @Override
    public String gerarResposta() {
        return "<html><body><h1>Hello, World!</h1></body></html>";
    }
}
