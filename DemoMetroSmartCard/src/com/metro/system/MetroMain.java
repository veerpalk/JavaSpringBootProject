package com.metro.system;

public class MetroMain {
	
	public static void main(String[] args) {
		
		DemoSmartCard smartCard=new DemoSmartCard("101","A1","weekday");
		
		DemoCardSwipeInCommand cardSwipeIn=new DemoCardSwipeInCommand(smartCard);
		DemoCardSwipeOutCommand cardSwipeOut=new DemoCardSwipeOutCommand(smartCard,2);
		MetroStation metro=new MetroStation();
		metro.setCommand(cardSwipeIn);
		try {
		metro.swipeCard();
		}catch(Exception e ) {e.printStackTrace();}
		
		metro.setCommand(cardSwipeOut);
		try {
			metro.swipeCard();
			}catch(Exception e ) {e.printStackTrace();}
			
		
		
		
		
		
		
		
		
	}

}
