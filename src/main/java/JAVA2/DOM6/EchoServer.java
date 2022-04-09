package JAVA2.DOM6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8189)) {

            System.out.println("Сервер запущен, ожидаем подключения. . .");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            final DataInputStream in = new DataInputStream(socket.getInputStream()); // получение сообщений
            final DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // отправка сообщений

            final Scanner scanner = new Scanner(System.in);
            final Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        final String msg = scanner.nextLine(); // блокирует
                        try {
                            out.writeUTF(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
            thread.start();


            while (true) {
                final String message = in.readUTF();
                System.out.println("Сообщение от клиента: " + message);
                if("/end".equalsIgnoreCase(message)){
                    out.writeUTF("/end");
                    break;
                }
                out.writeUTF("echo: "+ message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("Сервер остановлен");
    }
}
