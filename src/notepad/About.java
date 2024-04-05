package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener{
    
    About(){
        
        setBounds(400, 100, 600, 500);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70, 40, 400, 80);
        add(headerIcon);
        
        ImageIcon j1= new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image j2 = j1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel icon = new JLabel(j3);
        icon.setBounds(50, 160, 70, 70);
        add(icon);
        
        JLabel text = new JLabel("<html>Crated by Sachin Baskandi.<br> version 0.1.0 ( Build using Java ).<br>  &copy; All rights reserved.<br><br>Notepad is a word processing program<br> which "
                + "allows changing of text in computer file,<br> Notepad is simple text editor for basic text editing program<br> which enables computer used to create documents.</html>");
        text.setBounds(150, 100, 500, 300);
        text.setFont(new Font ("SAN_SERIF",Font.PLAIN, 16));
        add(text);
        
        JButton b1 = new JButton("OK");
        b1.setBounds(150, 350, 120, 25);
        b1.addActionListener(this);
        add(b1);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args) {
        new About();
    }
    
}
