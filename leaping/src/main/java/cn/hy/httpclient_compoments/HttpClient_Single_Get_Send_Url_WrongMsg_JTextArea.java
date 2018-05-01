package cn.hy.httpclient_compoments;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

/**
 * 
 * @author hy
 * 生成报错信息栏
 * 用于汇报错误信息的
 */
public class HttpClient_Single_Get_Send_Url_WrongMsg_JTextArea {
	public JTextArea httpClient_Single_Get_Send_Url_WrongMsg_JTextArea(){
		JTextArea wrongMsg=new JTextArea();
		wrongMsg.setBounds(50,45,420,199);
		wrongMsg.setVisible(true);
		wrongMsg.setLineWrap(true);//设置自动换行
		wrongMsg.setBorder(BorderFactory.createEtchedBorder());
		return wrongMsg;
	}
}
