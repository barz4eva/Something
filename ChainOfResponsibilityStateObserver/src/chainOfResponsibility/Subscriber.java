package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {

    private List<Observerable> payDesks = new ArrayList<>();
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        if(payDesks.isEmpty()){
            System.out.println("No subscription");
            return;
        }

        getShipment(payDesks);
    }

  
    private void getShipment(List<Observerable> observables){
        for(Observerable observable : observables){
            if(observable.getUpdate().equals("Preparation")) {
                System.out.println("Subscriber " + this.name + " gets the shipment");
            }
        }
    }

	@Override
	public void setPayDesk(Observerable observable) {
		this.payDesks.add(observable);
		
	}

}
