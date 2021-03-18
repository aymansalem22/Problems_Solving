
package level1;


public class Hoursreminds {

  
    public static void main(String[] args) {
     int watch=110714;//11:7:14
     int seconds=40034;//11*60*60 7*60+14
     int minutes=seconds/60;
     int hours=minutes/60;
     minutes=minutes%60;
     seconds=seconds%60;
     System.out.println(hours+":"+minutes+" : "+seconds);
     
     int watch2=91215;//9:12:15
     int seconds2=33135;//9*60*60=32400 12*60+15 735
     int minutes2=seconds2/60;
     int hours2=minutes2/60;
     minutes2=minutes2%60;
     seconds2=seconds2%60;
        System.out.println(hours2 +": "+minutes2 +": "+seconds2);
     
        
        
    }
    
}
