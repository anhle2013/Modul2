package text_file.read_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CODEGYM\\Modul 2\\practice\\src\\text_file\\read_csv\\countries.csv"));
            while ((line = br.readLine()) != null)
                printCountry(parseCsvLine(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id = " + country.get(0) +
                ", code = " + country.get(1) +
                        ", name = " + country.get(2) + "]"
        );
    }
    public static List<String> parseCsvLine(String csvline) {
        List<String> result = new ArrayList<>();
        if (csvline != null) {
            String[] splitData = csvline.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }
}
