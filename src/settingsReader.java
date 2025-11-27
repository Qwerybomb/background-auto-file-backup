import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class settingsReader {

    ArrayList<String> SourceDirs = new ArrayList<>();
    String settingsLocation = null;
    String FinalDir = null;

    settingsReader() {

    }

    public void RefreshSettings() throws IOException {


        int breakout = 0;
        BufferedReader br = new BufferedReader(new FileReader(settingsLocation));

        try {

            // skip forward 2 lines
            String line = br.readLine();
            br.readLine();

            while (!line.equals("░▒▓ Backup directory") || breakout > 100) {

                line = br.readLine();
                breakout++;
            }
        } finally {
            br.close();
        }

    }

    public void setSettingsLocation(String directory) {
        settingsLocation = directory;
    }

    public String getFinalDirectory() {
        return FinalDir;
    }

    public ArrayList<String> getSourceDirectories() {
        return SourceDirs;
    }
}
