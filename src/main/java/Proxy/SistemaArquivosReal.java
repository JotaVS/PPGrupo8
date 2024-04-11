package Proxy;

public class SistemaArquivosReal implements ISistemaArquivos {

    @Override
    public String readFile(String fileName, User user) {
        return "Lendo arquivo: " + fileName;
    }

    @Override
    public String writeFile(String fileName, User user) {
        return "Escrevendo arquivo: " + fileName;
    }

    @Override
    public String deleteFile(String fileName, User user) {
        return "Excluindo arquivo: " + fileName;
    }

}
