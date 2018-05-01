package cn.hy.httpclient_compoments;

import javax.swing.JLabel;

public class HttpClient_Single_Get_Send_Url_JLabel {
	public JLabel httpClient_Single_Get_Send_Url_JLabel(int x,int y){

		JLabel hssp_JLable_urlname=new JLabel(" URL: ");
		hssp_JLable_urlname.setBounds(10,10,(int)(x*0.15),(int)(y*0.03));
		hssp_JLable_urlname.setVisible(true);
		return hssp_JLable_urlname;
	}
}
