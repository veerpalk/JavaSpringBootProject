package com.metro.system;


public class DemoCardSwipeOutCommand implements Command {

	private DemoSmartCard smartcard;
	private int noOfStationTravelled;
	public DemoCardSwipeOutCommand(DemoSmartCard card,int no)
	{
		this.smartcard=card;
		this.noOfStationTravelled=no;
	}
	@Override
	public void execute() throws Exception {
		try {
		System.out.println("\n----Card swipe Out-------");
		System.out.println("\nSwipe Out Station"+smartcard.getEndMetroStation()+" "+ noOfStationTravelled +
				", InitialCardBalance="+smartcard.getCardBalance() + ", Day = " + smartcard.getDay());
		Thread.sleep(1000);
		System.out.println("Fare per station = " + FairMapping.fairMap.get(smartcard.getDay()));
		Thread.sleep(1000);
		smartcard.calFair(noOfStationTravelled, smartcard.getDay());
		System.out.print("Crad left Balance is:"+smartcard.getCardBalance());
		}
		catch(Exception e)
		{
			System.out.println("Insufficient Balance can't go out");
		}
	}
	

}
