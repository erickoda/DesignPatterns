public abstract class NotificationService<T> {
    void sendNotification(String message) {
        T notification = createNotification(message);

        if (notification == null) {
            return;
        }

        send();
    }

    protected abstract T createNotification(String message);
    protected abstract void send();
}