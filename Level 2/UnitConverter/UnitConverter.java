
public class UnitConverter {
    public static String convert(String[] args) {
        if (args.length!=3){
            return "ERROR";
        }
        String a= args[0];
        String b= args[1];
        double res ;
        
        try{
            double x = Double.parseDouble(args[2]);

            if (a.equals("fahrenheit")&&b.equals("celsius")){
                res = (x-32)*5/9;
            }else if (a.equals("celsius")&&b.equals("fahrenheit")){
                res= x*9/5+32;
            }else if (a.equals("kilometers")&&b.equals("miles")){
                res= x*0.621371;
            }else if (a.equals("miles")&&b.equals("kilometers")){
                res= x*1.60934;
            }else if (a.equals("pounds")&&b.equals("kilograms")){
                res=x*0.45359237;
            }else{
                return "ERROR";
            }
        }catch (Exception e){
            return "ERROR";
        }
        return String.format("%.2f",res);
    }
}
