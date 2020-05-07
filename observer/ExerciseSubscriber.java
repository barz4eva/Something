package observer;


public class ExerciseSubscriber implements Observer {

	
	private String name;
	private Observerable exercise;
	
	public ExerciseSubscriber(String name) {
		this.name=name;
	}

	@Override
	public void setExercise(Observerable exercise) {
          this.exercise = exercise;

	}

	@Override
	public void update() {
	   if(this.exercise == null) {
		   System.out.println("No exercise.");
		   return;
	   }
	   
	    String latestExercise = this.exercise.getUpdate();
	    System.out.println(this.name + " : " + latestExercise);
		   
	}

}
