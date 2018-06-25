package br.cleberson.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import br.cleberson.modelo.Cliente;

public class TesteSerializacaoEDeserializacao {

  private static final String OBJETO_DE_CLIENTE_BIN = "objeto_de_cliente.bin";

  public static void main(final String[] args)
      throws FileNotFoundException, IOException, ClassNotFoundException {

    final Cliente cleberson =
        new Cliente("Cleberson Pedreira Pauluci", 33, "Desenvolvedor Java", 3000.0);

    final ObjectOutputStream oos =
        new ObjectOutputStream(new FileOutputStream(OBJETO_DE_CLIENTE_BIN));
    oos.writeObject(cleberson);
    oos.flush();
    oos.close();

    final ObjectInputStream ois = new ObjectInputStream(new FileInputStream(OBJETO_DE_CLIENTE_BIN));
    final Cliente cliente = (Cliente) ois.readObject();
    System.out.println(cliente);
    ois.close();

  }

}
