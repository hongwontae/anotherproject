import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87045/87045_320.jpg");
        InputStream fin = url.openStream();


        //FileInputStream fin = new FileInputStream( "C://zzz//test.jpg");

        FileOutputStream fos = new FileOutputStream("C://zzz/copycopy.jpg");

        System.out.println(fin);

        while(true){
            int data =fin.read();
            if(data ==-1){
                break;
            }
            fos.write(data);
        }
    }
}