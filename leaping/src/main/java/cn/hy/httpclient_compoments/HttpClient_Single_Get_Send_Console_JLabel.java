package cn.hy.httpclient_compoments;

import javax.swing.JLabel;

public class HttpClient_Single_Get_Send_Console_JLabel {
	public JLabel httpClient_Single_Get_Send_Console_JLabel(int x,int y){
		JLabel consoleJLable=new JLabel(" 输 入: ");
		consoleJLable.setBounds(10,6,(int)(x*0.15),(int)(y*0.03));
		consoleJLable.setVisible(true);
		return consoleJLable;
	}
}
