package observer;

public interface Observerable {
  public void subscribe(Observer observer);
  public void notifyObservers();
  public String getUpdate();
}
