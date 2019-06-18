package com.metro.system;

public class DemoSmartCard {
	
	private String cardNo;
	private static int cardBalance=20;
	private final int MIN_BAL=5;
	private String day;
	private String startMetroStation;
	private String endMetroStation;

	public DemoSmartCard(String cardNo,String toMetroStation,String day)
	{
		this.cardNo=cardNo;
		this.endMetroStation=toMetroStation;
		this.day=day;
	}
	
	public int getCardBalance() {
		return cardBalance;
	}
	public String getStartMetroStation() {
		return startMetroStation;
	}
	public String getEndMetroStation()
	{
		return endMetroStation;
	}
	public String getDay() {
		return day;
	}
	public void setEndStation(String endStation)
	{
		this.endMetroStation=endStation;
	}
	public void calFair(int noOfStationsTravelled ,String day)
	{
		double fare= (FairMapping.fairMap.get(day)*noOfStationsTravelled);
		System.out.println(getCardBalance()+"-"+fare+"=");
		cardBalance=(int)(getCardBalance()-fare);
		if(cardBalance<MIN_BAL)
			throw new NullPointerException("Negative Card Balance");
		
	}

	

}
