package cn.hy.httpclient_compoments;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import cn.hy.initiating.HttpClient_Single_Get_Initiate;
import cn.hy.utils.HttpClient_Single_Get_Send_Repaint;

/**
 * 
 * @author 
 * 这是发送按钮
 * 点击后会发起一次httpclient的get请求
 * 可以自己带参数发送
 */
public class HttpClient_Single_Get_Send_Url_Button {
	private Map map;
	private Boolean f=false;
	private String msg;
	public JButton httpClient_Single_Get_Send_Url_Button(int x,int y,JTextField t,JPanel hssp){
		JButton hsgsub=new JButton("发送");
		hsgsub.setBounds(480,11,70,26);
		
		hsgsub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String get_url=t.getText();
				HttpClient_Single_Get_Send_Repaint.httpClient_Single_Get_Send_Repaint(x, y, hssp,get_url);
				hssp.repaint();
				System.out.println(get_url);
				try {
					map=new HttpClient_Single_Get_Initiate().httpClient_Single_Get_Initiate(get_url);
				} catch (Exception e1) {
					//这里的异常时输入不正确的url报错异常
					System.out.println("错误信息："+e1.getMessage());
					msg=e1.getMessage()+'\n'+'\n'+e1.getLocalizedMessage()+'\n'+'\n'+e1.toString();
					f=true;
				}finally{
					if (f) {
						//这里就是有错就打印异常，不执行接下来的建表操作
						JTextArea wrongMsg=new HttpClient_Single_Get_Send_Url_WrongMsg_JTextArea().httpClient_Single_Get_Send_Url_WrongMsg_JTextArea();
						wrongMsg.setText(msg);
						hssp.add(wrongMsg);
						hssp.repaint();
					}else{
						JTable hcsgsu_table = new HttpClient_Single_Get_Send_Url_JTable().httpClient_Single_Get_Send_Url_JTable(map);
						JScrollPane hcsgsu_scroll = new HttpClient_Single_Get_Send_Url_JScrollPane().httpClient_Single_Get_Send_Url_JScrollPane(hcsgsu_table);
						hssp.add(hcsgsu_scroll);
						hssp.repaint();
					}
				}
			}
		});
		
		return hsgsub;
	}
}
