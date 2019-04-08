package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> studentsEnrolled;
    private Map<Student,Double> studyMap = new HashMap<Student,Double>();

    public ZipCodeWilmington() {
        this.studentsEnrolled = new ArrayList<>();
    }

    public void enroll(Student student) {
        studentsEnrolled.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if(studentsEnrolled.contains(student)) {
            return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for (Student student:studentsEnrolled) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        for (Student student: studentsEnrolled) {
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
