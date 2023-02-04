package class17.hm;

public class Coffee1 {
    String type;
    String size;
    int price;

    Coffee1(){

    }
    Coffee1(String myType, String mySize, int myPrice) {
        type=myType;
        size=mySize;
        price=myPrice;
    }

    void printInfo () {
        System.out.println("This coffee is "+type+" and the size is "+size+" and costs "+price+"$");
    }
}
