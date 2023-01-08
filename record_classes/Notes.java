package record_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;
class Notes extends Timer_ implements ActionListener,MouseListener,MouseMotionListener
{
    private JTable autoScannedData;
    private JButton toggleTable = new JButton("HIDE");
    private Object cols[] = {"Time of Stop","TimeStamp","Reason for a Stop"};
    private Object rows[][] = new Object[0][0];
    private String defaultReasons[]=new String[0];
    private DefaultTableModel jtm;
    private boolean isAdded = false,isDisplayed=false;
    private JComboBox jcb;
    private Reasons r;
    private JScrollPane jp;
    private int initialLength;
    public Notes()
    {
        super();
    }

    public void init()
    {
        jtm = new DefaultTableModel();

        autoScannedData = new JTable(jtm);
        jp = new JScrollPane(autoScannedData);
        Timer();
        //System.out.println(jp.getPreferredSize());
        jp.setPreferredSize(new Dimension(900,100));
        //add(autoScannedData);
        autoScannedData.addMouseListener(this);
        autoScannedData.addMouseMotionListener(this);
        autoScannedData.setDragEnabled(true);
        autoScannedData.setDropMode(DropMode.INSERT_ROWS);
        
        
        toggleTable.setEnabled(false);
        toggleTable.addActionListener(this);
        add(toggleTable);
        
        add(jp);
        jp.setVisible(false);
        toggleTable.setEnabled(true);

        NotesUpdate nu = new NotesUpdate();

        trigger(false);

        nu.start();

        pack();
        View();
        isDisplayed = true;
        r = new Reasons();
        
        start();
        
        r.write();
    }

    private int x=0,y=0;
    public void pushY(int x,int y,String val)
    {
        int dimesionOfSubArray = cols.length;
        if(x==rows.length)
        {
            Object arr[][];
            arr = new Object[rows.length+1][dimesionOfSubArray];
            for(int i=0;i<rows.length;i++)
            {
                for(int j=0;j<rows[i].length;j++)
                {
                    arr[i][j] = rows[i][j];
                }
            }
            arr[rows.length][y] = val;
            rows=arr;
        }
        else
        {
            rows[x][y] = val;
        }
    }

    public void setUpReasonColumn(TableColumn reason)
    {
        jcb = new JComboBox<String>(defaultReasons);
        jcb.addActionListener(this);
        reason.setCellEditor(new DefaultCellEditor(jcb));
    }

    public void setUpColumnWidth(TableColumn col,int width)
    {
        col.setPreferredWidth(width);
    }

    private boolean itemNotSelected = true;
    public synchronized void actionPerformed(ActionEvent evt)
    {
        super.actionPerformed(evt);
        Object ob = evt.getSource();
        if(ob == jcb)
        {
            int in = jcb.getSelectedIndex();
            //System.out.println("Selected Index : "+in);
            if(in == defaultReasons.length - 1 && itemNotSelected)
            {
                String str="";
                try
                {
                    str = JOptionPane.showInputDialog(this,"Enter your reason");
                }
                catch(Exception e){}
                if(str!=null)
                {
                    defaultReasons = r.push(defaultReasons,str);
                    r.write(str);
                    jcb.insertItemAt(str,defaultReasons.length-2);
                    r.sortCustom();
                    itemNotSelected = false;
                }
            }
            else
            {
                itemNotSelected = true;
            }
        }
        else if(ob == toggleTable)
        {
            if(toggleTable.getText().equalsIgnoreCase("HIDE"))
            {
                toggleTable.setText("SHOW");
                jp.setVisible(false);
            }
            else
            {
                toggleTable.setText("HIDE");
                jp.setVisible(true);
            }
            pack();
        }
    }

    public void mouseExited(MouseEvent evt)
    {
    }
    
    public void mouseEntered(MouseEvent evt)
    {
    }
    
    public void mouseReleased(MouseEvent evt)
    {
    }
    
    public void mousePressed(MouseEvent evt)
    {
    }
    
    public void mouseClicked(MouseEvent evt)
    {
    }
    
