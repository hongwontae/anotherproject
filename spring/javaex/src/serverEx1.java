import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverEx1 {

    // bad 코드이다.
    public static void main(String[] args) throws Exception {

        // 포트가 필요하다. 연결을 여러번 만들 수 있다.
        ServerSocket serverSocket = new ServerSocket(8080);

        System.out.print("Server ready.....");
        
        // 연결 확인
        for(int i=0; 1<100; i++){
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket);
            
            // read inputstream필요
            InputStream in = clientSocket.getInputStream();
            FileOutputStream fos = new FileOutputStream("C:\\zzz\\client"+i+".jpg");

            while(true){
                int data = in.read();
                if(data == -1){
                    break;
                }
                fos.write(data);
            }

            // 사용했던 자원을 정리해야 한다.
            in.close();
            fos.close();
            clientSocket.close();


            // 3번 읽기
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
            
        }
    }
}
