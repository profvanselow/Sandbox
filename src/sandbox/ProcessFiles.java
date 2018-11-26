package sandbox;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class ProcessFiles {
  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles() {
    p = Paths.get("C:/LineTests");
    p2 = Paths.get( "TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
  }

  private void CreateDirectory() {
    try {
      Files.createDirectories(p);
    } catch (Exception ex) {
      System.out.println("Unable to create directory");
    }
  }

  public void WriteFile(String emp) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.println(emp);

    printWriter.close();
  }
  //public void WriteFile(ArrayList<Product> products) throws IOException {}
}
