package practice_4;

import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException{
        File file = new File(ReadFile.class.getResource("/randomData.txt").getFile());
        List<String> lines = Files.readAllLines(file.toPath());

            System.out.println(lines);

    }
}
