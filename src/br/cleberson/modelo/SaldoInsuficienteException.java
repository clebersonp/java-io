package br.cleberson.modelo;

public class SaldoInsuficienteException extends Exception {

  private static final long serialVersionUID = 1L;

  public SaldoInsuficienteException(final String msg) {
    super(msg);
  }

}
