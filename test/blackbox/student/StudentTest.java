package blackbox.student;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void setAndCheckName() {
        Student newStudent = new Student();
        newStudent.setName("Soumya Mohapatra");
        assertEquals("Soumya Mohapatra", newStudent.getName());
    }

    @Test
    void setAndCheckRollNumber() {
        Student newStudent = new Student();
        newStudent.setRollNumber("2016UCO1644");
        assertEquals("2016UCO1644", newStudent.getRollNumber());
    }

    @Test
    void setAndCheckAddress() {
        Student newStudent = new Student();
        newStudent.setAddress("D6, Vasant Kunj");
        assertEquals("D6, Vasant Kunj", newStudent.getAddress());
    }

    @Test
    void setAndCheckFatherName() {
        Student newStudent = new Student();
        newStudent.setFatherName("G S Mohapatra");
        assertEquals("G S Mohapatra", newStudent.getFatherName());
    }

    @Test
    void setAndCheckDateOfBirth() {
        Student newStudent = new Student();
        newStudent.setDateOfBirth(new Date(1997,12,1));
        assertEquals(new Date(1997,12,1), newStudent.getDateOfBirth());
    }
}