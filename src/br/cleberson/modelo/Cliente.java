package br.cleberson.modelo;

public class Cliente {

  private String nome;
  private Integer idade;
  private String profissao;
  private Double salario;

  public Cliente() {
    super();
  }

  public Cliente(final String nome, final Integer idade, final String profissao,
      final Double salario) {
    this.nome = nome;
    this.idade = idade;
    this.profissao = profissao;
    this.salario = salario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(final String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return this.idade;
  }

  public void setIdade(final Integer idade) {
    this.idade = idade;
  }

  public String getProfissao() {
    return this.profissao;
  }

  public void setProfissao(final String profissao) {
    this.profissao = profissao;
  }

  public Double getSalario() {
    return this.salario;
  }

  public void setSalario(final Double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Cliente [nome=" + this.nome + ", idade=" + this.idade + ", profissao=" + this.profissao
        + ", salario=" + this.salario + "]";
  }
}
