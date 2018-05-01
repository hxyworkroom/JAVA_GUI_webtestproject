package cn.hy.httpclient_compoments;

import javax.swing.JTextField;
/**
 * 
 * @author 
 *	填写httpclient单个get提交 url的输入框
 */
public class HttpClient_Single_Get_Send_JTextField {
	public JTextField httpClient_Single_Get_Send_JTextField(String m){
		JTextField hsgsp=new JTextField();
		hsgsp.setBounds(50,10,400,30);
		hsgsp.setVisible(true);
		hsgsp.setText(m);
		return hsgsp;
	}
}
