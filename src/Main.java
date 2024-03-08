import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

class Main{
    public static void main(String[] args) {
        String testo = readFile("Dati.txt"); 
        String testoCrittografato = Cryto.Cesar(testo, 5);
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una chiave: ");
        String chiave = in.nextLine();
        String xor = Cryto.xorAlgo(testoCrittografato, chiave);
        System.out.println(xor);
        in.close();

  }

  public static String readFile(String filename) {
    String acc = "";
    try {
      File myObj = new File(filename);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        acc += data;
      }
      myReader.close();
      return acc;
    } catch (FileNotFoundException e) {
      System.out.println("Potrebbe esserci un errore");
      e.printStackTrace();
    }
  return null;
    }

    public static void saveFile(String filename, String data) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
    writer.append(data);
    writer.close();
    } catch (IOException e) {
      System.out.println("Potrebbe esserci un errore");
      e.printStackTrace();
    }
  }


}