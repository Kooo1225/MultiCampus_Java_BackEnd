package Java_Study.FileIO;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        InputStream is = System.in;
        try(Reader reader = new InputStreamReader(is)) {
            int readCharNo;
            char[] cbuf = new char[100];

            while ( (readCharNo = reader.read(cbuf)) != -1 ) {
                String data = new String(cbuf, 0, readCharNo);
                System.out.println(data);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
