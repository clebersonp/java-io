package br.cleberson.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaFileWriter {

  public static void main(final String[] args) throws IOException {

    final BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt", Boolean.TRUE));
    bw.append("Testando escrita de arquivo um pouco mais simplificado!");
    bw.newLine();
    bw.flush();
    bw.close();

    System.out.println("Fim do processo");

  }

}
