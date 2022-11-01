package Hibernate;

import javax.persistence.*;

import lombok.Data;

import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Subscriptions")
@Data
public class Subscription {

    @EmbeddedId
    private SubscriptionKey id;

    @Column(name = "student_id", insertable = false, updatable = false)
    private int studentId;

    @Column(name = "course_id", insertable = false, updatable = false)
    private int courseId;


    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;


    @Column(name = "subscription_date")
    private Date subscriptionDate;

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.course = course;
    }

}
