package class17.hm;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1 = new Students ("Gulzhanar",95,95,95);
        Students student2 = new Students ("Aizada",98,99,90);
        Students student3 = new Students ("Nina",70,92,90);
        Students student4 = new Students ("Mark",80,95,65);
        Students student5 = new Students ("Anita",92,76,89);

        student1.average();
        student2.average();
        student3.average();
        student4.average();
        student5.average();
    }

}
