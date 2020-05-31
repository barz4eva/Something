package mediator;

import java.util.ArrayList;
import java.util.List;

public class MessagesMediator implements ChatMediator {
       
	 private List<User> users;
	 
	 
	 public MessagesMediator() {
		this.users = new ArrayList<>();
	 }
	@Override
	public void sendMessage(String message, User user) {
		for(User u : this.users) {
			if(u != user) {
			u.receiveMessage(message);
			}	
		}

	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}
	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardMessage(String message) {
		// TODO Auto-generated method stub
		
	}

}
