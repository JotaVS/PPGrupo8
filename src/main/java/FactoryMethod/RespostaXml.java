package FactoryMethod;

public class RespostaXml implements IRespostaHttp {

    @Override
    public String gerarResposta() {
        return "<message>Hello, World!</message>";
    }

}
