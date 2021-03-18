
package level1;


public class Hours {


    public static void main(String[] args) {
        int seconds = 20000;//5 33 20..5*60*60 + 33*60 +20
        int minutes = seconds /60;//333.333
        int hours = minutes / 60; //5.555
        int minInHours = hours * 60; 
        minutes = minutes - minInHours; 
        int secInHours = hours * 60 * 60 + minutes * 60;
        seconds = seconds - secInHours;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        
    }
    
}
