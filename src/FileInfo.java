import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileInfo {
    private final long millis;
    private final String fileName;
    private final String pathName;
    private boolean isFile;

    public FileInfo(String path) {
        File file = new File(path);
        fileName = file.getName();
        millis = file.lastModified();
        isFile = file.isFile();
        pathName = path;
    }

    public void lastModifiedTime() {
        if(isFile) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(millis);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Последняя модификация файла: " + fileName);
            System.out.println("Дата: " + dateFormat.format(calendar.getTime()) + "г.");
            System.out.println("Время: " + timeFormat.format(calendar.getTime()));
        }
        else System.out.println("По адресу " + pathName + " нет файла");


    }
}
