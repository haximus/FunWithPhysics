package com.haximus.fwp.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haximus.fw.ui.FunWithPhysicsFrame;
import com.haximus.fw.ui.SandboxFrame;
import com.haximus.fwp.environment.EarthEnvironment;
import com.haximus.fwp.environment.Environment;
import com.haximus.fwp.railgun.RailGun;
import com.haximus.fwp.railgun.RailGun2D;

public class FunWithPhysicsMain {

	
	public static void main(String[] args) {
		RailGun railGun = new RailGun2D();
		Environment earthEnvironment = new EarthEnvironment();
		
		FunWithPhysicsFrame sandboxFrame = new SandboxFrame();
	}

}
