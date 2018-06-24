package br.cleberson.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public class Escrita {

  public static void main(final String[] args) throws IOException {

    // Fluxo de dados binarios de um arquivo
    final OutputStream fos = new FileOutputStream("lorem3.txt", Boolean.TRUE);

    // Leitor de binarios
    final Writer writer = new OutputStreamWriter(fos, Charset.forName("UTF-8"));

    // ler os binarios e gravar no arquivo os caracteres
    final BufferedWriter bw = new BufferedWriter(writer);

    final var lorem = "Ação, Política, corrupção, anão, falação, comilão, cachaça, maçã";
    bw.append(lorem);
    bw.newLine();
    bw.flush();
    bw.close();
  }

}
