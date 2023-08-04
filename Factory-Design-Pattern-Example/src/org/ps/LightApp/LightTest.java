package org.ps.LightApp;

import java.util.Scanner;

public class LightTest 
{
	/* consumer / Utilization Logic*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of light...");
		String type = sc.nextLine();
		ISwitch light= LightFactory.getLight(type);
		if(light!=null)
		{
		light.sOn();
		light.sOff();
		}
	}

}
