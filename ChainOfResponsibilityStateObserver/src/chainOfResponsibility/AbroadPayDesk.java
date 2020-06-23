package chainOfResponsibility;

public class AbroadPayDesk extends PayDesk {

	public AbroadPayDesk(String name, State state){
        this.level = PayDesk.ABROAD;
        this.setName(name);
        this.setState(state);
    }

    @Override
    protected void sendShipment(String shipment) {
        if(shipment.equals("Abroad")){
            StateOfPreparation preparationState = new StateOfPreparation();
            preparationState.applyState(this);
            System.out.println("AbroadPayDesk sends the shipment to the delivery boy");
            this.notifyObservers();
        }
        else{
            StandByState standByState = new StandByState();
            standByState.applyState(this);
            System.out.println("AbroadPayDesk can't operate with this shipment");
        }
    }

}
