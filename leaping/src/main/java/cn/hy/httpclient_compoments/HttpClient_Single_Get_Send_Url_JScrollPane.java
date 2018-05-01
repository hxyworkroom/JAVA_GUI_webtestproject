package cn.hy.httpclient_compoments;

import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 * 
 * @author 
 * 这是正确返回头信息的
 * 表格滚动条
 */
public class HttpClient_Single_Get_Send_Url_JScrollPane {
	public JScrollPane httpClient_Single_Get_Send_Url_JScrollPane(JTable table){
		JScrollPane scroll = new JScrollPane(table);//添加滚动条
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll.validate();
		scroll.setBounds(50,45,420,199);

		return scroll;
	}
}
