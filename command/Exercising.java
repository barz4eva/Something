package command;

public class Exercising {
   private Boolean exercise;
   
   
    public Boolean getExercise() {
	return exercise;
}

public void setExercise(Boolean exercise) {
	this.exercise = exercise;
}

	public void standUp() {
    	System.out.println("Stand up.");
    	this.exercise = true;
    }
    
    public void layDown() {
    	System.out.println("Lay down.");
    	this.exercise = false;
    }
}
