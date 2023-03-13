package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;

public class AccountStudent extends JFrame {
		JLabel lblEmail;
		JTextField tfEmail;
		JLabel lblPassword;
		JTextField tfPassword;
		JButton btnRegis;
		
		public AccountStudent( ) {
			lblEmail = new JLabel("Email");
			tfEmail = new JTextField(10);
			lblPassword = new JLabel("Password");
			tfPassword =new JTextField(10);
			btnRegis = new JButton("Regis");
			btnRegis.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ConnectDB();
				}
			});
			Container cont = this.getContentPane();
			setSize(400, 300);
			setLayout(new FlowLayout());
			cont.add(lblEmail);
			cont.add(tfEmail);
			cont.add(lblPassword);
			cont.add(tfPassword);
			cont.add(btnRegis);
		
		setVisible(true);
		}
  Connection conn;
  public void ConnectDB() {
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountStudent","root","");
		System.out.println("Connection ok");
	} catch (Exception e) {
		e.printStackTrace();
	}
		  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AccountStudent();
	}

}