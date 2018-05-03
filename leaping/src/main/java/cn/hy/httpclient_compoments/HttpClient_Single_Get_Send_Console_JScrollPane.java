package cn.hy.httpclient_compoments;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * 
 * @author hy
 * html
 * 返回值显示框的滚动条
 *
 */
public class HttpClient_Single_Get_Send_Console_JScrollPane {
	public JScrollPane httpClient_Single_Get_Send_Console_JScrollPane(int x,int y,JTextArea console){
		JScrollPane scroll = new JScrollPane(console);//添加滚动条
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll.validate();
		scroll.setBounds(10,50,(int)(x*0.99),y);
		return scroll;
	}
}
