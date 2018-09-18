import messages.Message;

public class BombermanServer implements ServerApplicationInterface {

    String applicationName;
    String applicationPassword;
    Server server;
    Session session;

    @Override
    public void handleMessage(Message message, String connectionId) {
    }

    void launchSession(){

    }

    void cancelSession(){

    }
}
