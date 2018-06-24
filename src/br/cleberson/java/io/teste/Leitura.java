package br.cleberson.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Leitura {

  public static void main(final String[] args) throws IOException {

    // Fluxo de Entrada com Arquivo
    final InputStream fis = new FileInputStream("lorem3.txt");

    // Fluxo de entrada de leitura
    final Reader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));

    // Buffer de leitura do fluxo de entrada
    try (final BufferedReader br = new BufferedReader(isr);) {
      br.lines().forEach(System.out::println);
      br.close();
    } catch (final IOException ex) {
      System.out.println("Não foi possível fechar o reader");
    }

  }

}
