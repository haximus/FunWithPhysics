package com.haximus.fwp.environment;

import java.util.ArrayList;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

public class EarthEnvironment implements Environment{
	private ArrayList<Object> objects;

	Vec2 gravity;
	World world;

	public EarthEnvironment(){
		objects = new ArrayList<Object>();
		gravity = new Vec2(0, (float) -9.80665);
		world = new World(gravity);
	}

	public ArrayList<Object> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<Object> objects) {
		this.objects = objects;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
