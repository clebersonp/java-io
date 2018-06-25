package br.cleberson.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Nico Steppat
 *
 */
// Se a classe mae implementar Serializable, todas as filhas tbm implementao automaticamente
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

  protected double saldo;
  private int agencia;
  private int numero;
  /*
   * Se eu nao quiser serializar e deserializar um atributo por composicao, utilio a palavra chave
   * transient; 
   * private transient Cliente titular;
   */
  private Cliente titular;
  private static int total = 0;

  /**
   * Construtor para inicializar o objeto Conta a partir da agencia e numero.
   *
   * @param agencia
   * @param numero
   */
  public Conta(final int agencia, final int numero) {
    Conta.total++;
    // System.out.println("O total de contas é " + Conta.total);
    this.agencia = agencia;
    this.numero = numero;
    // this.saldo = 100;
    // System.out.println("Estou criando uma conta " + this.numero);
  }

  public abstract void deposita(double valor);

  /**
   * Valor precisa ser maior do que o saldo.
   *
   * @param valor
   * @throws SaldoInsuficienteException
   */
  public void saca(final double valor) throws SaldoInsuficienteException {

    if (this.saldo < valor) {
      throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
    }

    this.saldo -= valor;
  }

  public void transfere(final double valor, final Conta destino) throws SaldoInsuficienteException {
    this.saca(valor);
    destino.deposita(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(final int numero) {
    if (numero <= 0) {
      System.out.println("Nao pode valor menor igual a 0");
      return;
    }
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(final int agencia) {
    if (agencia <= 0) {
      System.out.println("Nao pode valor menor igual a 0");
      return;
    }
    this.agencia = agencia;
  }

  public void setTitular(final Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public static int getTotal() {
    return Conta.total;
  }

  @Override
  public boolean equals(final Object ref) {

    final Conta outra = (Conta) ref;

    if (this.agencia != outra.agencia) {
      return false;
    }

    if (this.numero != outra.numero) {
      return false;
    }

    return true;
  }

  @Override
  public int compareTo(final Conta outra) {
    return Double.compare(this.saldo, outra.saldo);
  }

  @Override
  public String toString() {
    return "Conta [saldo=" + this.saldo + ", agencia=" + this.agencia + ", numero=" + this.numero
        + ", titular=" + this.titular + "]";
  }
}
