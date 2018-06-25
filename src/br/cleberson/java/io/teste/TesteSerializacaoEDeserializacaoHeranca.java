package br.cleberson.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import br.cleberson.modelo.Cliente;
import br.cleberson.modelo.Conta;
import br.cleberson.modelo.ContaCorrente;

public class TesteSerializacaoEDeserializacaoHeranca {

  public static void main(final String[] args) throws Exception {

    final Conta cc = new ContaCorrente(22, 33);
    cc.setTitular(new Cliente("Cleberson", 33, "Desenvolvedor", 1500.0));

    // Serializacao do objeto conta corrente
    final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
    oos.writeObject(cc);
    oos.close();

    // Deserializacao da conta corrente
    final ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
    final Conta contaCorrente = (ContaCorrente) ois.readObject();
    System.out.println(contaCorrente);
    ois.close();

  }

}
