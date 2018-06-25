package br.cleberson.java.io.teste;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;
import br.cleberson.modelo.Cliente;

public class TesteLeitura2 {

  public static void main(final String[] args) throws Exception {

    final Scanner sc = new Scanner(new FileInputStream("objeto_cliente.csv"));
    final String separador = ",";
    while (sc.hasNextLine()) {
      final String linha = sc.nextLine();
      // System.out.println(linha);

      final Scanner linhaScanner = new Scanner(linha);
      linhaScanner.useDelimiter(separador);
      linhaScanner.useLocale(Locale.US);

      final String nome = linhaScanner.next();
      final int idade = linhaScanner.nextInt();
      final String profissao = linhaScanner.next();
      final double salario = linhaScanner.nextDouble();

      System.out.format(Locale.forLanguageTag("pt-BR"),
          "Nome: %s, Idade: %d, Profissão: %s, Salário: %.2f %n", nome, idade, profissao, salario);

      final Cliente cliente = new Cliente(nome, idade, profissao, salario);

      // System.out.println(cliente);

      linhaScanner.close();
    }
    sc.close();
  }
}
