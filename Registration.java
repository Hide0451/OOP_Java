import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
    extends JFrame
    implements ActionListener {
 
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
	private JLabel psw;
    private JPasswordField tpsw;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JLabel res;
 
    public MyFrame()
    {
        setTitle("Registration");
        setBounds(300, 90, 535, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Registration");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(200, 30);
        title.setLocation(180, 30);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(110, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(210, 100);
        c.add(tname);
 
        mno = new JLabel("Email");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(110, 150);
        c.add(mno);
		
		tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(210, 150);
        c.add(tmno);
		
		psw = new JLabel("Password");
        psw.setFont(new Font("Arial", Font.PLAIN, 20));
        psw.setSize(100, 20);
        psw.setLocation(110, 200);
        c.add(psw);
		
		tpsw = new JPasswordField();
        tpsw.setFont(new Font("Arial", Font.PLAIN, 15));
        tpsw.setSize(190, 20);
        tpsw.setLocation(210, 200);
        c.add(tpsw);
 
        sub = new JButton("Register");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(150, 20);
        sub.setLocation(165, 250);
        sub.addActionListener(this);
        c.add(sub);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(140, 300);
        c.add(res);
 
        setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (tname.getText().equals("") || tmno.getText().equals("") || tpsw.getText().equals("")) {
                res.setText("Please fill all of the fields");
            }
            else {
				res.setText("");
				String name = tname.getText();
                String email = tmno.getText();
				String password = tpsw.getText();
            }
        }
    }
}
 
class Registration {
 
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}