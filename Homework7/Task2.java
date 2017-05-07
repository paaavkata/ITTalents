
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM person1 = new GSM();
		GSM person2 = new GSM();
		
		person1.insertSimCard("0876101022");
		person2.insertSimCard("0883359232");
		person1.call(person2, 10);
		person2.call(person1, 25);
		
		person1.printInfoForTheLastIncomingCall();
		
		person2.printInfoForTheLastOutgoingCall();
		
	}

}
