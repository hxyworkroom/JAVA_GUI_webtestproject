package cn.hy.httpclient_compoments;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import cn.hy.initiating.HttpClient_Single_Get_Html;
import cn.hy.utils.HttpClient_Single_Get_Send_Console_Repaint;


public class HttpClient_Single_Get_Send_Console_Button {
	private String htmls;
	public JButton httpClient_Single_Get_Send_Console_Button(int x,int y,JPanel hsgscp,JTextField hsgsc){
		JButton console_button=new JButton("GET_Html");
		console_button.setBounds(470,8,70,26);
		console_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String url=hsgsc.getText();
				HttpClient_Single_Get_Send_Console_Repaint.httpClient_Single_Get_Send_Console_Repaint(x, y, hsgscp,url);
				hsgscp.repaint();	
				System.out.println(url);
				try {
					htmls= new HttpClient_Single_Get_Html().httpClient_Single_Get_Html(url);

				} catch (Exception e1) {
					e1.printStackTrace();
				}finally{
					JTextArea console=new HttpClient_Single_Get_Send_Console_JTextArea().httpClient_Single_Get_Send_Console_JTextArea(htmls);
					JScrollPane scroll = new HttpClient_Single_Get_Send_Console_JScrollPane().httpClient_Single_Get_Send_Console_JScrollPane(x,y,console);
					hsgscp.add(scroll);

					hsgscp.repaint();

				}
			}
		});
		return console_button;
	}
}
