package Proxy;

import java.time.LocalDateTime;

public class LogProxy implements ISistemaArquivos{
    private ISistemaArquivos fileSystem;

    public LogProxy(ISistemaArquivos fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public String readFile(String fileName, User user) {
        return logAccess("Leitura", fileName, user);
    }

    @Override
    public String writeFile(String fileName, User user) {
        return logAccess("Escrita", fileName, user);
    }

    @Override
    public String deleteFile(String fileName, User user) {
        return logAccess("Exclusão", fileName, user);
    }

    private String logAccess(String operation, String fileName, User user) {
        LocalDateTime timestamp = SistemaHorario.getCurrentTime();
        return "Operação de " + operation + " em arquivo '" + fileName + "' registrada por " + user.getName() + " em " + "2024-04-09T12:00:00";
    }
}