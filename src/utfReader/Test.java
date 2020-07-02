package utfReader;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Test {
       @SuppressWarnings("unused")
       public static void main(String[] args) throws IOException, URISyntaxException {
             List<String> lines = Files.readAllLines(Paths.get(new URL("file://C:/Users\\lyesm\\eclipse-workspace\\utfReader\\src\\test.txt").toURI()));
             String line = "";
             
             Iterator<String> it = lines.iterator();
             
             while(it.hasNext()) {
                    System.out.println(it.next());
             }
             
             
       }

}
