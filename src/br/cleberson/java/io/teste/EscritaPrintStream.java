package br.cleberson.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class EscritaPrintStream {

  public static void main(final String[] args) throws IOException {

    // final PrintWriter ps = new PrintWriter(new FileOutputStream("lorem4.txt", Boolean.TRUE),
    // Boolean.TRUE, Charset.forName("UTF-8"));
    final PrintStream ps = new PrintStream(new FileOutputStream("lorem4.txt", Boolean.TRUE),
        Boolean.TRUE, Charset.forName("UTF-8"));

    ps.println("Testando mais uma outra maneira de escrever em arquivos");
    ps.println();
    ps.println("Fim do teste");
    ps.close();

    System.out.println("Fim do processo");

  }

}
