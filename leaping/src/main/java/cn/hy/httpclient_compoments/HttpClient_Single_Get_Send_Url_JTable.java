package cn.hy.httpclient_compoments;

import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class HttpClient_Single_Get_Send_Url_JTable {
	public JTable httpClient_Single_Get_Send_Url_JTable(Map map){
        String[] columnNames = {"响应","信息"};  
        int num_nr=map.size();
        
        
        
        Object[][] obj=new Object[num_nr][2]; 
        //给表中装数据
        for (int i = 0; i <num_nr; i++) {
          obj[i][0] =map.keySet().toArray()[i];
          obj[i][1] =map.get(map.keySet().toArray()[i]);
		}

        JTable table=new JTable(obj, columnNames);  //JTable的其中一种构造方法 

        TableColumn column=null;                    //设置JTable的列默认的宽度和高度 
        int colunms = table.getColumnCount();  
        for(int j=0;j<colunms;j++)  
        {  
            column = table.getColumnModel().getColumn(j);  
            column.setPreferredWidth(200);           //将每一列的默认宽度设置为100
        }   
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //设置JTable自动调整列表的状态，此处设置为关闭       
        return table;
	}

}
