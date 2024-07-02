package framework.utilities;

import org.openqa.selenium.devtools.v85.io.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = date.format(formatter);
    private BufferedWriter bufferedWriter = null;
    public void CreateLogFile() throws IOException {
            try{
                File dir = new File("C:/Logs");
                if(!dir.exists()){
                    dir.mkdir();
                }
                File logFile = new File(dir + "/" + fileNameFormat + ".log");
                FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
                bufferedWriter = new BufferedWriter(fileWriter);
            }
            catch (Exception ex){
            }
    }
    public void Write(String message){
        try{
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
            String dateFormat = date.format(formatter);
            bufferedWriter.write("["+dateFormat +"]"+message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        catch (Exception ex){
        }
    }
}
