package programme_24_method_overriding;
/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */
public class Test {
    public static void main(String[] args) {
        AXIS a=new AXIS();
        ICICI i=new ICICI();
        SBI s=new SBI();
        System.out.println("SBI  rate of interest:"+s.grtRateOfIntrest());
        System.out.println("ICICI rate of interest:"+i.getRateOfIntrest());
        System.out.println("Axis rate of interest:"+a.getRateOfIntrest());

        }

    }

