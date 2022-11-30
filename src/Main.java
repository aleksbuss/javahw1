public class Main {
    public static void main(String[] args) {
//        print(10, 15);
//        print(13, 17);
//        printDouble(12.5, 35.4);
//        System.out.println(sum(12, 5));
//        System.out.println(sub(11, 5));

//        Car car = new Car(10000, 200, "VW");
//
//        System.out.println("price = " + car.getPrice() + " speed = " + car.getSpeed() + " brand = " + car.getBrand());
//
//        car.setPrice(15000);
//
//        System.out.println("price = " + car.getPrice() + " speed = " + car.getSpeed() + " brand = " + car.getBrand());
//
//        car.printOut();
//
//        Car car1 = new Car(20000, 300, "FORD");
//
//        car1.printOut();

        System.out.println(sum(5,5));
        text(10,20);


        Book book= new Book(2000, 30, "Herr");
        System.out.println("price = " + book.getPrice() + " pages = " + book.getPages() + " name = " + book.getName());
        book.setPrice(3000);
        book.setName("Buss");
        book.printOut();












    }

//    static void print(int a, int b){
//        System.out.println("a = " + a + " b = " + b);
//    }
//
//    static void printDouble(double a, double b) {
//        System.out.println("a = " + a + " b = " + b);
//    }
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sub(int a,int b){
//        return a-b;
//    }

    static int sum(int a, int b){
        return a + b;
    }
    static void text(int a, int b){
        System.out.println("a = " + a + " b = " + b);
    }

}