package observer;

import java.util.ArrayList;
import java.util.List;
import command.Trainer;


public class Excercise implements Observerable {

	private List<Observer> observers = new ArrayList<Observer>();
	private String exercise;
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setExercise(this);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

	}
	
	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}

	@Override
	public String getUpdate() {
		
		return this.exercise;
	}

}
