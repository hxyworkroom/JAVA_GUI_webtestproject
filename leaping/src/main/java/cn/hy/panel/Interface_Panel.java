package cn.hy.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import cn.hy.component.TestJmenuBar;

public class Interface_Panel {
	public JPanel interface_Panel(int x,int y,JFrame mainPage){
		JPanel interface_panel=new JPanel();
		interface_panel.setLayout(null); 
//		interface_panel.setSize(x,y/10);
		interface_panel.setBounds(0,0,x,(int)(y*0.035));
		
		interface_panel.setBackground(Color.DARK_GRAY);
		
		JMenuBar menu = new TestJmenuBar().testJTestJMenuBar(x,y,mainPage);
		interface_panel.add(menu);
		
		
		return interface_panel;
	}
}
