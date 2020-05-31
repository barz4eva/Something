package mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
    void removeUser(User user);
    void guardMessage(String message);
}
