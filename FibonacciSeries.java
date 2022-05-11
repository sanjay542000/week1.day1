package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0,b=1,range=5;
     System.out.println(a);
     System.out.println(b);
     for(int i=1;i<=range;i++) {
    	 int val=a+b;
    	System.out.println(val);
    	 a=b;
    	 b=val;
    	
     }
	}

}
