package cn.hy.slippery;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import cn.hy.httpclient_compoments.HttpClient_Back_MainPage_Button;
import cn.hy.panel.HttpClient_Panel;

/**
 * @author hy
 * 这是HttpClient方法的测试面板
 * 我们在这里进行主要测试参数，以及方式的选择
 */
public class HttpClient_Page extends JFrame {

	private static final long serialVersionUID = 1L;
	private int wscreen=Toolkit.getDefaultToolkit().getScreenSize().width;
	private int hscreen=Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public JFrame httpClient_Page(JFrame mainPage){
		final JFrame httpClientPage=new HttpClient_Page();
		
		httpClientPage.setBackground(Color.BLUE);//设置容器的背景颜色
		int w = 1600;
		int h = 1000;
		httpClientPage.setLocation((wscreen-w)/2,(hscreen-h)/2-20);//设置窗口初始出现位置
		
		httpClientPage.setLayout(null);//清空布局管理器
		httpClientPage.setTitle("L~eaping~...");//设置标题
		httpClientPage.setSize(w,h);//设置大小
		
		httpClientPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置可以关闭,但是主程序不会关闭
		
		
		httpClientPage.setIconImage(new ImageIcon("images/logo.png").getImage());//更换logo



		
		JButton HttpClient_Get_Send_Button_a= new HttpClient_Back_MainPage_Button().httpClient_Back_MainPage_Button(wscreen,hscreen,mainPage,httpClientPage);
		
		JPanel  httpClient_Panel =new HttpClient_Panel().httpClient_Panel(wscreen,hscreen);
		
		httpClientPage.add(HttpClient_Get_Send_Button_a);

		httpClientPage.add(httpClient_Panel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		httpClientPage.setVisible(true); // 使窗体可视  这一步放在最后   保证所有都能一次绘制出来
		httpClientPage.setResizable(true);
		return httpClientPage;
	}
}
