package automatic_testing.unit_test;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if(number < 0)
            return  -number;
        return number;
    }
}
