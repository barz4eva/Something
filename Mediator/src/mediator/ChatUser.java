 package mediator;

public class ChatUser extends User {

	public ChatUser(ChatMediator mediator, String name) {
		super(mediator, name);
        mediator.addUser(this);
	}

	
	@Override
	public void sendMessage(String message) {
		System.out.println(this.name + " " + "send:" + message);
		mediator.sendMessage(message, this);
		
	}

   @Override
   public void receiveMessage(String message) {
	System.out.println(this.name + " " + "seen:" + message);
	
}


}
