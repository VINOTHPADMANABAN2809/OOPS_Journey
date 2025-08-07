abstract class library{
    String Book_holder_name;
    int Card_no;
    String City;
    String Book_name;
    int Book_no;

    library(String Book_holder_name, int Card_no,String City, String Book_name,int Book_no){
        this.Book_holder_name = Book_holder_name;
        this.Card_no=Card_no;
        this.City=City;
        this.Book_name=Book_name;
        this.Book_no=Book_no;
    }

    public String getbook_holder_name(){
        return Book_holder_name;
    }

    public void setbook_holder_name(String Book_holder_name){
        this.Book_holder_name=Book_holder_name;
    }

    public int getCard_no(){
        return Card_no;
    }

    public void setCard_no(int Card_no){
        this.Card_no=Card_no;
    }

    public String getBook_holder_name(){
        return Book_holder_name;
    }

    public void setBook_holder_name(String Book_holder_name){
        this.Book_holder_name=Book_holder_name;
    }

    public String getcity(){
        return City;
    }       

    public void Setcity(String  City){
        this.City=City;
    }

    public String getbook_name(){
        return Book_name;
    }

    public void setbook_name(String Book_name){
        this.Book_name=Book_name;
    }

    public int getbook_no(){
        return Book_no;
    }

    public void setbook_no(int Book_no){
        this.Book_no=Book_no;
    }

    public void display(){
    System.out.println("Book_holder_name: "+getbook_holder_name());
    System.out.println("Book_holder_name: "+getCard_no());
    System.out.println("Book_holder_name: "+getcity());
    System.out.println("Book_holder_name: "+getbook_name());
    System.out.println("Book_holder_name: "+getbook_no());
}
    
}



class Library_member extends library{
    public Library_member(String Book_holder_name, int Card_no,String City, String Book_name,int Book_no){
        super(Book_holder_name,Card_no,City,Book_name,Book_no);
    }
}

    





public class Library_Example {
    public static void main(String[] vk){
        Library_member ls = new Library_member("Vinoth Kumar M P",3262,"Tirpuur","Agni Chiragugal",566);
        ls.display();
    }
}
