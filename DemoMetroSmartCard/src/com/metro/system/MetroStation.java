package com.metro.system;

public class MetroStation{

	private Command  command;
	public void setCommand(Command command)
	{
		this.command=command;
	}
	
	public void swipeCard() throws Exception {
		try{
		this.command.execute();
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	

}
