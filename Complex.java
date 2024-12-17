import java.util.Scanner;
class Complex{
	int real,imag;
	Complex(){
		this.real=0;
		this.imag=0;
	}
	Complex(int reral,int imag){
		this.real=real;
		this.imag=imag;
	}
	static void addition(Complex c1,Complex c2){
		Complex c3=new Complex(0,0);
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		System.out.println(c3.real+"+"+c3.imag+"i");
	}
	static void substraction(Complex c1,Complex c2){
		Complex c3=new Complex(0,0);
		c3.real=c1.real-c2.real;
		c3.imag=c1.imag-c2.imag;
		System.out.println(c3.real+"+"+c3.imag+"i");
	}
	static void multiplication(Complex c1,Complex c2){
		Complex c3=new Complex(0,0);
		c3.real=(c1.real*c2.real)-(c1.imag*c2.imag);
		c3.imag=(c1.imag*c2.real)+(c1.real*c2.imag);
		System.out.println(c3.real+"+"+c3.imag+"i");
	}
	static void division(Complex c1,Complex c2){
		Complex c3=new Complex(0,0);
		c3.real=(c1.real*c2.real+c1.imag*c2.imag)/(c2.real*c2.real+c2.imag*c2.imag);
		c3.imag=(c1.imag*c2.real-c1.real*c2.imag)/(c2.real*c2.real+c2.imag*c2.imag);
		System.out.println(c3.real+"+"+c3.imag+"i");
	}
	public static void main(String[]args){
		int choice;
		Complex c1=new Complex(10,20);
		Complex c2=new Complex(5,10);
		System.out.println("Enter Your Choice : ");
		System.out.println("1.Addition  2.Substraction  3.Multiplication  4.Division");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice){
			case 1:addition(c1,c2);
				break;
			case 2:substraction(c1,c2);
				break;
			case 3:multiplication(c1,c2);
				break;
			case 4:division(c1,c2);
				break;
		}
	}
}





