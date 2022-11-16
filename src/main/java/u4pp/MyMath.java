package u4pp;

public class MyMath {
    public static int abs(int x){
        if(x==0 || x>0){
            return x;
        }else{
            x = x*-1;
        }
        return x;
    }

    static double abs(double x){
        if(x==0.0 || x>0.0){
            return x;
        }else{
            x = x*-1.0;
        }
        return x;
    }

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
