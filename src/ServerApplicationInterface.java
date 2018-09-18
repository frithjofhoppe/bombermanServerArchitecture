import messages.Message;

public interface ServerApplicationInterface {
    void handleMessage(Message message, String connectionId);
}
