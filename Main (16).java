/*
A-4: Clock Angle
Write a function to print the angle between hour hand and minute hand in an analog clock at any given time. Please print the lesser of the angles.

c
Copy
Edit
int getAngle(int hh, int mm) {
    // TODO:
}
Note:

hh value can be between 1 to 12

mm value can be between 0 to 59

Example
Input: 6, 00 Output: 180
Input: 5, 30 Output: 15
*/

/*   my code logic */


import java.util.Scanner; 

class check{
    void calculateangle(int hh,int mm){
       double h=hh;
       double m=mm;
       double k=m*0.5;
       
       m=m*6;
       h=h*30;
       h=h+k;
       
k=m-h;
k=Math.abs(k);
int value = (int)k;
        System.out.println(value);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hh= sc.nextInt();
		int mm= sc.nextInt();
		check ch = new check();
		ch.calculateangle(hh,mm);
		
	}
}

/* optimized logic */
void calculateangle(int hh, int mm){
    if (hh < 0 || hh > 12 || mm < 0 || mm >= 60) {
        throw new IllegalArgumentException("Invalid time input");
    }

    if (hh == 12) hh = 0;

    double h = hh;
    double m = mm;
    double k = m * 0.5;

    m = m * 6;
    h = h * 30;
    h = h + k;

    k = m - h;
    k = Math.abs(k);
    k = Math.min(k, 360 - k);

    int value = (int) k;
    System.out.println(value);
}

