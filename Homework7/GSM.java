
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall = new Call();

	
	void insertSimCard(String number){
		if(number.charAt(0) == '0' && number.charAt(1) == '8' && number.length() == 10){
			hasSimCard = true;
			simMobileNumber = number;
		}
		else{
			System.out.println("The entered number is invalid.");
		}
	}
	
	void  removeSimCard(){
		hasSimCard = false;
		simMobileNumber = null;
	}
	
	void call(GSM receiver, int duration){
		if(duration <= 0 || !this.hasSimCard || !receiver.hasSimCard || this.simMobileNumber == receiver.simMobileNumber){
			System.out.println("The call can not be completed.");
		}
		else{
			receiver.lastIncomingCall.minutes = duration;
			receiver.lastIncomingCall.receiver = receiver;
			receiver.lastIncomingCall.caller = this;
			this.lastOutgoingCall.receiver = receiver;
			this.lastOutgoingCall.caller = this;
			this.lastOutgoingCall.minutes = duration;
			this.outgoingCallsDuration += duration;
			printInfoForTheLastOutgoingCall();
		}
		
	}
	
	double getSumForCall(int duration){
		
		return duration*Call.priceForAMinute;
		 
	}
	
	void printInfoForTheLastOutgoingCall(){
		
		if(lastOutgoingCall == null){
			System.out.println("No last outgoing call.");
		}
		
		else{
			System.out.println("Last Outgoing Call Summary:");
			System.out.println("To: " + lastOutgoingCall.receiver.simMobileNumber);
			System.out.println("Duration: " + lastOutgoingCall.minutes);
			System.out.println("Cost: " + lastOutgoingCall.minutes*Call.priceForAMinute);
		}
		
	}
	
	void printInfoForTheLastIncomingCall(){
		
		if(lastIncomingCall == null){
			System.out.println("No last incoming calls.");
		}
		else{
			
			System.out.println("Last Incoming Call Summary:");
			System.out.println("From: " + lastIncomingCall.receiver.simMobileNumber);
			System.out.println("Duration: " + lastIncomingCall.minutes);
			
		}
	}

}
