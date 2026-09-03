import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    //private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    public ProjectTime(String start, String end){
        this.startTime=start;
        this.endTime=end;
        
    };

    public void setStartTime(String start){
        this.startTime=start;

    };
    public void setEndTime(String end){
        this.endTime =end;
    };

    public String getStartTime(){
        return this.startTime;
    };
    public String getEndTime(){
        return this.endTime;
    };

    public String getHoursLogged(){
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        try{
            Date start = DATE_FORMAT.parse(startTime);
            Date end = DATE_FORMAT.parse(endTime);
            long time=end.getTime() - start.getTime();

            if (time<0){
                return "-1";
            }
            int t = (int)(time/60000);
            if (t<120){
                return (int)(t)+" m";

            }else if(t < 120*60){
                return (int)(t/(60))+" h";
            
            }else if(t < 120*60*24){
                return (int)(t/(60*24))+" d";
            
            }else{
                return (int)(t/(60*24*30))+" mo";
            
            }


        }catch(Exception e){
            return "-1";
        }
    };

    
}
