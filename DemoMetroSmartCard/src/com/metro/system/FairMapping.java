package com.metro.system;

import java.util.HashMap;
import java.util.Map;

public class FairMapping {
	
	public static Map<String,Double> fairMap=new HashMap<String,Double>();
	static {
		fairMap.put("weekday",7.0);
		fairMap.put("weekend",5.5);
	}
	

}
