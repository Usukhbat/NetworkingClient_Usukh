import java.io.*;
import java.net.*;
public class NetworkingClient {
    public static void main(String[] args) {
        Socket client = null;
        int portnumber = 1987;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }
        for (int i = 0; i < 10; i++){
            try{

            }catch (IOException ie){
                System.out.println("I/O error " + ie);
            }
        }
    }
}
