package com.haximus.fw.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JPanel;

import org.jbox2d.testbed.framework.j2d.AWTPanelHelper;

public class SandboxPanel extends JPanel implements FunWithPhysicsPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4029480271436113683L;

	public static final int INIT_WIDTH = 600;
	public static final int INIT_HEIGHT = 600;
	
	private Graphics2D dbg = null;
	private Image dbImage = null;
	
	private int panelWidth;
	private int panelHeight;
	
	public SandboxPanel(){
		super();
	    setBackground(Color.black);
	    setPreferredSize(new Dimension(INIT_WIDTH, INIT_HEIGHT));
	    updateSize(INIT_WIDTH, INIT_HEIGHT);

	    addComponentListener(new ComponentAdapter() {
	      @Override
	      public void componentResized(ComponentEvent e) {
	        updateSize(getWidth(), getHeight());
	        dbImage = null;
	      }
	    });
	}
	
	private void updateSize(int width, int height) {
		panelWidth = width;
		panelHeight = height;
	}
	
}
