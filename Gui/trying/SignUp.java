package Gui.trying;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.*;
class SignUp extends JPanel implements ActionListener,FocusListener
{
    private JLabel fname,lname,un,pass,email_ID;
    private JTextField Fname,Lname,username,emailID;
    private JPasswordField password;
    private JButton submit;
    private SignInEvent sie;
    private GridBagConstraints gbc;
    public SignUp()
    {
        setLayout(new GridBagLayout());

        Border br1 = BorderFactory.createTitledBorder("Welcome to our Company");
        Border br2 = BorderFactory.createEmptyBorder(10,10,10,10);
        setBorder(BorderFactory.createCompoundBorder(br1,br2));

        fname=new JLabel("First Name : ");
        Fname=new JTextField(8);

        lname=new JLabel("Last Name : ");
        Lname=new JTextField(8);

        un=new JLabel("Username : ");
        username=new JTextField(8);

        pass=new JLabel("Password : ");
        password=new JPasswordField(8);

        email_ID=new JLabel("Email ID : ");
        emailID=new JTextField(8);

        submit=new JButton("Submit");

        Fname.addFocusListener(this);
        Lname.addFocusListener(this);
        username.addFocusListener(this);
        password.addFocusListener(this);
        emailID.addFocusListener(this);

        Fname.addActionListener(this);
        Lname.addActionListener(this);
        username.addActionListener(this);
        password.addActionListener(this);
        emailID.addActionListener(this);

        gbc = new GridBagConstraints();
        placing(gbc,0,0,0,0.015,GridBagConstraints.NONE,GridBagConstraints.LINE_END);
        add(fname,gbc);

        placing(gbc,1,0,GridBagConstraints.LINE_START);
        add(Fname,gbc);

        placing(gbc,0,1,0.1,0.01,GridBagConstraints.NONE,GridBagConstraints.FIRST_LINE_END);
        add(lname,gbc);

        placing(gbc,1,1,GridBagConstraints.FIRST_LINE_START);
        add(Lname,gbc);

        placing(gbc,0,2,0.1,0.01,GridBagConstraints.NONE,GridBagConstraints.FIRST_LINE_END);
        add(un,gbc);

        placing(gbc,1,2,GridBagConstraints.FIRST_LINE_START);
        add(username,gbc);

        placing(gbc,0,3,0.1,0.01,GridBagConstraints.NONE,GridBagConstraints.FIRST_LINE_END);
        add(pass,gbc);

        placing(gbc,1,3,GridBagConstraints.FIRST_LINE_START);
        add(password,gbc);

        placing(gbc,0,4,0.1,0.01,GridBagConstraints.NONE,GridBagConstraints.FIRST_LINE_END);
        add(email_ID,gbc);

        placing(gbc,1,4,GridBagConstraints.FIRST_LINE_START);
        add(emailID,gbc);

        placing(gbc,1,5,0.1,0.01,GridBagConstraints.NONE,GridBagConstraints.FIRST_LINE_START);
        add(submit,gbc);

        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt)
    {
        if(Fname.getText().length()>0 && Lname.getText().length()>0 && 
        username.getText().length()>0 && String.valueOf(password.getPassword()).length()>0 &&
        emailID.getText().length()>0)
        {
            addToDataBase(Fname.getText()+" "+
                Lname.getText(),username.getText(),
                String.valueOf(password.getPassword()),emailID.getText());

            SignInScreen sis = new SignInScreen(this,this);
            if(sie!=null)
            {
                this.sie.signInScreen(sis);
            }
        }
        else
        {
            if(Fname.getText().length()==0 && Lname.getText().length()==0 && 
            username.getText().length()==0 && 
            String.valueOf(password.getPassword()).length()==0 &&
            emailID.getText().length()==0)
            {
                fname.setForeground(Color.RED);
                lname.setForeground(Color.RED);
                un.setForeground(Color.RED);
                pass.setForeground(Color.RED);
                email_ID.setForeground(Color.RED);
            }
            else if(Fname.getText().length()==0)
            {
                fname.setForeground(Color.RED);
            }
            else if(Lname.getText().length()==0)
            {
                lname.setForeground(Color.RED);
            }
            else if(username.getText().length()==0)
            {
                un.setForeground(Color.RED);
            }
            else if(String.valueOf(password.getPassword()).length()==0)
            {
                pass.setForeground(Color.RED);
            }
            else if(emailID.getText().length()==0)
            {
                email_ID.setForeground(Color.RED);
            }
        }
    }

    public void focusLost(FocusEvent evt)
    {
    }

    public void focusGained(FocusEvent evt)
    {
        fname.setForeground(Color.BLACK);
        lname.setForeground(Color.BLACK);
        un.setForeground(Color.BLACK);
        pass.setForeground(Color.BLACK);
        email_ID.setForeground(Color.BLACK);
    }

    public void addSignInScreenlistener(SignInEvent sis)
    {
        sie=sis;
    }

    private void addToDataBase(String fullname,String username,String password,String email_Id)
    {
        FileWriter fw=null;
        BufferedWriter bw=null;
        FileOutputStream fout=null;
        DataOutputStream dout=null;
        File f1=new File("C:\\Aditya Srivastava\\DataBase.csv");
        boolean do1=f1.exists();
        File f2=new File("C:\\Aditya Srivastava\\Credentials.adi");
        boolean do2=f2.exists();

        try
        {
            HideUnhide.unhide("C:\\Aditya Srivastava");
            HideUnhide.unhide("C:\\Aditya Srivastava\\DataBase.csv");
            HideUnhide.unhide(f2.getPath());
            if(!do1)
            {
                File f=new File("C:\\Aditya Srivastava");
                f.mkdirs();
                f1.createNewFile();
            }
            if(!do2)
            {
                File f=new File("C:\\Aditya Srivastava");
                f.mkdirs();
                f2.createNewFile();
            }
            fw=new FileWriter("C:\\Aditya Srivastava\\DataBase.csv",do1);
            fout=new FileOutputStream("C:\\Aditya Srivastava\\Credentials.adi",do2);
            bw=new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            dout=new DataOutputStream(fout);
            pw.println(fullname+","+username+","+email_Id);
            dout.writeUTF(coder(username));
            password="##"+password+"##";
            dout.writeUTF(coder(password));
        }
        catch(Exception eL)
        {
            System.out.println(eL.getMessage());
            JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            try
            {
                dout.close();
                bw.close();

                fout.close();
                fw.close();

                HideUnhide.hide("C:\\Aditya Srivastava");
                HideUnhide.hide("C:\\Aditya Srivastava\\DataBase.csv");
                HideUnhide.hide(f2.getPath());
            }
            catch(Exception en)
            {
            }
        }
    }

    public void setvisible(boolean f)
    {
        if(!f)
        {
            setVisible(false);
            Fname.setText("");
            Lname.setText("");
            username.setText("");
            password.setText("");
            emailID.setText("");
        }
    }

    private String coder(String get)
    {
        String codedString="";
        for(int x=0;x<get.length();x++)
        {
            char ch=get.charAt(x);
            int convertChar=(int)ch+5;
            codedString+=(char)convertChar+"";
        }
        return codedString;
    }

    private void placing(GridBagConstraints gbc,int x,int y,double wx,double wy,int fill,int anchor)
    {
        gbc.gridx=x;
        gbc.gridy=y;
        gbc.weightx=wx;
        gbc.weighty=wy;

        gbc.fill=fill;
        gbc.anchor=anchor;
    }

    private void placing(GridBagConstraints gbc,int x,int y,int anchor)
    {
        gbc.gridx=x;
        gbc.gridy=y;

        gbc.anchor=anchor;
    }
}