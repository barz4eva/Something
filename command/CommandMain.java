package command;

public class CommandMain {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Exercising exercising = new Exercising();
		
		Command StandUpCommand = new StandUpCommand(exercising);
		Command LayDownCommand = new LayDownCommand(exercising);
		
		trainer.setCommand(StandUpCommand);
		trainer.sayCommand();
		
		trainer.setCommand(LayDownCommand);
		trainer.sayCommand();


	}

}
