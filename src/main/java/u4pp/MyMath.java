package u4pp;
//returns absolute value by multiplying by negative if it is negative and returns normally if anything else
public class MyMath {
    public static int abs(int x){
        if(x==0 || x>0){
            return x;
        }else{
            x = x*-1;
        }
        return x;
    }
//returns absolute value by multiplying by negative if it is negative and returns normally if anything else
    static double abs(double x){
        if(x==0.0 || x>0.0){
            return x;
        }else{
            x = x*-1.0;
        }
        return x;
    }
//multiplies the parameter by itself based on the number given in exponent variable
    static double pow(double base, int exponent){
        double power = base;
        if(exponent > 0 ){
            for(int i=1; i<exponent;i++){
            power = power * base;
            }}else{
                power = 1;
            }
            return power;
        }
//it will multiply numbers by itself starting at 0 and make its way up by going backwards until it is greater than or equal to the parameter in which case it returns -1 if it is not a perfect number.
    static int perfectSqrt(int x){
        //if(x==0){
        //    return x;
       // }
        int i= 0;
        while(true){
            if(i*i==x){
                return i;
            }else if(i*i>x){
                i = -1;
                return i;
            }
            i++;
            }
        }
    }
