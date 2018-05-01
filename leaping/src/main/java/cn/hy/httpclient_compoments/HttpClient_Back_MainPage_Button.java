package cn.hy.httpclient_compoments;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *  
 * @author hy
 * 这是临时存在的返回主页面的返回键
 */
public class HttpClient_Back_MainPage_Button {
	public JButton httpClient_Back_MainPage_Button(int x,int y,JFrame mainPage,JFrame httpClientPage ){
		JButton jButton=new JButton("返回");
		jButton.setBounds((int)(x*0.95),(int)(y*0.05), 70, 25);
		jButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPage.show();
				
				httpClientPage.dispose();
			}
		});
		
		return jButton;
	}
}