    public void mouseMoved(MouseEvent evt)
    {
    }
    
    public void mouseDragged(MouseEvent evt)
    {
    }
    
    class Reasons
    {
        private File fn;
        private FileReader fr;
        private BufferedReader br;
        private FileWriter fw;
        private BufferedWriter bw;
        private PrintWriter pw;
        private boolean creation = false;
        public Reasons()
        {
            init();
        }

        public void init()
        {
            fn = new File("E:\\class_records\\reasons.txt");
            boolean exists = fn.exists();
            if(!exists)
            {
                try
                {
                    fn.createNewFile();
                    creation = true;
                }
                catch(Exception e)
                {
                }
            }
        }

        public void write()
        {
            try
            {
                fw = new FileWriter(fn);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                for(int x=0;x<defaultReasons.length-1;x++)
                {
                    pw.println(defaultReasons[x]);
                }
            }
            catch(Exception e){}
            finally
            {
                try
                {
                    pw.close();
                    bw.close();
                    fw.close();
                }
                catch(Exception e1)
                {
                }
            }
        }

        public void write(String str)
        {
            try
            {
                boolean append = true;
                if(creation == true)
                    append = false;
                if(append)
                {
                    write();
                }
                fw = new FileWriter(fn,append);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);
                pw.println(str);
            }
            catch(Exception e){}
            finally
            {
                try
                {
                    pw.close();
                    bw.close();
                    fw.close();
                }
                catch(Exception e1)
                {
                }
            }
        }

        public void read()
        {
            if(!creation)
            {
                try
                {
                    fr = new FileReader(fn);
                    br = new BufferedReader(fr);
                    String s;
                    while((s = br.readLine())!=null)
                    {
                        defaultReasons = push(defaultReasons,s);
                    }
                    defaultReasons = push(defaultReasons,"Custom");
                }
                catch(Exception e)
                {}
                finally
                {
                    try
                    {
                        br.close();
                        fr.close();   
                    }
                    catch(Exception e1)
                    {
                    }
                }
            }
            else
            {
                defaultReasons=push(defaultReasons,"Sir asked for the time");
                defaultReasons=push(defaultReasons,"I had some private reasons");
                defaultReasons=push(defaultReasons,"Custom");
            }
        }

        private String[] push(String ar[],String val)
        {
            String arr[] = new String[ar.length+1];
            if(ar.length != 0)
            {
                for(int x=0;x<ar.length;x++)
                {
                    arr[x] = ar[x];
                }
            }
            arr[ar.length] = val;
            return arr;
        }

        private void sortCustom()
        {
            for(int x=0;x<defaultReasons.length-1;x++)
            {
                if(defaultReasons[x].equalsIgnoreCase("Custom"))
                {
                    defaultReasons[x]=defaultReasons[x+1];
                }
            }
            defaultReasons[defaultReasons.length - 1]="Custom";
        }
    }

    class NotesUpdate extends Thread
    {
        public NotesUpdate()
        {
            super("Update");
        }

        public void run()
        {
            while(isOpened() || !isDisplayed)
            {
                if(cond.length()==1 && isClickedToggleButton)
                {
                    for(int y=0;y<cols.length && !isAdded ;y++)
                    {
                        jtm.addColumn(cols[y]);
                    }
                    //push(rows,getTime());
                    if(!isAdded)
                    {
                        toggleTable.setEnabled(true);
                        jp.setVisible(true);
                        r.read();
                        setUpReasonColumn(autoScannedData.getColumnModel().getColumn(2));
                        setUpColumnWidth(autoScannedData.getColumnModel().getColumn(0),50);
                        setUpColumnWidth(autoScannedData.getColumnModel().getColumn(1),120);
                        //autoScannedData.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                    }
                    pushY(x,0,getTime());
                    pushY(x,1,getTimeStamp());

                    jtm.addRow(rows[x]);
                    x++;

                    isAdded = true;
                    isClickedToggleButton = false;
                    pack();
                }
            }
        }
    }
}