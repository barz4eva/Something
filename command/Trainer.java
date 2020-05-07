package command;

public class Trainer {
    private Command command;
    
  
    
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	  public void sayCommand() {
		     this.command.execute();
		    }
		    
}
