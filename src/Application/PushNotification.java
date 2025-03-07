
package Application;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando notificacao push: " + message);
    }
}