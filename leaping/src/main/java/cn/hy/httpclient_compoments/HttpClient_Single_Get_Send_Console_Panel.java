package cn.hy.httpclient_compoments;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.http.client.methods.HttpGet;

import cn.hy.initiating.HttpClient_Single_Get_Html;



public class HttpClient_Single_Get_Send_Console_Panel {
	
	public JPanel httpClient_Single_Get_Send_Console_Panel(int x,int y){
		JPanel hsgscp=new JPanel();
		hsgscp.setLayout(null); 
		hsgscp.setBounds(0,(int)(y*0.26),x,(int)(y*0.63));

		hsgscp.setBackground(Color.cyan);
			


		JLabel consoleJLable=new HttpClient_Single_Get_Send_Console_JLabel().httpClient_Single_Get_Send_Console_JLabel(x, y);
		hsgscp.add(consoleJLable);
		

		JTextField hsgsc=new HttpClient_Single_Get_Send_Console_JTextField().httpClient_Single_Get_Send_Console_JTextField();
		hsgscp.add(hsgsc);

//		JTextArea console=new HttpClient_Single_Get_Send_Console_JTextArea().httpClient_Single_Get_Send_Console_JTextArea();
//		JScrollPane scroll = new HttpClient_Single_Get_Send_Console_JScrollPane().httpClient_Single_Get_Send_Console_JScrollPane(x,y,console);
//		hsgscp.add(scroll);
		
		
		JButton console_button=new HttpClient_Single_Get_Send_Console_Button().httpClient_Single_Get_Send_Console_Button(x, y,hsgscp,hsgsc);
		hsgscp.add(console_button);

		return hsgscp;
	}
}
