package buffer_reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Pessoa {
  Double altura;

  Pessoa(double altura) {
    this.altura = altura;
  }

  @Override
  public String toString() {
    return this.altura.toString();
  }

}

public class Main {
  public static void main(String[] args) {
    InputStreamReader input_stream_object = new InputStreamReader(System.in);
    BufferedReader buffered_reader_object = new BufferedReader(input_stream_object);

    System.out.println(input_stream_object);
    System.out.println(buffered_reader_object);

    Pessoa carlos = new Pessoa(1.40);

    System.out.println(carlos);
  }
}