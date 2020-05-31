package mediator;

public class SingletonBot {
	
	private static SingletonBot instance;
	
	private SingletonBot () {
		
	}
	
	public static SingletonBot getInstance() {
		
		if(instance == null) { 
			instance = new SingletonBot();	
		}
		return instance;
	}
	
	public void sendData(String message) {
		  
		    	System.out.println("Bot removing" + " " + message);
		
			
	}

}
