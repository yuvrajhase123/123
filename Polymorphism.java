class Publication{
    private String title;
    public int qty;
    private double price;
    private int copies;

    public String gettitle(){
        return this.title;
    }
    public void settitle(String title){
        this.title=title;
    }
    public double getprice(){
        return this.price;
    }
    public void setprice(double price){
        this.price=price;
    }
    public int getcopies(){
        return this.copies;
    }
    public void setcopies(int copies){
        this.copies=copies;
    }
    public void sellcopy(int qty){
        System.out.println("total publication sale"+qty*price);
    }

}
class Book extends Publication{
    private String author;

    public int ordercopies(int pcopies){
        return pcopies;
    }
    public void sellcopy(int qty){
        System.out.println("Total Book sales ="+(qty*getprice()));
    }

}
class Magzine extends Publication{
    private int orderqty;
    private String currIssue;
    public void recvIssue(String newIssue){
        setcopies(orderqty);
        currIssue=newIssue;
    }
    public void sellcopy(int qty){
        System.out.println("Total magzine sales ="+(qty*getprice()));
    }


}
class Polymorphism{
    public static void main(String[]args){
        Publication publication=new Publication();
        publication.setcopies(3);
        System.out.println(publication.getcopies());
        publication.setprice(20.6);
        System.out.println(publication.getprice());
        publication.sellcopy(2);


        Book book1=new Book();
        int copy=book1.ordercopies(3);
        System.out.println("Total copies = "+copy);

        Publication book2=new Book();
        book2.setprice(10);
        book2.sellcopy(copy);


        Publication magzine=new Magzine();
        magzine.setprice(30);
        magzine.sellcopy(5);
    }
}