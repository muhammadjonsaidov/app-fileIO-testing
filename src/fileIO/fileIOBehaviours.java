package fileIO;

import java.io.File;
import java.io.IOException;

public class fileIOBehaviours {
    public static void main(String[] args) {
//        create();
//        read();
        File dir = new File("/home/kali/");
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName() + "\ncan Write: " + file.canWrite() + "\nis Hidden: " + file.isHidden() + "\nlength: " + file.length() + " bytes\n\n\n");
            }
        }

    }

    private static void read() {
        File file = new File("./");
        String[] fileNames = file.list();
        if (fileNames != null) {
            for (String f : fileNames) {
                System.out.println(f);
            }
        }
    }

    private static void create() {
        File file = new File("javaFile1.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.exists());
    }
}
