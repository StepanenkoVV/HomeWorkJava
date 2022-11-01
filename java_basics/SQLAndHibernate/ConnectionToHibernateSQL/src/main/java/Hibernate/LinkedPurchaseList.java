package Hibernate;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LinkedPurchaseList")
@Data
public class LinkedPurchaseList {

    @EmbeddedId
    private LinkedPurchaseListKey purchaseKey;


    @Column(name = "student_id", insertable = false, updatable = false)
    private Integer studentId;
    @Column(name = "course_id", insertable = false, updatable = false)
    private Integer courseId;

    public LinkedPurchaseList() {
    }

    public LinkedPurchaseList(Student student, Course course) {
        this.purchaseKey = new LinkedPurchaseListKey(student.getId(), course.getId());


    }

    public LinkedPurchaseListKey getPurchaseKey() {
        return purchaseKey;
    }

    public void setPurchaseKey(LinkedPurchaseListKey purchaseKey) {
        this.purchaseKey = purchaseKey;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }


}
