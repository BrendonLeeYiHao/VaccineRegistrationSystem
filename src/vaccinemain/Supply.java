/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccinemain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author brend
 */
public class Supply {
     
    private String id;
    private String name;
    private String origin;
    private String stock;
    
    public Supply(String ID, String Name, String Origin, String Stock)
    {
        id = ID;
        name = Name;
        origin = Origin;
        stock = Stock;
    }
    
    
    void Addfile()
    {
        try
        {
            BufferedReader myfile = new BufferedReader(new FileReader("Supply.txt"));

            String [] lineArr;
            String line;

            int togglenameexist = 1;
            while((line = myfile.readLine())!=null)     //while each line is not null
            {
                lineArr = line.split(", ");            //split line at " , " and store as lineArr
                if(lineArr[1].equals(name))         //if first column equals to FullName
                {
                    togglenameexist = 1;    
                    break;
                }
                else
                {
                    togglenameexist = 0;
                }
            }

            if(togglenameexist == 1)
            {
                JOptionPane.showMessageDialog(null, "Name Existed, Pls Choose another Name","Error Message", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int togname = 1;    
                String namepattern = "^[a-zA-Z ]{3,50}$";
                Pattern namepat = Pattern.compile(namepattern);
                Matcher namemat = namepat.matcher(name);
                if(!namemat.find()) //Error name format
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Name Format!!!","Error Message", JOptionPane.ERROR_MESSAGE);
                    togname = 0;       
                }

                int togori = 1;    
                String oripattern = "^[a-zA-Z ]{3,50}$";
                Pattern oripat = Pattern.compile(oripattern);
                Matcher orimat = oripat.matcher(origin);
                if(!orimat.find()) //Error origin format
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Origin Format!!!","Error Message", JOptionPane.ERROR_MESSAGE);
                    togname = 0;       
                }

                int flag = 1;
                try
                {
                    flag = 1;
                    int number = Integer.parseInt(stock);
                }
                catch (NumberFormatException e)
                {
                    flag = 0;
                    JOptionPane.showMessageDialog(null, "Only number is allow.");
                }

                if (flag == 1 && togname == 1 && togori == 1) //If all correct
                {
                    try
                    {
                        BufferedReader myfiles = new BufferedReader(new FileReader("Supply.txt"));

                        String [] lineArrs;
                        String lines;

                        int toggleIDexist = 1;
                        while((lines = myfiles.readLine()) != null)
                        {
                            lineArrs = lines.split(", ");
                            if(lineArrs[0].equals(id))
                            {
                                toggleIDexist = 1;    
                                break;
                            }
                            else
                            {
                                toggleIDexist = 0;
                            }
                        }

                        if(toggleIDexist == 1)
                        {
                            JOptionPane.showMessageDialog(null, "id Existed, Pls Choose another id","Error Message", JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            try 
                            {
                                FileWriter fw = new FileWriter("Supply.txt",true);
                                fw.write(id + ", " + name + ", "+ origin +", "+ stock + "\n");
                                fw.close();

                                JOptionPane.showMessageDialog(null, "Saved.");
                            } 
                            catch (IOException ex) 
                            {
                               Logger.getLogger(PersonnelSupply.class.getName()).log(Level.SEVERE, null, ex);                
                            }
                        }
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                } 
                else
                {
                    JOptionPane.showMessageDialog(null,"Some of the areas are not filled in");
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    

}
