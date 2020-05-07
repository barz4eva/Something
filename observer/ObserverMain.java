package observer;


public class ObserverMain {

	public static void main(String[] args) {
		Excercise exercise = new Excercise();
		Observer obs1 = new ExerciseSubscriber("Gosho");
		Observer obs2 = new ExerciseSubscriber("Pesho");
		Observer obs3 = new ExerciseSubscriber("Tisho");
		
		exercise.subscribe(obs1);
		exercise.subscribe(obs2);
		exercise.subscribe(obs3);
		
		
		exercise.setExercise("Stand Up");


	}

}
