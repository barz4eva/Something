package command;

public class StandUpCommand implements Command {

	
	private Exercising exercise;
	
	public StandUpCommand(Exercising exercise) {
		this.exercise = exercise;
	}
	
	public void execute() {
		this.exercise.standUp();
	}

}
