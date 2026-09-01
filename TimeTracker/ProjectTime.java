import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    public ProjectTime(String start, String end){
        this.startTime=start;
        this.endTime=end;
        updateHoursLogged();
    };

    public void setStartTime(String start){
        this.startTime=start;
        updateHoursLogged();

    };
    public void setEndTime(String end){
        this.endTime =end;
        updateHoursLogged();

    };

    public String getStartTime(){
        return this.startTime;
    };
    public String getEndTime(){
        return this.endTime;
    };

    public String getHoursLogged(){
        if(hoursLogged==-1){
            return "-1";
        }
        if (hoursLogged<120){
            return (int)(hoursLogged)+" m";
        }
        if (hoursLogged<120*60){
            return (int)(hoursLogged/60)+" h";
        }
        if (hoursLogged<120*24*60){
            return (int)(hoursLogged/(24*60))+" d";
        }
        return (int)(hoursLogged/(30*24*60))+" mo";
    };

    private void updateHoursLogged(){
        try{
            Date start = DATE_FORMAT.parse(startTime);
            Date end = DATE_FORMAT.parse(endTime);

            long differ=end.getTime()-start.getTime();

            if(differ<0){
                this.hoursLogged=-1;
                return;
            }
            hoursLogged=differ/(1000f*60);
        }catch(ParseException e){
            hoursLogged=-1;

        }
    }
}
