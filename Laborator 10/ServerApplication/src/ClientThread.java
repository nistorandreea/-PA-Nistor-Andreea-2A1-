import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread{

    private final Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    public void main (String[] args) throws IOException {
            String serverAddress = "127.0.0.1"; // The server's IP address
            int PORT = 2020; // The server's port
        try (
                    Socket socket = new Socket(serverAddress, PORT);
                    BufferedReader in = new BufferedReader (
                            new InputStreamReader(socket.getInputStream())) ) {
            String request;
            while((request = in.readLine()) != null) {
                    String response = this.execute(request);
                    PrintWriter out = new PrintWriter(socket.getOutputStream());
                    out.println(response);
                    out.flush();
                }
                socket.close();
            } catch (UnknownHostException e) {
                System.err.println("No server listening... " + e);
            }
        }
    private String execute(String request) {
        System.out.println("Server received the request " + request);
        return "";
    }
}

