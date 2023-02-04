package class17.hm;

public class Students {
    //2)Write a java Class Students that have a constructor which takes students name
    // and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.

    String name;
    int mathGrade;
    int chemistryGrade;
    int historyGrade;

    Students(String studentName, int studentMathGrade, int studentChemistryGrade, int studentHistoryGrade) {
        name = studentName;
        mathGrade = studentMathGrade;
        chemistryGrade = studentChemistryGrade;
        historyGrade = studentHistoryGrade;
    }

    void average() {
        int averageGrade = (mathGrade + chemistryGrade + historyGrade) / 3;
        if (averageGrade >= 90) {
            System.out.println(name + "average mark is A");
        } else if (averageGrade >= 80 && averageGrade < 90) {
            System.out.println(name + "average mark is B");
        } else if (averageGrade >= 70 && averageGrade < 80) {
            System.out.println(name + "average mark is C");
        } else if (averageGrade >= 50 && averageGrade < 70) {
            System.out.println(name + "average mark is D");
        } else {
            System.out.println(name + "average mark is F");
        }
    }
}
