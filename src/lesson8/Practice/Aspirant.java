package lesson8.Practice;


public class Aspirant extends Student{
    private  String scienceWork;

    public Aspirant(String firstNme, String lastName, String group, double averageMark, String scienceWork) {
        super(firstNme, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }
    int sum;
    public int getScholarship(){
        if (getAverageMark()==5){
            sum=200;
            System.out.println(getFirstNme()+getLastName()+" получает " +sum);
        }
        else {
            sum=180;
            System.out.println(getFirstNme()+getLastName()+" получает "+sum);
        }
        return  sum;
    }

    public static void main(String[] args) {

        Student student= new Student("Ivan","Petrov","first", 4);
        Aspirant aspirant1= new Aspirant("Paul","Button", "second", 5, "Math");
        Student aspirant2= new Aspirant("Jack","Bud", "second", 4, "Physics");
        System.out.println(student.getFirstNme()+" "+ student.getLastName()+" "+ student.getGroup()+" "+ student.getAverageMark());
        System.out.println(aspirant1.getFirstNme()+" "+ aspirant1.getLastName()+" "+aspirant1.getGroup()+" "+aspirant1.getAverageMark()+" "+aspirant1.getScienceWork());
        System.out.println(aspirant2.getFirstNme()+" "+ aspirant2.getLastName()+" "+aspirant2.getGroup()+" "+aspirant2.getAverageMark());
        Student[] students= {student,aspirant1,aspirant2};
        for (Student st:students) {
            st.getScholarship();

        }

    }
}
