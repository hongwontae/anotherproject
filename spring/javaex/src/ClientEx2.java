import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientEx2 {
    //Bad code
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.0.32",8080);

        InputStream in = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream("C:\\zzz\\test22.jpg");

        while (true){
            int data = in.read();
            if(data ==-1){
                break;
            }
            fos.write(data);
        }

        in.close();
        fos.close();
        socket.close();

    }
}
