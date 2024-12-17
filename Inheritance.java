class Employee{
    protected String emp_name;
    protected String emp_address;
    protected String emp_mailid;
    protected int emp_id;
    protected long emp_mob;
    public void emp_info(String emp_name,String emp_address,String emp_mailid,int emp_id,long emp_mob){
        this.emp_name=emp_name;
        this.emp_address=emp_address;
        this.emp_mailid=emp_mailid;
        this.emp_id=emp_id;
        this.emp_mob=emp_mob;
    }
    public void display(){

    }
    public void Gross_salary(){

    }
    public void Net_salary(){

    }
}
class Programmer extends Employee{
    private double bp;
    public double getbp(){
        return this.bp;
    }
    public void setbp(double bp){
        this.bp=bp;
    }
    public void display(){
        System.out.println("Programmer information :");
        System.out.println("Name :"+emp_name+","+"\nAddress:"+emp_address+","+"\nmail id :"+emp_mailid+","+"\nID Number:"+emp_id+","+"\n Mobile Number: "+emp_mob);
    }
    public void Gross_salary(){
        System.out.println("Gross Salary is :"+(bp+getbp()*97/100+getbp()*12/100+getbp()*10/100));
    }
    public void Net_salary(){
        System.out.println("net Salary is :"+(bp+getbp()*97/100+getbp()*12/100+getbp()*10/100+getbp()*0.1/100));
    }
}
class Inheritance{
    public static void main(String[]args){
        Employee prog1=new Programmer();
        prog1.emp_info("ram","pune","Ram@gmail.com",1,684940694);
        prog1.display();

        Programmer prog2=new Programmer();
        prog2.setbp(9000);
        prog2.Gross_salary();
        prog2.Net_salary();
    }
}   

