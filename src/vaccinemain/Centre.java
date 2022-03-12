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
public class Centre {
    
    private String id;
    private String name;
    private String location;
    private String vaccine;
    private String search;
    
    public Centre(String ID, String Name, String Location, String Vaccine)
    {
        id = ID;
        name = Name;
        location = Location;
        vaccine = Vaccine;
    }
    
    public Centre(String ID, String Name, String Location, String Vaccine, String Search)
    {
        id = ID;
        name = Name;
        location = Location;
        vaccine = Vaccine;
        search = Search;
    }
    
    void Addfile()
    {
        try
        {
            BufferedReader myfile = new BufferedReader(new FileReader("Centre.txt"));

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
                if(!namemat.find())
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Name Format!!!","Error Message", JOptionPane.ERROR_MESSAGE);
                    togname = 0;       
                }

                int togloc = 1;    
                String locpattern = "^[a-zA-Z ]{3,50}$";
                Pattern locpat = Pattern.compile(locpattern);
                Matcher locmat = locpat.matcher(location);
                if(!locmat.find())
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Location Format!!!","Error Message", JOptionPane.ERROR_MESSAGE);
                    togloc = 0;       
                }

                if (togname == 0 || togloc == 0)
                {
                    JOptionPane.showMessageDialog(null,"Some of the areas are not filled in the proper format");
                }
                else
                {
                    try
                    {
                        BufferedReader myfiles = new BufferedReader(new FileReader("Centre.txt"));

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

                        if(toggleIDexist == 1) //ID error
                        {
                            JOptionPane.showMessageDialog(null, "ID Existed, Pls Choose another ID","Error Message", JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            try 
                            {
                                JOptionPane.showMessageDialog(null, "Saved.");
                               FileWriter fw = new FileWriter("Centre.txt",true);
                               fw.write(id + ", " + name + ", "+ location +", "+ vaccine + "\n");
                               fw.close();
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
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
