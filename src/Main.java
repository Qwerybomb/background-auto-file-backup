import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {

    // obtain the current date
    static LocalTime Date = LocalTime.now().truncatedTo(ChronoUnit.HOURS);


    // helpers
    static DirHandle directoryManager = new DirHandle();
    static settingsReader SettingsReader = new settingsReader();

    public static void main(String[] args) throws IOException {

     SettingsReader.RefreshSettings();

     SettingsReader.updateCurHours(5);

     System.out.println(Date);

    }
}
