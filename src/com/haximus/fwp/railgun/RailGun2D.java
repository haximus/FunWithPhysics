package com.haximus.fwp.railgun;

import com.haximus.fwp.barrel.Barrel;
import com.haximus.fwp.barrel.Barrel2D;

public class RailGun2D implements RailGun{
	Barrel barrel;
	
	public RailGun2D(){
		barrel = new Barrel2D();
	}
}
