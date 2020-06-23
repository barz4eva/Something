package chainOfResponsibility;

public interface Observer {
	public void update();
    public void setPayDesk(Observerable observable);
}
