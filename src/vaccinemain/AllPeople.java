/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccinemain;

//importing built-in packages
import java.io.*;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author brend
 */
public class AllPeople {
    
    private String FullName;
    private String Password;
    private String ICPassport;
    private String PhoneNumber;
    private String EmailAddress;
    private String HomeAddress;
    private String Peoplehere;
    private String HealthStatus;
    private String LoginDate;
    private String LoginTime;
    
    public AllPeople()
    {
        
    }
    
    public AllPeople(String f)
    {
        FullName = f;
    }
    
    public AllPeople(String n, String pw, String ld, String lt)
    {
        FullName = n;
        Password = pw;
        LoginDate = ld;
        LoginTime = lt;
    }
    
   
    public AllPeople(String name, String pass, String ICP, String phone, String email, String home, String p, String hs)
    {
        FullName = name;
        Password = pass;
        ICPassport = ICP;
        PhoneNumber = phone;
        EmailAddress = email;
        HomeAddress = home;
        Peoplehere = p;
        HealthStatus = hs;
    }
    
    public void Register()
    {           
                //Validation for existence of Full Name
                
                try
                {
                    BufferedReader myfile = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));

                    String [] lineArr;
                    String line;
                    
                    int togglenameexist = 1;
                    while((line = myfile.readLine())!=null)     //while each line is not null
                    {
                        lineArr = line.split(" , ");            //split line at " , " and store as lineArr
                        if(lineArr[0].equals(FullName))         //if first column equals to FullName
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
                        //Validation for Full Name
                        int togname = 1;    

                        String namepattern = "^[a-zA-Z ]{3,50}$";

                        Pattern namepat = Pattern.compile(namepattern); //namepat stores the pattern

                        Matcher namemat = namepat.matcher(FullName);    //match pattern with FullName

                        if(!namemat.find() || FullName == "") //if not match
                        {
                            JOptionPane.showMessageDialog(null, "Incorrect Name Format!!! Only Accept lower case, upper case and space, min 3 max 50","Error Message", JOptionPane.ERROR_MESSAGE);
                            togname = 0;            
                        }

                        //Validation for password    
                        int togpass = 1;

                        String passpattern = "^[a-zA-Z0-9]{5,12}$";

                        Pattern passpat = Pattern.compile(passpattern); //passpat stores the pattern

                        Matcher passmat = passpat.matcher(Password);    //match pattern with Password

                        if(!passmat.find()) //if not match
                        {
                            JOptionPane.showMessageDialog(null, "Incorrect Password Format!!! Only Accept lower case, upper case and numbers, min 5 max 12","Error Message", JOptionPane.ERROR_MESSAGE);
                            togpass = 0;
                        }
                        
                        
                        //Validation for IC/Passport
                        
                        int togicp = 1;
                        if(Peoplehere == "Citizen") 
                        {
                            togicp = 1;

                            String icpattern = "^[0-9]{6}-[0-9]{2}-[0-9]{4}$";
                       
                            Pattern icpat = Pattern.compile(icpattern); //icpat stores the pattern
                            Matcher icmat = icpat.matcher(ICPassport);  //match pattern with IC

                            if(!icmat.find())   //if not match
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect IC Format!!! Pls follow this format: XXXXXX-XX-XXXX \nEx. 010101-01-0101","Error Message", JOptionPane.ERROR_MESSAGE);
                                togicp = 0;
                            } 
                        }
                        
