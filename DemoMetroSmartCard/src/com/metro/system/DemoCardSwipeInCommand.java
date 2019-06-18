package com.metro.system;

public class DemoCardSwipeInCommand implements Command {

	private DemoSmartCard smartCard;
	
	public DemoCardSwipeInCommand(DemoSmartCard card)
	{
		this.smartCard=card;
	}
	@Override
	public void execute() throws Exception {
		try {
		System.out.print("------SWIPE-IN CARD----------");
		Thread.sleep(2000);
		System.out.print("Card Balance is"+smartCard.getCardBalance()+"Start Staion"+
		smartCard.getStartMetroStation()+"Day of year"+smartCard.getDay());
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}

}
