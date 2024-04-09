package org.example;

public interface ISistemaArquivos {
    String readFile(String fileName, User user);
    String writeFile(String fileName, User user);
    String deleteFile(String fileName, User user);

}
