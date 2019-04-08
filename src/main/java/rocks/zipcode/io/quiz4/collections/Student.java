package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    public Integer id;
    public Double hoursStudied;

    public Student() {
        this.id = 1;
        this.hoursStudied = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.hoursStudied = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.hoursStudied += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.hoursStudied;
    }
}
