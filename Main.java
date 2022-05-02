public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Selim", "9050000001" , "TRH");
        Teacher t2 = new Teacher("Rasim", "905222222", "FZK");
        Teacher t3 = new Teacher("Ayşe", "905333333", "BIO");
        //t1.PrintTeacher();
        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", t2);
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO", t3);
        biyoloji.addTeacher(t3);

        //tarih.PrintTeacherInfo(tarih);
        Student s1 = new Student("Leyla", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 200, 50);
        //s1.PrintNote();
        s1.IsPass();

        Student s2 = new Student("Necip", "154", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(85, 78, 65);
        s2.IsPass();
    }    
}