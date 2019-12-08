package classalter;

import java.io.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Test2 extends JFrame{
	//事件监听的对象要设为全局变量
	JTextField jtf;  
	JTextField jta;
	
	public Test2() {
		super("用户登录窗口");
		//标签、按钮
		JLabel lb0 = new JLabel("用户登录窗口");
		JLabel lb1 = new JLabel("用户名：");
		jtf = new JTextField(15); 
		JLabel lb2 = new JLabel("密码：");
		jta = new JPasswordField(15); 
		
		JButton b1 = new JButton("登录");
       	JButton b2 = new JButton("重置");
       	JButton b3 = new JButton("关闭");
       	
       	
       	///监听事件注册
       	DataFind mm = new DataFind();
    	b1.addActionListener(mm);
    	
    	//重置按钮事件
    	b2.addActionListener(
    	new ActionListener(){
    		public void actionPerformed(ActionEvent ee){
    			jtf.setText(" ");
    			jta.setText(" ");
    			}
    		});
    	
    	//关闭按钮事件
    	b3.addActionListener(
    	new ActionListener(){
    		public void actionPerformed(ActionEvent ee){
    			System.exit(0);	
    			}
    		});
    	
    	//容器,添加
       	JPanel   p = new JPanel();
       	p.add(lb0);
       	p.add(lb1);
       	p.add(jtf);
       	p.add(lb2);
       	p.add(jta);
       	p.add(b1);
       	p.add(b2);
       	p.add(b3);
       	
       	
    	getContentPane().add(p);
    	setSize(500,300);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
       
	}
	public static void main(String[] args) {
		
    	new Test2();
    }
	
	
	//事件监听
	class DataFind implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str0 = jtf.getText();
			String str1 = jta.getText();
			boolean find = false;
			String ss="";
			try {
				Scanner sc = new Scanner(new File("123.txt"));
				while(sc.hasNextLine()) {
					ss = sc.nextLine();
					if(ss.indexOf(str0)>=0&&ss.indexOf(str1)>=0) {
						find = true;
						break;
					}
					
				}
				if(find) {
					String[] temp=ss.split("\\s+");
					if(temp[0].equals(str0)&&temp[1].equals(str1)) {
						JOptionPane.showMessageDialog(null,"验证通过！");
					}
					
				}
				else
					JOptionPane.showMessageDialog(null,"验证没有通过！");
				
				} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

