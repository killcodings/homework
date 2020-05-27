package by.htp.les07.main;

import java.io.*;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/user/src/homework/homework7/src/by/htp/les07/main/INPUT");
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (StringUtils.isPalindrome(line.trim())) {
                stringBuilder.append(line).append('\n');
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/user/src/homework/homework7/src/by/htp/les07/main/OUTPUT"));

        writer.write(stringBuilder.toString());
        writer.close();
    }

}