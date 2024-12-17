import java.util.Scanner;
class Exception{
    public static void main (String[] args){
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter first number");
            num1=Integer.parseInt(sc.next());
            System.out.println("Enter second number");
            num2=Integer.parseInt(sc.next());
            num3=num1/num2;
            System.out.println(num1+"/"+num2+":"+num3);
            int arr[]={10,20,30};
            System.out.println("Enter element to be  found");
            int key=sc.nextInt();
            System.out.println(arr[key]);
        }

        
        catch(NumberFormatException e){
            System.out.println("Error: Both no are not valid Integer");
        }
        catch(ArithmeticException e){
            System.out.println("Error: can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of range");
        }
        finally{
            System.out.println("Program Executed succesfully");
        }
    }
}       
    

