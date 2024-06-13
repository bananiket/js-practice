
class Classroom {
    String standard;
    String division;
    String classTeacher;
    String subject;
    int classStrength;

    Classroom(String standard, String division, String classTeacher, String subject, int classStrength){
        this.standard = standard;
        this.division = division;
        this.classTeacher = classTeacher;
        this.subject = subject;
        this.classStrength = classStrength;

        // System.out.println();
    }

    public void classDetalis(){
        System.out.println("Class " + this.standard + " division: " + this.division + " has strength of " + this.classStrength + ". Its class teaches name is " + this.classTeacher + " and she teaches " + this.subject);
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Classroom a = new Classroom("X", "C", "Padmaja", "Math", 45);
        a.classDetalis();
    }
    
}
