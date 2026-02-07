package ie.atu.collections;

public class Book {
    private String title;
    private int price;
    private String author;

    //constructor
    public Book(String title, int price, String author){
        this.title = title;
        this.price = price;
        this.author = author;
    }
    //getters
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    public String getAuthor(){
        return author;
    }

    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    //override tostring
    @Override 
    public String toString(){
        return "Book{title='" + title + "', price=" + price + ", author=" + author+"}";
    }
    //override equals
    @Override 
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }
}
