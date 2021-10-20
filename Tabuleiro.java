package model;
import java.lang.Math;

class Tabuleiro
{
  private int[][] matrizTab = new int[14][12] ; //[longitude][latitude]
  /*
   * Casa normal tem valor 0
   * Casa fechada tem valor -1
   * Casa com meta tem valor 1
   */
  
  Tabuleiro() 
  {
	  int i;
	  for(i = 0; i < 14; i++)// inicializa casas
	  {
	   for(int j = 0; j < 12; j++)
	   {
		   matrizTab[i][j] = 0;
	   }
	  }

   i = 0;
   while(i < 12) //atribui metas
   {
	   int latitude = gerador(1,12);
	   int longitude = gerador (0,11);
	   if(matrizTab[latitude][longitude] == 0)
	   {
		   matrizTab[latitude][longitude] = 1;
		   i++;
	   }
   }
   
   for(i = 0; i < 14; i++)// imprime casas
   {
	   for(int j = 0; j < 12; j++)
	   {

		   //System.out.print(i + "," + j + " ");
		   System.out.print(matrizTab[i][j] + " ");
	   }
	   System.out.println();
   }
   
  }
  
  
  private static int gerador(int min, int max)
  {
	  int range = (max-min);
	  return (int)(Math.random()*range) + min;
  }
  
  void modificaTabuleiro(int value, int latitude, int longitude)
  {
    matrizTab[latitude][longitude] = value;
  }

  
  int getCasa(int latitude, int longitude)
  {
    return matrizTab[latitude][longitude];
  }
}

