public class Book {
    private int price;
    private double pages;
    private String name;

    public Book(int price, double pages, String name) {
        this.price = price;
        this.pages = pages;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPages() {
        return pages;
    }

    public void setPages(double pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;}

    public void printOut() {System.out.println("price : " + price + " pages : " + pages + " name : " + name);
        };

}


