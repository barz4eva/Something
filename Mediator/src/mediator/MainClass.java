package mediator;

public class MainClass {

	public static void main(String[] args) {
		 
		ChatMediator mediator = new MessagesMediator();
		SingletonBot connection = SingletonBot.getInstance();
		
		
		
		User user1 = new ChatUser(mediator, "Anton");
		User user2 = new ChatUser(mediator, "Strahil");
		User user3 = new ChatUser(mediator, "Koko");
		
		connection.sendData("Koko");
		
		user2.sendMessage("Koko");

	}

}
