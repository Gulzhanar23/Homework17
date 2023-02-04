package class17.hm;

public class Task4 {
//4)Write program that have static constructor and observe result.

    String city;
    int population;
    boolean clean;

    /*static Task4 (String myCity, int myPopulation, boolean myClean){
        city=myCity;
        population=myPopulation;
        clean=myClean;
    }*/
    //gives error because of static keyword

    void printInfo(){
        System.out.println(city+" has "+population+" people, and city is "+clean);
    }
}
