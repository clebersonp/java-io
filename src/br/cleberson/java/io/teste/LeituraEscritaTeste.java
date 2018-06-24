package br.cleberson.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class LeituraEscritaTeste {

  public static void main(final String[] args) throws IOException {

    // Fluxo de entrada do arquivo em binario
    final InputStream fis = new FileInputStream("lorem.txt"); // System.in;
    // Fluxo de leitura dos bytes
    final Reader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
    // buffer de leitura dos caracteres
    final BufferedReader br = new BufferedReader(isr);

    // Fluxo de saida para arquivo em binario
    final OutputStream fos = new FileOutputStream("leitura_escrita.txt", Boolean.TRUE); // System.out;

    // Fluxo de escrita dos bytes
    final Writer osw = new OutputStreamWriter(fos, Charset.forName("UTF-8"));

    // buffer de escrica dos caracteres
    final BufferedWriter bw = new BufferedWriter(osw);

    var linha = br.readLine();
    while ((linha != null) && !linha.isEmpty()) {
      bw.write(linha);
      bw.newLine();
      bw.flush();
      linha = br.readLine();
    }

    // fechando os recursos
    br.close();
    bw.close();

    System.out.println("Terminou");

  }

}
