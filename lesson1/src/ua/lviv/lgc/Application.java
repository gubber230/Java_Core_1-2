package ua.lviv.lgc;

public class Application {
	public static void main(String[] args) {
		char c='c';
		boolean b1= true, b2 = false;
		System.out.println("Byte =" + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
		System.out.println("Short =" + Short.MAX_VALUE + " " + Short.MIN_VALUE);
		System.out.println("Integer =" + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		System.out.println("Long =" + Long.MAX_VALUE + " " + Long.MIN_VALUE);
		System.out.println("Float =" + Float.MAX_VALUE + " " + Float.MIN_VALUE);
		System.out.println("Double =" + Double.MAX_VALUE + " " + Double.MIN_VALUE);
		System.out.println(c);
		System.out.println(b1 + " " + b2);
		
		int[] num = {1,-2,3,14,-5,6,-7,8,9,1};
		
		int smallest = 0;
        int largest = 0;

        for(int i = 1; i < num.length; i++) {
            if(num[i] > largest) {
                largest = num[i];
            } else if (num[i] < smallest) {
                smallest = num[i];
            }
        }

        System.out.println("Найбільше : " + largest);
        System.out.println("Найменше : " + smallest);
        
        // test
        
        //test
        
        
        //last test
	}
}
