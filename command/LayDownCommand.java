package command;

public class LayDownCommand implements Command {
     
	private Exercising exercise;
	
	
	public LayDownCommand(Exercising exercise) {
		this.exercise = exercise;
	}
	

    public void execute() {
    	this.exercise.layDown();
    }

}
