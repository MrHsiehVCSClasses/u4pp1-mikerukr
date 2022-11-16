package u4pp;

public class LeapYear {
        public static boolean isLeapYear(int year){
            boolean output = false;
            if(year<1582){
                return output;
            }
            if (year>1852){
                if(year%4==0){
                    if(year%100==0){
                        if(year%400==0){
                            output = true;
                        }else{
                            output = false;
                        }
                    }else{
                        output = true;
                    }
                }
            }
            /*if(year>1582){
                if(year%400==0 && year%100==0){
                    output = true;
                }else{
                    output = false;
                }
                if(year%4==0){
                    year = year /100;
                    if(year%4==0){
                        output = true;
                    }
                }else{
                    output = false;
                }
            }*/
            return output;
        }
}
