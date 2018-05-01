package cn.hy.component;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import cn.hy.panel.Welcome_Panel;
import cn.hy.slippery.HttpClient_Page;
import cn.hy.slippery.MainPage;

public class TestJmenuBar {
	public JMenuBar testJTestJMenuBar(int x,int y,JFrame mainPage){
		JMenuBar testJTestJmenuBar =new JMenuBar();
		testJTestJmenuBar.setBounds(0, 0,x, (int)(y*0.035));
		
//		testJTestJmenuBar.setSize(x, y);
		JMenu HttpClient_Menu = new JMenu("  HttpClient  ");
		
        JMenuItem Using_Item = new JMenuItem(" ~Using~ ");
        
        Using_Item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

 				JFrame httpClient_page=new HttpClient_Page().httpClient_Page(mainPage);
				httpClient_page.add(new Welcome_Panel().welcome_Panel(
						Toolkit.getDefaultToolkit().getScreenSize().width,
						Toolkit.getDefaultToolkit().getScreenSize().height));
				
				mainPage.dispose();
			}
		});
        
        
        
        
        
        
        
        JMenuItem openMenuItem = new JMenuItem(" ~打开~ ");

        HttpClient_Menu.add(Using_Item);
        HttpClient_Menu.add(openMenuItem);
        testJTestJmenuBar.add(HttpClient_Menu);
		
		
		
		
		
		
		JMenu URLConnect_Menu = new JMenu("  URLConnect  ");
		testJTestJmenuBar.add(URLConnect_Menu);
		return testJTestJmenuBar;
	}
}
