import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/");
        search(file, "uxla");
    }

    static void search(File file, String str) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.getName().toLowerCase().contains(str.toLowerCase())) {
                    System.out.println(f.getAbsolutePath());
                }
                if (f.isDirectory()) {
                    search(f, str);
                }
            }
        }
    }
}