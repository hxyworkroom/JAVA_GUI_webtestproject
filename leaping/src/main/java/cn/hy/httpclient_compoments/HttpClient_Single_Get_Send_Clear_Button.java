package cn.hy.httpclient_compoments;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import cn.hy.utils.HttpClient_Single_Get_Send_Repaint;

/**
 * 
 * @author hy
 * 这是页面刷新按钮
 * 就是把getPanel重绘一次
 * 但是对输入框的输入的字符进行了处理
 * 第二次重新请求会保留
 */
public class HttpClient_Single_Get_Send_Clear_Button {
	public JButton httpClient_Single_Get_Send_Url_Button(int x,int y,JPanel hssp){
		JButton clearb=new JButton("刷新");
		clearb.setBounds(480,42,70,26);
		clearb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HttpClient_Single_Get_Send_Repaint.httpClient_Single_Get_Send_Repaint(x, y, hssp,"");
				hssp.repaint();
			}
		});
		return clearb;
	}
}