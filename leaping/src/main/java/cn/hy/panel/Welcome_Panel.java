package cn.hy.panel;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * 
 * @author 
 * 这就是欢迎页面的panel
 * 主要在这上面集成一些爬虫功能
 * 都是一些通用性的，不具有明确针对性的
 */
public class Welcome_Panel {
	public JPanel welcome_Panel(int x,int y){
		JPanel interface_panel=new JPanel();
		interface_panel.setLayout(null); 
		interface_panel.setBounds(0,(int)(y*0.035),x,(int)(y*0.965));
		
		interface_panel.setBackground(Color.DARK_GRAY);
	
		return interface_panel;
	}
}
