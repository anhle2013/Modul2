package text_file.copy_file;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("D:\\CODEGYM\\Modul 2\\practice\\src\\text_file\\copy_file\\input.txt");
            outputStream = new FileOutputStream("D:\\CODEGYM\\Modul 2\\practice\\src\\text_file\\copy_file\\output.txt");

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0,length);
            }
            System.out.println("Copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inputStream != null;
            inputStream.close();
            assert outputStream != null;
            outputStream.close();
        }
    }
}
