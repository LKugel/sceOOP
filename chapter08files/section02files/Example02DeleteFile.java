package chapter08files.section02files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example02DeleteFile
{
    public static void main(String[] args) throws Exception
    {
        Path filePath = Paths.get("chapter08files/io/example.txt");
        Files.delete(filePath);
    }
}
