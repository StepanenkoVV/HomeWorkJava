package Hibernate;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PurchaseListKey implements Serializable {


    @Column(name = "student_name", updatable = false, insertable = false, columnDefinition = "VARCHAR")
    private int studentId;


    @Column(name = "course_name", updatable = false, insertable = false, columnDefinition = "VARCHAR")
    private int courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseListKey that = (PurchaseListKey) o;
        return studentId == that.studentId && courseId == that.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }


}
