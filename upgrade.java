import java.net.URL;
import java.net.URLConnection;
 
public class upgrade{
   public static void main(String[] args) throws Exception {
      int size;
      URL url = new URL("https://30266-official.github.io/updates/version.txt");
      URLConnection conn = url.openConnection();
      size = conn.getContentLength();
      if (size < 0)
          System.out.println("-1");
      else
        System.out.println(size);
      conn.getInputStream().close();
   }
}