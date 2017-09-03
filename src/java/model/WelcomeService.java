
package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CPerera
 */
public class WelcomeService {
    private Calendar calendar = Calendar.getInstance ();
    Date CurentDate = calendar.getTime();

  
    private final String greetingGenerator(){
        int hour = CurentDate.getHours();
        String msg = "";

        if (hour < 12) {
            msg = "Good Morning!";
        } else if (hour < 16 && !(hour == 12)) {
            msg = "Good Afternoon";
        } else {
            msg = "Good Evening";
        }
    return msg ;
    }

    public String welcomeMessageGenerator(String name) {
        return greetingGenerator() +", " + name + ". Welcome!" ;
        
    }
 
    
    
}
