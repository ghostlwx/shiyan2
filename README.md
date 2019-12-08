### 班级：计G191
### 姓名：梁文玺
### 学号：2019322050

## 一、实验目的
* 分析学生选课系统
* 使用GUI窗体及其组件设计窗体界面
* 完成学生选课过程业务逻辑编辑
* 基于文件保存并读取数据
* 处理异常
## 二、程序设计:
* 总共有7个类，分别为：Course、Personal、Teacher、Student、Test、Test2、TestFlowLayout。
* GUI界面设计为Test2（登录界面）、TestFlowLayout(学生选课界面)。

## 三、实验代码  
### 用GUI实现的登录界面
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
### 选课界面的设计以及添加事件
public class TestFlowLayout {

    public static void main(String[] args) {

    	 Frame f = new Frame();//建立一个空窗口。
    	 f.setTitle("选课系统");
    	 FlowLayout fl = new FlowLayout();  //使用流布局
         f.setLayout(fl);//修改布局管理
         f.setSize(500, 400);//设置窗口大小,
         f.setLocation(300, 200);//设置窗口的初始位置
         f.setVisible(true);//显示窗口。
    	 

         f.addWindowListener(new WindowAdapter(){
 			public void windowClosing(WindowEvent e){
 				Window window=(Window)e.getComponent();
 				window.dispose();
 			}
 		});

### 对于界面内按钮的布局
TextField textField = new TextField();
 		textField.setBounds(150, 100, 240, 50);
 		textField.setBackground(Color.white);
 		MyActionListener myActionListener = new MyActionListener(textField);//创建一个按钮监听事件对象
 		f.add(textField);
 		Button button1= new Button("选课");
 		
 		button1.setBounds(100,200,100,50);
 		button1.setBackground(Color.white);
 		button1.addActionListener(myActionListener);//添加myActionListener监听事件
 		f.add(button1);
 		Button button2= new Button("退出课程");
 		button2.setBounds(300,200,100,50);
 		button2.setBackground(Color.yellow);
 		ActionListener myActionListener2=new MyActionListener2(textField);
		button2.addActionListener(myActionListener2);//添加myActionListener监听事件
 		f.add(button2);
        f.setLayout(null);//清空布局
    }
    	
}

## 四、效果的实现
### 登录界面
![image](https://github.com/ghostlwx/shiyan2/blob/master/1.png)
### 选课界面
![image](https://github.com/ghostlwx/shiyan2/blob/master/2.png)
### 退课界面
![image](https://github.com/ghostlwx/shiyan2/blob/master/3.png)
## 五、实验总结   
在本学期最后一个Java实验中，我将本学期所学的东西尽量全部应用到程序中，当然知识储备还是十分稀少，程序不是很完美，但是我还是有所收获，受益匪浅。本次的实验，我又重新对选课界面进行了排版。比如学会了按钮的设置，比如退课的按钮设置Button button2= new Button("退出课程");button2.setBounds(300,200,100,50);也是过本次实验，我发现了我的很多不足，很多程序不够精炼，编写过程十分困难，需要在网上查找大量语法知识以及一些类似代码对比学习，希望在这一学期的学习过程对我有很大帮。

