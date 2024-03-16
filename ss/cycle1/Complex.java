import java.util.Scanner;
public class Complex{
	public static void main(String[] args){
		System.out.println("name:sreekanth pradeep\n roll no: 52\n date:13-02-24");
	class ComplexClass{
	int real;
	int img;
		public ComplexClass(int r,int i){
		this.real=r;
		this.img=i;
	  }
	}
	int a,b;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the first complex number");
	System.out.println("real part:");
	a=scan.nextInt();
	System.out.println("imaginery part:");
	b=scan.nextInt();
	ComplexClass first = new ComplexClass(a,b);
	
	System.out.println("enter the second complex number:");
	System.out.println("real part:");
        a=scan.nextInt();
        System.out.println("imaginery part:");
        b=scan.nextInt();
        ComplexClass second = new ComplexClass(a,b);
        
        int real = first.real + second.real;
        int img = first.img + second.img;
        System.out.println("sum of the complex number is:"+real+"+"+img+"i");
        }
        }	
	
