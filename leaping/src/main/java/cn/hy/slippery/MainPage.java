package cn.hy.slippery;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import cn.hy.panel.Interface_Panel;
import cn.hy.panel.Welcome_Panel;

/**
 * 
 * @author hy
 * @version 1.0.0
 * 只是主面板,我们在这个面中进行选择各种要测试的方法
 * 主面板中还会嵌入一些爬虫的功能作为辅助功能
 */
public class MainPage extends JFrame {
	private int wscreen=Toolkit.getDefaultToolkit().getScreenSize().width;
	private int hscreen=Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public JFrame mainPage(){
		final JFrame mainpage=new MainPage();
		
		mainpage.setBackground(Color.LIGHT_GRAY);//设置容器的背景颜色
		int w = 1000;
		int h = 950;
		mainpage.setLocation((wscreen-w)/2,(hscreen-w)/2);//设置窗口初始出现位置
		
		mainpage.setLayout(null);//清空布局管理器
		mainpage.setTitle("L~eaping~...");//设置标题
		mainpage.setSize(w,h);//设置大小
		mainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可以关闭
		mainpage.setIconImage(new ImageIcon("src/main/resources/imgs/logo.png").getImage());//更换logo

		JPanel  interface_panel =new Interface_Panel().interface_Panel(wscreen,hscreen,mainpage);
		JPanel  welcome_panel =new Welcome_Panel().welcome_Panel(wscreen,hscreen);
		

		mainpage.add(interface_panel);
		mainpage.add(welcome_panel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		mainpage.setVisible(true); // 使窗体可视  这一步放在最后   保证所有都能一次绘制出来
		mainpage.setResizable(true);
		return mainpage;
	}
}
