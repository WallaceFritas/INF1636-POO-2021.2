package model;

public class modelAPI
{
  final Tabuleiro mapa = new Tabuleiro();
  final Jogador P1;
  final Jogador P2;
  final Jogador P3;
  final Jogador P4;
  final Dado D1;
  final Dado D2;
  final Dado D3;
  
  public modelAPI(int numJogadores, int modo)
  {
    P1 = new Jogador("azul", 1, 0);
    P2 = new Jogador("verde", 2, 0);

    if(numJogadores == 2)
    {
      P3 = null;
      P4 = null;
    }

    else
    {
      P3 = new Jogador("vermelho", 3, 13);
      P4 = new Jogador("amarelo", 4, 13 );
    }
  }

  D1 = new Dado();
  D2 = new Dado();
  D3 = new Dado();

}