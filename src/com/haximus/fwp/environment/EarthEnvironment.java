package com.haximus.fwp.environment;

import java.util.ArrayList;

public class EarthEnvironment implements Environment{
	public static final double gravity = 9.80665;
	private ArrayList<Object> objects;
	
	public EarthEnvironment(){
		objects = new ArrayList<Object>();
	}

	public ArrayList<Object> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<Object> objects) {
		this.objects = objects;
	}

}
