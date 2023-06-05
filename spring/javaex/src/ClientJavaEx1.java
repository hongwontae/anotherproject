import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientJavaEx1 {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.0.32",8080);

        System.out.println(socket);

        // 보내려면 OutPut 스트림필요하다.
        OutputStream out =  socket.getOutputStream();

        //out.write(65);
        //out.write(66);
        //out.write(111111);

        FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");

        while(true){
            //
            int data = fin.read();
            // 보내자
            out.write(data);
            // -1
            if(data == -1){
                break;
            }
        }
        // close 처리
        // 사용했던 자원을 정리해야 한다.
        fin.close();
        out.close();
        socket.close();

    }
}
