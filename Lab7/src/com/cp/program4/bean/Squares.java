package com.cp.program4.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Squares {
	
	Map<Integer,Double> getSquares(List<Integer> list)
	{
		Map<Integer, Double> map =new HashMap<Integer, Double>();
		for(Integer key : list)
		{
		map.put(key, Math.pow(key, 2));
		}
		System.out.println(map.keySet());
		return map;
	}

}
