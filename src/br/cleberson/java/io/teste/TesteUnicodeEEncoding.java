package br.cleberson.java.io.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TesteUnicodeEEncoding {

  public static void main(final String[] args) {

    // Para não ter problema de Encoding, deve-se utilizar o mesmo charset para transformar em bytes
    // e para transformar em string

    final String s = "Ã";
    System.out.println(s);
    System.out.println(s.codePointAt(0));

    final Charset charset = Charset.defaultCharset();
    System.out.println(charset.displayName());

    byte[] bytes = s.getBytes(StandardCharsets.ISO_8859_1);

    System.out.println(Arrays.asList(bytes));

    System.out.format("Tamanho do array: %d; %s %n", bytes.length,
        new String(bytes, StandardCharsets.ISO_8859_1));

    bytes = s.getBytes(StandardCharsets.UTF_16BE);
    System.out.format("Tamanho do array: %d; %s %n", bytes.length,
        new String(bytes, StandardCharsets.UTF_16BE));

    System.out.println(Arrays.asList(bytes));

  }

}
