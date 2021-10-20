package model;

class Explorador
{
  private int latitude;
  private final int latIni;
  private int longitude;
  private int objetivo;
  Jogador dono;
  
  Explorador(int latIni, Jogador dono)
  {
    this.latIni = latIni;
    this.latitude = latIni;
    this.dono = dono;
  }

  boolean movimento(int latitude, int longitude)
  {
    objetivo += latitude;
    if(this.latIni == 0)  // inicio no lado esquerdo
    {
      this.latitude += latitude;
    }
    else // inicio no lado direito;
    {
      this.latitude -= latitude;
    }
    this.longitude += longitude;
    
    if(this.longitude > 11) // ajuste na longitude
    {
      this.longitude -= 11;
    }
    else if (this.longitude < 11)
    {
      this.longitude += 11;
    }
    
    if (objetivo >= 13) { //alcançou lado oposto
      return true;
    }
    return false;
  }
  
  //movimento inicial
  protected boolean movimento(int latitude, int longitude, int longIni)
  {
    this.longitude = longIni;
    return this.movimento(latitude, longitude);
  }

  protected int getLatitude()
  {
    return this.latitude;
  }

  protected int getLongitude()
  {
    return this.longitude;
  }
}