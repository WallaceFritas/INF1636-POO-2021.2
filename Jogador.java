package model;

class Jogador{

  private String cor;
  private int qtdPontos = 0, numJogador, qtdExploradores = 6;
  public Explorador[] listaExploradores = new Explorador[6]; 

  public Jogador( String corJog, int numJog, int ladoInicial) {
    this.cor = corJog;
    this.numJogador = numJog;
    for(int i = 0; i < 6; i++)
    {
      listaExploradores[i] = new Explorador(ladoInicial, this);
    }

  }

  int getExploradores() {
    return qtdExploradores;
  }

  void setEXploradores(int num) {
    this.qtdExploradores = num;
  }

  String getColor() {
    return cor;
  }

  int getPontos() {
    return qtdPontos;
  }

  int getNumJogador() {
    return numJogador;
  }

  void setNumJogador(int num) {
    this.numJogador = num;
  }

  void setPontos(int numPontos) {
    this.qtdPontos = numPontos;
  }
}