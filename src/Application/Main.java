
package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificacao:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String type = "";
        switch (choice) {
            case 1:
                type = "email";
                break;
            case 2:
                type = "sms";
                break;
            case 3:
                type = "push";
                break;
            default:
                System.out.println("Opcao invalida.");
                return;
        }


        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();


        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}