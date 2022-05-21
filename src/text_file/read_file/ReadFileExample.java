package text_file.read_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //chọn file bằng đường dẫn
            File file = new File(filePath);
            //xử lý file k tồn tại
            if (!file.exists())
                throw new FileNotFoundException();

            //đọc file bằng buffer
            //--> cần tạo FileReader
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            // tạo dòng đọc
            String line = "";
            // tạo tính tổng
            int sum = 0;
            //Gán line với mỗi dòng trong file
            //--> kiểm tra line có tồn tại thì thực hiện
            while ((line = bufferedReader.readLine()) != null) {
                //in line có thông tin
                System.out.println(line);
                //tính tổng
                //--> cần chuyển về Interger
                sum += Integer.parseInt(line);
            }
            // đóng buffer
            bufferedReader.close();

            System.out.println("Sum = " + sum);

        }
        catch (Exception e) {
            //in lỗi
            System.err.println("File not found or error content");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter file path: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(filePath);
    }

}
