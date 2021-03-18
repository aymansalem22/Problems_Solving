
package level1;


public class Hoursremind {

    public static void main(String[] args) {
      int seconds=20000;
      int minutes=seconds/60;
      int hours=minutes/60;
      minutes%=60;
      /*
       minutes%=60;--> equal::
      int minInHours=hours*60;
      minutes-=minInHours;
      
       seconds%=60;-->equal:
      int secInhours=hours*60*60+minutes*60;
      seconds-=minInHours;
      */
      seconds%=60;
      
        System.out.println(hours+":"+minutes+":"+seconds);
        
    }
    
}