                        else
                        {          
                            togicp = 1;
                            String pppatern = "^[A-Z0-9]{7,9}$";
                            
                            Pattern pppat = Pattern.compile(pppatern);  //pppat stores the pattern
                            Matcher ppmat = pppat.matcher(ICPassport);  //match pattern with Passport

                            if(!ppmat.find())   //if not match
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect Passport Format!!! Only Accept Upper case and numbers, min 7 max 9","Error Message", JOptionPane.ERROR_MESSAGE);
                                togicp = 0;
                            } 
                        }
                        
                        
                        //Validation for phone number
                        int togphone = 1;


                            String[] ph = {"^[0][1][2-9]-[0-9]{7}$", "^[0][1][1]-[0-9]{8}$"};  //Array which has two patterns
                            for (String i : ph) //loop pattern
                            {
                                Pattern pho = Pattern.compile(i);   //pho stores the pattern
                                Matcher phonum = pho.matcher(PhoneNumber);  //match pattern with PhoneNumber

                                if(phonum.find())   //if match
                                {
                                    togphone = 1;
                                    break;
                                }
                                else    
                                {
                                    togphone = 0;
                                }           
                            }

                            if (togphone == 0)  //if not match
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect Phone Format!!! Pls follow either one of the formats:\n01X-XXXXXXX for 1st X being (2-9) or \n011-XXXXXXXX","Error Message", JOptionPane.ERROR_MESSAGE);
                            }



                            //Validation for email
                            int togemail = 1;

                            String[] em = {"^[a-zA-Z0-9]{3,30}(@outlook.com)$", "^[a-zA-Z0-9]{3,30}(@gmail.com)$",  //Array which has 4 patterns
                                           "^[a-zA-Z0-9]{3,30}(@yahoo.com)$", "^[a-zA-Z0-9]{3,30}(@hotmail.com)$"};
                            for (String j : em)
                            {
                                Pattern pa = Pattern.compile(j);    //pa stores the pattern
                                Matcher mat = pa.matcher(EmailAddress); //match pattern with EmailAddress

                                if(mat.find())  //if match
                                {
                                    togemail = 1;
                                    break;
                                }
                                else
                                {
                                    togemail = 0;
                                }

                            }
                            if(togemail == 0)   //if not match
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect Email Format!!! Only Accept lower case, upper case and numbers, min 3 max 30 which followed by \n@outlook.com or @gmail.com or @yahoo.com or @hotmail.com","Error Message", JOptionPane.ERROR_MESSAGE);
                            }
                            
                            
                            //Validation for houseaddress
                            int toghouse = 1;
                            
                            String housepattern = "^[a-zA-Z0-9 ]{2,200}$";

                            Pattern housepat = Pattern.compile(housepattern);   //housepat stores the pattern

                            Matcher housemat = housepat.matcher(HomeAddress);   //match pattern with HomeAddress

                            if(!housemat.find() || HomeAddress == "")    //if not match
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect House Address Format!!! Only Accept lower case, upper case, numbers and space, min 2 max 200","Error Message", JOptionPane.ERROR_MESSAGE);
                                toghouse = 0;
                            }
                                  
                            if((togname == 1) && (togphone == 1) && (togemail == 1) && (togpass == 1) && (togicp == 1) && (toghouse == 1))  //if all patterns match
                            {
                                int dialogResult = JOptionPane.showConfirmDialog (null, "Do you wish to save changes made?","Confirmation",JOptionPane.YES_NO_OPTION);
                                if(dialogResult == JOptionPane.YES_OPTION)
                                {
                                    try
                                    {
                                        FileWriter myfiles = new FileWriter("HorizontalPatientInfo.txt", true);     //open file for writing
                                        myfiles.write(FullName + " , " + Password + " , " + ICPassport + " , " + PhoneNumber + " , " + EmailAddress + " , " + HomeAddress + " , " + Peoplehere + " , " + HealthStatus  + "\n");
                                        JOptionPane.showMessageDialog(null, "Account successfully registered!!!");
                                        myfiles.close();
                                    }
                                    catch (IOException e)
                                    {             
                                        e.printStackTrace();
                                    }   
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Account not registered!!!");
                                }
                            }
                    }
                }
                
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                                
    }
    
    public void Login()
    {
        int flag = 1;
        
        try
        {
            
            BufferedReader myfile = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));    //read file

            String [] lineArr;
            String line;
            
            while((line = myfile.readLine())!=null) //while line is not null
            {
                lineArr = line.split(" , ");    //split line at " , " and store in lineArr
                if((lineArr[0].equals(FullName)) && (lineArr[1].equals(Password)))  //check if first column equals to FullName and second column equals to Password
                {
                    flag = 1;       
                    break;
                }
                else
                {
                    flag = 0;
                }                       
            }
            myfile.close();
            
            if (flag == 0)  
            {
                JOptionPane.showMessageDialog(null,"Wrong Credentials\nPls Check Again","MessageBox",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Correct Username and Password\nSuccessfully Logged In!!!");
                try 
                {
                    BufferedWriter myfiles = new BufferedWriter(new FileWriter("LoginHistory.txt",true));   //open file for writing
                    myfiles.write(FullName+ " , " + LoginDate + " , " + LoginTime + "\n");  //write user login time into file
                    myfiles.close();
                } 
                catch (IOException ex) 
                {
                    java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                PeopleFunctionPage pfp = new PeopleFunctionPage(FullName);  
                pfp.setVisible(true);
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    
    public void UpdateDetails()
    {           
                //Validation for password
                int togpass = 1;
                
                String passpattern = "^[a-zA-Z0-9]{5,12}$";
                
                Pattern passpat = Pattern.compile(passpattern);
                
                Matcher passmat = passpat.matcher(Password);
                
                if(!passmat.find())
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Password Format!!! Only Accept Upper case and numbers, min 7 max 9","Error Message", JOptionPane.ERROR_MESSAGE);
                    togpass = 0;
                }
                
                
                //Validation for phone number
                int togphone = 1;
                
                String[] ph = {"^[0][1][2-9]-[0-9]{7}$", "^[0][1][1]-[0-9]{8}$"};  
                for (String i : ph)
                {
                    Pattern pho = Pattern.compile(i); 
                    Matcher phonum = pho.matcher(PhoneNumber);

                    if(phonum.find())
                    {
                        togphone = 1;
                        break;
                    }
                    else
                    {
                        togphone = 0;
                    }           
                }

                if (togphone == 0)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Phone Format!!! Pls follow either one of the formats:\n01X-XXXXXXX for 1st X being (2-9) or \n011-XXXXXXXX","Error Message", JOptionPane.ERROR_MESSAGE);
                }


            
                //Validation for email
                int togemail = 1;

                String[] em = {"^[a-zA-Z0-9]{3,30}(@outlook.com)$", "^[a-zA-Z0-9]{3,30}(@gmail.com)$",
                               "^[a-zA-Z0-9]{3,30}(@yahoo.com)$", "^[a-zA-Z0-9]{3,30}(@hotmail.com)$"};
                for (String j : em)
                {
                    Pattern pa = Pattern.compile(j);
                    Matcher mat = pa.matcher(EmailAddress);

                    if(mat.find())
                    {
                        togemail = 1;
                        break;
                    }
                    else
                    {
                        togemail = 0;
                    }

                }
                if(togemail == 0)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Email Format!!! Only Accept lower case, upper case and numbers, min 3 max 30 which followed by \n@outlook.com or @gmail.com or @yahoo.com or @hotmail.com","Error Message", JOptionPane.ERROR_MESSAGE);
                }
                
                
                //Validation for houseaddress
                int toghouse = 1;

                String housepattern = "^[a-zA-Z0-9 ]{2,200}$";

                Pattern housepat = Pattern.compile(housepattern);

                Matcher housemat = housepat.matcher(HomeAddress);

                if(!housemat.find() || HomeAddress == "")
                {
                    JOptionPane.showMessageDialog(null, "Incorrect House Address Format!!! Only Accept lower case, upper case, numbers and space, min 2 max 200","Error Message", JOptionPane.ERROR_MESSAGE);
                    toghouse = 0;
                }
                
                if((togpass == 1) && (togphone == 1) && (togemail == 1) && (toghouse == 1))
                {
                    int dialogResult = JOptionPane.showConfirmDialog (null, "Do you wish to save changes made?","Confirmation",JOptionPane.YES_NO_OPTION);
                    if(dialogResult == JOptionPane.YES_OPTION)  //if chosen yes
                    {
                        try
                        {
                            ArrayList <String> tempArray = new ArrayList<>();   //create arraylist tempArray
                            BufferedReader myfile = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));

                            String [] lineArr;
                            String line;

                            while((line = myfile.readLine())!=null)
                            {
                                lineArr = line.split(" , ");
                                if(lineArr[0].equals(FullName)) //if first column equals to FullName
                                {
                                    tempArray.add(FullName + " , " + Password + " , " + ICPassport + " , " + PhoneNumber + " , " + EmailAddress + " , " + HomeAddress + " , " + Peoplehere + " , " + HealthStatus);
                                }           //tempArray stores the respective value (line)

                                else
                                {
                                    tempArray.add(line);    //stores line
                                }
                            }

                            PrintWriter pw = new PrintWriter("HorizontalPatientInfo.txt");  //open file for writing

                            for(String str : tempArray)     
                            {
                                pw.println(str);    
                            }
                            JOptionPane.showMessageDialog(null, "Modification made successfully!!!");
                            pw.close();

                            myfile.close();
                        }

                        catch(IOException e)
                        {
                            e.printStackTrace();
                        }  
                    }
                    else    //if chosen no
                    {
                        JOptionPane.showMessageDialog(null, "Modification made not saved!!!");
                    }
                }          
    }
    

    public void modifyvaccinationstatus()
    {
        try
        {
            int togglevac = 1;
            
            String initialhealth = "Not Vaccinated";    //set initialhealth as Not Vaccinated
            BufferedReader myfile = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));    //read file
            String [] lineArr;
            String line;
            
            while((line = myfile.readLine())!=null)
            {
                lineArr = line.split(" , ");
                if(lineArr[7].equals(initialhealth)) //if first column equals to FullName and eighth column equals to Not Vaccinated
                {
                    togglevac = 1;
                    break;
                }
                else
                {
                    togglevac = 0;
                }
            }
            myfile.close();
             
            if(togglevac == 1)  //if doesn't meet condition
            {
                try
                {   
                    int togglecheckfile = 1;
                    BufferedReader myfiles = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));   //read file
                    String [] lineArrs;
                    String lines;

                    while((lines = myfiles.readLine())!=null)
                    {
                        lineArrs = lines.split(" , ");
                        String patientname = lineArrs[0];
                        if(lineArrs[0].equals(patientname))    //if first column equals to FullName
                        {
                            try
                            {
                                BufferedReader myfiless = new BufferedReader(new FileReader("Appointmentdata.txt"));    //read different file
                                String [] lineArrss;
                                String liness;

                                while((liness = myfiless.readLine())!=null)
                                {
                                    lineArrss = liness.split(" , ");
                                    if(lineArrss[0].equals(patientname))       //if first column equals to FullName (to check for patient who has registered for both programme and appointment)
                                    {
                                        String passingdate = lineArrss[2];  //passingdate stores 3rd column (date)
                                        togglecheckfile = 1;    
                                        LocalDate mas = LocalDate.now();    //mas stores the local date
                                        LocalDate endDate = LocalDate.parse(passingdate);           //String passingdate is converted to date datatype and stores as endDate

                                        long daydifference = ChronoUnit.DAYS.between(mas, endDate); //Find difference in days between mas and endDate (endDate - mas)
                                        
                                        if(daydifference < 0)      //if difference is equal or greater than 0
                                        {
                                                try
                                                {
                                                    ArrayList <String> tempArray = new ArrayList<>();   //create arraylist tempArray
                                                    BufferedReader br = new BufferedReader(new FileReader("HorizontalPatientInfo.txt"));    //Read file

                                                    String [] Arr;
                                                    String lin;
                                                    initialhealth = "Vaccinated";    //set HealthStatus to Vaccinated
                                                    while((lin = br.readLine())!=null)
                                                    {
                                                        Arr = lin.split(" , ");
                                                        if(Arr[0].equals(patientname)) //if first column equals to FullName
                                                        {
                                                            tempArray.add(patientname + " , " + Arr[1] + " , " + Arr[2] + " , " + Arr[3] + " , " + Arr[4] + " , " + Arr[5] + " , " + Arr[6] + " , " + initialhealth);
                                                        }

                                                        else
                                                        {
                                                            tempArray.add(lin);
                                                        }
                                                    }

                                                    PrintWriter pw = new PrintWriter("HorizontalPatientInfo.txt");

                                                    for(String str : tempArray)
                                                    {
                                                        pw.println(str);
                                                    }
                                                    
                                                    pw.close();

                                                    myfile.close();
                                                    
                                                    break;  //break from loop as only one row will be found
                                                }

                                                catch(IOException e)
                                                {
                                                    e.printStackTrace();
                                                }  

                                        }
                                        
                                    }

                                }
                                myfiless.close();
                                
                            }
                            catch(IOException e)
                            {
                                e.printStackTrace();
                            }
                        }
 
                    }
                    myfiles.close();

                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}


