/*
* Shubham Jain
*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class NewPro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPro frame = new NewPro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewPro() {
		setTitle("Basic Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton dotbtn = new JButton(".");
		dotbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText();
				
				if (!str.equals(""))
				{
					if (!(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' || str.charAt(str.length()-1)=='.'))
					textField.setText(textField.getText().concat("."));
				}
			}
		});
		dotbtn.setBounds(10, 230, 46, 23);
		contentPane.add(dotbtn);
		
		JButton zerobtn = new JButton("0");
		zerobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("0"));
				}
			}
		});
		zerobtn.setBounds(66, 230, 46, 23);
		contentPane.add(zerobtn);
		
		JButton eqlbtn = new JButton("=");
		eqlbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String str = textField.getText();
				int a, b;
				
				if (!str.equals(""))
				{
					if (!(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' || str.charAt(str.length()-1)=='.'))
					{
						for(int i=0; i<str.length(); i++)
						{
							if (str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/')
							{
								a = Integer.parseInt(str.substring(0, i));
								b = Integer.parseInt(str.substring(i+1, str.length()));
							
								if (str.charAt(i)=='+')
								{
									textField.setText((a+b)+"");
								}
								else if (str.charAt(i)=='-')
								{
									textField.setText((a-b)+"");
								}
								else if (str.charAt(i)=='*')
								{
									textField.setText((a*b)+"");
								}
								else if (str.charAt(i)=='/')
								{
									textField.setText((a/b)+"");
								}
							}
						}
					}
				}
			}
		});
		eqlbtn.setBounds(122, 230, 46, 23);
		contentPane.add(eqlbtn);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled() && textField.isEditable())
				{
					textField.setText(textField.getText().concat("1"));
				}
			}
		});
		btn1.setBounds(10, 196, 46, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("2"));
				}
			}
		});
		btn2.setBounds(66, 196, 46, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("3"));
				}
				
			}
		});
		btn3.setBounds(122, 196, 46, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("4"));
				}
			}
		});
		btn4.setBounds(10, 162, 46, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("5"));
				}
			}
		});
		btn5.setBounds(66, 162, 46, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("6"));
				}
			}
		});
		btn6.setBounds(122, 162, 46, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("7"));
				}
			}
		});
		btn7.setBounds(10, 128, 46, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("8"));
				}
			}
		});
		btn8.setBounds(66, 128, 46, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					textField.setText(textField.getText().concat("9"));
				}
			}
		});
		btn9.setBounds(122, 128, 46, 23);
		contentPane.add(btn9);
		
		// addition
		
		JButton addbtn = new JButton("+");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.isEnabled())
				{
					String str = textField.getText();
					
					if (!str.equals(""))
					{
						if (!(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' || str.charAt(str.length()-1)=='.'))
						textField.setText(textField.getText().concat("+"));
					}
				}
				
			}
		});
		addbtn.setBounds(178, 128, 89, 23);
		contentPane.add(addbtn);
		
		// subtraction
		
		JButton subbtn = new JButton("-");
		subbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText();
				
				if (!str.equals(""))
				{
					if (!(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' || str.charAt(str.length()-1)=='.'))
					textField.setText(textField.getText().concat("-"));
				}
			}
		});
		subbtn.setBounds(178, 162, 89, 23);
		contentPane.add(subbtn);
		
		// multiplication
		
		JButton mulbtn = new JButton("*");
		mulbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText();
				
				if (!str.equals(""))
				{
					if (!(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' || str.charAt(str.length()-1)=='.'))
					textField.setText(textField.getText().concat("*"));
				}
			}
		});
		mulbtn.setBounds(178, 196, 89, 23);
		contentPane.add(mulbtn);
		
		// division
		
		JButton divbtn = new JButton("/");
		divbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText();
				
				if (!str.equals(""))
				{
					if (!(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-' || str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/' || str.charAt(str.length()-1)=='.'))
					textField.setText(textField.getText().concat("/"));
				}
			}
		});
		divbtn.setBounds(178, 230, 89, 23);
		contentPane.add(divbtn);
		
		// clear button to clear the text field
		
		JButton clrbtn = new JButton("CLR");
		clrbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		clrbtn.setBounds(10, 94, 71, 23);
		contentPane.add(clrbtn);
		
		// delete button to delete the text
		
		JButton dltbtn = new JButton("DLT");
		dltbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText();
				if (!str.equals("")) {
					str = str.substring(0, str.length()-1);
					textField.setText(str);
				}
			}
		});
		dltbtn.setBounds(97, 94, 71, 23);
		contentPane.add(dltbtn);
		
		//toggle button to ON-OFF the calculator
		
		JToggleButton tgl = new JToggleButton("OFF");
		tgl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if (tgl.getText().equalsIgnoreCase("ON"))
				{
					textField.setEnabled(true);
					tgl.setText("OFF");
				}
				else if (tgl.getText().equalsIgnoreCase("OFF"))
				{
					textField.setEnabled(false);
					textField.setText("");
					tgl.setText("ON");
				}
			}
		});
		tgl.setBounds(178, 94, 89, 23);
		contentPane.add(tgl);
		
		textField = new JTextField();
		textField.setBounds(10, 37, 158, 33);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
