package u4pp;

public class LeapYear {
    // if the year is below 1852 it will return false
    // if the year is above 1582 it will first divide it by 4, then 100, then 400, it all works it returns true, else it returns false.
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
