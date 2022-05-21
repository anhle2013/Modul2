package demo.demo.buffer;

import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferTest {
//    public static void main(String[] args) throws Exception {
//        FileWriter writer = new FileWriter("D:\\CODEGYM/text.txt");
//        //Kiểu dữ liệu char của Java là 2 bytes.
//        BufferedWriter br = new BufferedWriter(writer,1);
//        br.write("12345678901234567890");
//        br.newLine();
//        br.write("1234567890");
//        br.newLine();
//        br.write("1");
//        br.newLine();
//        //br.flush();
//        br.write("123");
//        //br.close();
//        System.out.println("done!");
//    }

    public static void main(String[] args)
    {
        String obj  = "abcdef";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        int i;
        int j;
        try
        {
            while((i = input1.read()) == (j = input2.read()))
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
