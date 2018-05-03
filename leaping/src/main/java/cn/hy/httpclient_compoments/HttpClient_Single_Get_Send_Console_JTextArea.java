package cn.hy.httpclient_compoments;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class HttpClient_Single_Get_Send_Console_JTextArea {
	public JTextArea httpClient_Single_Get_Send_Console_JTextArea(String sj){
		JTextArea console=new JTextArea();
		console.setVisible(true);
		console.setLineWrap(true);//设置自动换行
		console.setBorder(BorderFactory.createEtchedBorder());
		console.setText(sj);
		return console;
	}
}
