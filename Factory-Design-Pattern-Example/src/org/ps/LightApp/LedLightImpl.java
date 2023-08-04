package org.ps.LightApp;

public class LedLightImpl implements ISwitch
{
	/* Implementational Logic*/
	@Override
	public void sOn() 
	{
		System.out.println("LED light is On...");		

	}

	@Override
	public void sOff() 
	{
		System.out.println("LED light is Off...");		

	}

}
