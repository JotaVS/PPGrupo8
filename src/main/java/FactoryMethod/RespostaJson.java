package FactoryMethod;

public class RespostaJson implements IRespostaHttp {

    @Override
    public String gerarResposta() {
        return "{\"message\": \"Hello, World!\"}";
    }
}
