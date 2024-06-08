package Project43;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10.0; 
        double y = 5.0;  
        double z = 3.0;  

        // a. a = (√(x^5) - 6) / 4
        double a = (Math.sqrt(Math.pow(x, 5)) - 6) / 4;

        // b. b = x^y - 6^x
        double b = Math.pow(x, y) - Math.pow(6, x);

        // c. c = 4 * cos(z / 5) - sin(x^2)
        double c = 4 * Math.cos(z / 5) - Math.sin(Math.pow(x, 2));

        // d. d = x^4 - √(6x - x^3)
        double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(x, 3));

        // e. e = 1 / (y - 1 / (x - 2^y))
        double e = 1 / (y - 1 / (x - Math.pow(2, y)));

//        // f. f = 7 * (cos(Math.sqrt(5 - Math.sin(3 * x - 4))))
//        double f = 7 * (Math.cos(Math.sqrt(5 - Math.sin(3 * x - 4)));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
//        System.out.println("f = " + f);
	}

}
