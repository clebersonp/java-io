package br.cleberson.modelo;

// new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

  public ContaCorrente(final int agencia, final int numero) {
    super(agencia, numero);
  }

  @Override
  public void saca(final double valor) throws SaldoInsuficienteException {
    final double valorASacar = valor + 0.2;
    super.saca(valorASacar);
  }

  @Override
  public void deposita(final double valor) {
    super.saldo += valor;
  }

  @Override
  public double getValorImposto() {
    return super.saldo * 0.01;
  }

  @Override
  public String toString() {
    return "ContaCorrente, " + super.toString();
  }

}
