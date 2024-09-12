package buffer_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    InputStreamReader input_stream_object = new InputStreamReader(System.in);
    BufferedReader buffered_reader_object = new BufferedReader(input_stream_object);

    System.out.println(input_stream_object);
    System.out.println(buffered_reader_object.readLine());
  }
}