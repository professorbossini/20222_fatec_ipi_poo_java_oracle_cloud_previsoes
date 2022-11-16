package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Previsao {
  private int codigo;
  private double temperaturaMinima;
  private double temperaturaMaxima;
  private String data;
  private String cidade;

}
