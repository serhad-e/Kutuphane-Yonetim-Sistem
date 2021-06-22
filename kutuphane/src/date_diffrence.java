
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serhad
 */
class date_diffrence {
     public  int findDifference(String start_date,
                   String end_date)
    {
         int day = 0;
  
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd.MM.yyyy");
  
        // Try Block
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            // Calucalte time difference
            // in milliseconds
            long difference_In_Time
                = d2.getTime() - d1.getTime();
  
            // Calucalte time difference in
            // seconds, minutes, hours, years,
            // and days
           
  
            long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
  
            long difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365;
  
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
  
           
            
             day = Integer.parseInt(String.valueOf(difference_In_Days));
            
  
         
        }
  
       
        
        catch(Exception e) {
        e.printStackTrace();
        
        
        }
         return day;
    }
}
