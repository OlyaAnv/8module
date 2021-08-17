import java.io.IOException;
/*
Программа выводит дату последней модификации файла, указанного при создании объекта типа FileInfo
*/

public class Main {
    public static String path = "C:\\Android\\q.txt";

    public static void main(String[] args)  {
        FileInfo myfile = new FileInfo(path);
        myfile.lastModifiedTime();
    }
}
