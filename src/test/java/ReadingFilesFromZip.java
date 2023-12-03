import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ReadingFilesFromZip {
    @Test
    void readingFiles() throws Exception {
        try (ZipInputStream zis = new ZipInputStream(
                cl.getResourceAsStream("hw_11.zip")
        ))
    }
//        ZipFile zf = new ZipFile(new File("src/test/resources/hw_11.zip"));
//        ZipInputStream is = new ZipInputStream(getClass().getResourceAsStream("hw_11.zip"));
//        ZipEntry entry;
//        while ((entry = is.getNextEntry()) !=null){
//            org.assertj.core.api.Assertions.assertThat(entry.getName()).isEqualTo("sample.txt");

        }


    }




