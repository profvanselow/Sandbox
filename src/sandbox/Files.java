package sandbox;

import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args) {

        ProcessFiles pf = new ProcessFiles();
        try {
          pf.WriteFile("test3");
        } catch (Exception ex) {
          System.out.println("Could not write");
        }
        //createEmptyFile();
        //createDirectory();

    }

    public static void createEmptyFile() {
        try {
            // create a file in the current directory (same as the current running program’s directory):
            File file = new File("Code.java");
            boolean created = file.createNewFile();

            if (created) {
                System.out.println("The file has been created");
            }

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    // Use the mkdir() method to create a single directory. This method returns true if the directory was created,
    // and false otherwise, e.g. the directory already exists. Creates a directory in the current directory:
    public static void createDirectory() {
        File newDir = new File("CodeJava");

        if (newDir.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Directory not created");
        }
    }
}
