package by.htp.les07.main.exe4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/user/src/homework/homework7/src/by/htp/les07/main/exe4/INPUT");
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            stringBuilder.append(line).append('\n');
        }

        String text = stringBuilder.toString().replace('\n', ' ');
        String[] sentences = text.split("(?<=(\\.|\\?|!))");
        stringBuilder.setLength(0);
        for (int i = 0; i < sentences.length; i++) {
            if (TextFormater.hasPolindrom(sentences[i].trim())
                    || (TextFormater.counter(sentences[i].trim()) > 2
                    && TextFormater.counter(sentences[i].trim()) < 6)) {
                stringBuilder.append(sentences[i]).append('\n');
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/user/src/homework/homework7/src/by/htp/les07/main/exe4/OUTPUT"));

        writer.write(stringBuilder.toString());
        writer.close();
    }
}
