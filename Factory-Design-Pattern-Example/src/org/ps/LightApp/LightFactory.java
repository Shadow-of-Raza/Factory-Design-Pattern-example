package org.ps.LightApp;

public class LightFactory 
{
	/* Object Creational Logic*/
	public static ISwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("LedLight"))
		{
			return new LedLightImpl();
		}
		if(type.equalsIgnoreCase("TubeLight"))
		{
			return new TubeLightImpl();
		}
		else
		{
			System.out.println("No such Light found...");
			return null; 
		}
	}
}
