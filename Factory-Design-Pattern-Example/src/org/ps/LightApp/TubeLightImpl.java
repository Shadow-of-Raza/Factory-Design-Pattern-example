package org.ps.LightApp;

public class TubeLightImpl implements ISwitch
{
/* Implementational Logic*/
	@Override
	public void sOn() 
	{
		System.out.println("Tube Light On...");		
	}

	@Override
	public void sOff() 
	{
		System.out.println("Tube Light Off...");	
	}

}
