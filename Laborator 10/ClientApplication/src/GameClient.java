import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameClient {
    private final static String serverAddress = "127.0.0.1";
    private final static int PORT = 2020;
    private Socket socket = null;

    public static void main(String[] args) throws IOException {
        GameClient gameClient = new GameClient();

        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader (
                        new InputStreamReader(socket.getInputStream())) ) {
            String request = read();
            out.println(request);
            String response = in.readLine ();
            System.out.println(response);
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
    }
    private static String read()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
