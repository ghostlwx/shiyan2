package classalter;

import java.io.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Test2 extends JFrame{
	//�¼������Ķ���Ҫ��Ϊȫ�ֱ���
	JTextField jtf;  
	JTextField jta;
	
	public Test2() {
		super("�û���¼����");
		//��ǩ����ť
		JLabel lb0 = new JLabel("�û���¼����");
		JLabel lb1 = new JLabel("�û�����");
		jtf = new JTextField(15); 
		JLabel lb2 = new JLabel("���룺");
		jta = new JPasswordField(15); 
		
		JButton b1 = new JButton("��¼");
       	JButton b2 = new JButton("����");
       	JButton b3 = new JButton("�ر�");
       	
       	
       	///�����¼�ע��
       	DataFind mm = new DataFind();
    	b1.addActionListener(mm);
    	
    	//���ð�ť�¼�
    	b2.addActionListener(
    	new ActionListener(){
    		public void actionPerformed(ActionEvent ee){
    			jtf.setText(" ");
    			jta.setText(" ");
    			}
    		});
    	
    	//�رհ�ť�¼�
    	b3.addActionListener(
    	new ActionListener(){
    		public void actionPerformed(ActionEvent ee){
    			System.exit(0);	
    			}
    		});
    	
    	//����,���
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
	
	
	//�¼�����
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
						JOptionPane.showMessageDialog(null,"��֤ͨ����");
					}
					
				}
				else
					JOptionPane.showMessageDialog(null,"��֤û��ͨ����");
				
				} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

