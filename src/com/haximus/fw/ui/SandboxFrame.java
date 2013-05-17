package com.haximus.fw.ui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SandboxFrame extends JFrame implements FunWithPhysicsFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4413512902479932747L;
	JPanel sandboxPanel;
	
	public SandboxFrame(){
		super();
		sandboxPanel = new SandboxPanel();
		this.setTitle("JBox2D Testbed");
		this.setLayout(new BorderLayout());
		this.add((Component) sandboxPanel, "Center");
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
