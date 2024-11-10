public class Main {
    public static void main(String[] args) {
        notificaçao email = new email();
        email.enviarMensagem();

        notificaçao SMS = new SMS();
        SMS.enviarMensagem();

        notificaçao Push = new PushNotification();
        Push.enviarMensagem();

    }
}