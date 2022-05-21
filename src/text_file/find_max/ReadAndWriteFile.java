package text_file.find_max;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists())
                throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null)
                numbers.add(Integer.parseInt(line));
            br.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("...");
        }
        return numbers;
    }
    public void writeFile(String fileOutPath, int max) {
        try {
            FileWriter writer = new FileWriter(fileOutPath);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Max is: " + max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int findMAx(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number: numbers)
            if (number > max)
                max = number;
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        Scanner scanner = new Scanner(System.in);
//        String filePath = scanner.nextLine();
        String filePath = "D:\\CODEGYM\\Modul 2\\practice\\src\\text_file\\find_max\\file1.txt";
        List<Integer> numbers = readAndWriteFile.readFile(filePath);
        int max = readAndWriteFile.findMAx(numbers);

//        String fileOut = scanner.nextLine();
        String fileOut = "D:\\CODEGYM\\Modul 2\\practice\\src\\text_file\\find_max\\output.txt";
        readAndWriteFile.writeFile(fileOut,max);

    }
}
