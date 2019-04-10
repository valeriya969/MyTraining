package lesson8.Practice;

public class Student {
    private String firstNme, lastName, group;
    private double averageMark;

    public Student(String firstNme, String lastName, String group, double averageMark) {
        this.firstNme = firstNme;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public String getFirstNme() {
        return firstNme;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setFirstNme(String firstNme) {
        this.firstNme = firstNme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    int sum;
    public int getScholarship(){
        if (averageMark==5){
             sum=100;
            System.out.println(getFirstNme()+getLastName()+" получает " +sum);
        }
        else {
            sum=80;
            System.out.println(getFirstNme()+getLastName()+" получает " +sum);
        }
        return  sum;

}
}

