/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccinemain;

//import built-in packages
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author brend
 */
public class Appointment {
    
    private String FullName;
    private String Vaccentre;
    private String Bookdate;
    private String Booktime;
    private String InitialDate;
    
    public Appointment(String fn)
    {
        FullName = fn;
    }
    
    
    public Appointment(String fn, String bd)
    {
        FullName = fn;
        Bookdate = bd;
    }
    
    
    public Appointment(String fn, String vcc, String bd, String bt)
    {
        FullName = fn;
        Vaccentre = vcc;
        Bookdate = bd;
        Booktime = bt;
    }
    
    
    public Appointment(String fn, String vcc, String bd, String bt, String id)
    {
        FullName = fn;
        Vaccentre = vcc;
        Bookdate = bd;
        Booktime = bt;
        InitialDate = id;
    }
    
    public void Book()
    {            
            LocalDate mas = LocalDate.now();                //mas stores the local date
            LocalDate endDate = LocalDate.parse(Bookdate);  //String Bookdate is converted to date datatype and stored as endDate
         
            int daydifference = (int)ChronoUnit.DAYS.between(mas, endDate); //Find difference between mas and endDate (endDate - mas)
            
            if((daydifference < 2) || (daydifference > 30)) 
            {
                JOptionPane.showMessageDialog(null, "You are only allowed to book an appointment 2 days till 30 days in advance","Error Message",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int toggleappointment = 1;
                    BufferedReader myfile = new BufferedReader(new FileReader("Appointmentdata.txt"));
                    String [] lineArr;
                    String line;

                    while((line = myfile.readLine())!=null)
                    {
                        lineArr = line.split(" , ");
                        if(lineArr[0].equals(FullName)) //if first column equals to FullName
                        {
                            toggleappointment = 0;
                            JOptionPane.showMessageDialog(null, "One Appointment is only allowed \nPls return to previous page","Error Message",JOptionPane.ERROR_MESSAGE);
                            break;
                        }

                        if(lineArr[1].equals(Vaccentre))    //if second column equals to Vaccination centre
                        {
                            if((lineArr[2].equals(Bookdate)) && (lineArr[3].equals(Booktime)))  //if third column equals to Bookdate and fourth column equals to Booktime
                            {
                                toggleappointment = 0;
                                JOptionPane.showMessageDialog(null, "Time slot has been taken, Kindly choose another one!!!","Error Message",JOptionPane.ERROR_MESSAGE);
                                break;
                            }  
                        }
                    }
                    myfile.close();

                    if (toggleappointment == 1)
                    {
                        int dialogResult = JOptionPane.showConfirmDialog (null, "Check your appointment details below:\n\nFull Name: "+FullName +"\nCentre Name: "+Vaccentre+"\nDate: "+Bookdate+"\nTime: "+Booktime,"Confirmation",JOptionPane.YES_NO_OPTION);
                        if(dialogResult == JOptionPane.YES_OPTION)                                          //check details
                        {
                            try
                            {
                                FileWriter fw = new FileWriter("Appointmentdata.txt", true);    //Open file for writing
                                fw.write(FullName + " , " + Vaccentre + " , " + Bookdate + " , " + Booktime + "\n");
                                JOptionPane.showMessageDialog(null, "Appointment Made Successfully!!!");
                                fw.close();
                            }
                            catch(IOException e)
                            {
                                e.printStackTrace();
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Appointment not saved");
                        }
                    }
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }  
        
    }
    
    public void CancelAppointment()
    {
        ArrayList <String> tempArray = new ArrayList<>();
        
        LocalDate mas = LocalDate.now();    //mas stores local date
        LocalDate checkdate = LocalDate.parse(Bookdate);    
        
        int modifiable = (int)ChronoUnit.DAYS.between(mas, checkdate);  

        if(modifiable < 0)  //if the appointment date has already pass the current date
        {
            JOptionPane.showMessageDialog(null, "This user is already vaccinated");
        }
        else
        {
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you wish to delete your appointment","Confirmation",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                try
                {
                    BufferedReader myfile = new BufferedReader(new FileReader("Appointmentdata.txt"));

                    String [] lineArr;
                    String line;

                    while((line = myfile.readLine())!=null)
                    {
                        lineArr = line.split(" , ");
                        if(!lineArr[0].equals(FullName))    //excluding the row which has FullName in it
                        {
                            tempArray.add(line);
                        }
                    }

                    myfile.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }

                try
                {
                    PrintWriter pw = new PrintWriter("Appointmentdata.txt");

                    for(String str : tempArray)
                    {
                         pw.println(str);
                    }
                    pw.close();
                    JOptionPane.showMessageDialog(null, "Delete Successful");
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Delete failed");
            }
        }
    }
          
    public void ModifyAppointment()
    {       
        LocalDate mas = LocalDate.now();
        LocalDate endDate = LocalDate.parse(Bookdate);
            
        LocalDate checkdate = LocalDate.parse(InitialDate);
        
        int modifiable = (int)ChronoUnit.DAYS.between(mas, checkdate);

        if(modifiable < 0) //if the appointment date has already pass the current date
        {
            JOptionPane.showMessageDialog(null, "This user is already vaccinated");
        }
        else
        {
                             
            int daydifference = (int)ChronoUnit.DAYS.between(mas, endDate);
            
            if((daydifference < 2) || (daydifference > 30))
            {
                JOptionPane.showMessageDialog(null, "You are only allowed to book an appointment 2 days till 30 days in advance","Error Message",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int toggleappointment = 1;
                    BufferedReader myfile = new BufferedReader(new FileReader("Appointmentdata.txt"));
                    String [] lineArr;
                    String line;

                    while((line = myfile.readLine())!=null)
                    {
                        lineArr = line.split(" , ");

                        if(lineArr[1].equals(Vaccentre))    //if second column equals to vaccination centre
                        {
                            if((lineArr[2].equals(Bookdate)) && (lineArr[3].equals(Booktime)))  //if third column equals to Bookdate and fourth column equals to Booktime
                            {
                                toggleappointment = 0;
                                JOptionPane.showMessageDialog(null, "Time slot has been taken, Kindly choose another one!!!","Error Message",JOptionPane.ERROR_MESSAGE);
                                break;
                            }  
                        }
                    }
                    
                    if(toggleappointment == 1)  //Requirements all pass
                    {
                        int dialogResult = JOptionPane.showConfirmDialog (null, "Check your appointment details below:\n\nFull Name: "+FullName +"\nCentre Name: "+Vaccentre+"\nDate: "+Bookdate+"\nTime: "+Booktime,"Confirmation",JOptionPane.YES_NO_OPTION);
                        if(dialogResult == JOptionPane.YES_OPTION)                                                      //check details
                        {
                            try
                            {
                                ArrayList <String> tempArray = new ArrayList<>();
                                BufferedReader myfiles = new BufferedReader(new FileReader("Appointmentdata.txt"));

                                String [] lineArrs;
                                String lines;

                                while((lines = myfiles.readLine())!=null)
                                {
                                    lineArrs = lines.split(" , ");
                                    if(lineArrs[0].equals(FullName))
                                    {
                                        tempArray.add(FullName + " , " + Vaccentre + " , " + Bookdate + " , " + Booktime);
                                    }

                                    else
                                    {
                                        tempArray.add(lines);
                                    }
                                }

                                PrintWriter pw = new PrintWriter("Appointmentdata.txt");

                                for(String str : tempArray)
                                {
                                    pw.println(str);
                                }
                                JOptionPane.showMessageDialog(null, "Modification made successfully!!!");
                                pw.close();

                                myfiles.close();
                            }

                            catch(IOException e)
                            {
                                e.printStackTrace();
                            } 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Modification not made!!!");
                        }
                    }
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
