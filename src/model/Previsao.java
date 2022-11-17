package model;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Previsao{
  private final int codigo;
  private final double temperaturaMinima;
  private final double temperaturaMaxima;
  private final String cidade;
  private final String data;
}
