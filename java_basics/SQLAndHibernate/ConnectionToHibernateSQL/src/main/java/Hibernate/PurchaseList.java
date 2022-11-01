package Hibernate;

import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PurchaseList")
@Data
public class PurchaseList {

    @EmbeddedId
    private PurchaseListKey id;

    @JoinColumn(name = "student_name", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @JoinColumn(name = "course_name", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;


    @Column(name = "student_name", updatable = false, insertable = false)
    private String studentName;

    @Column(name = "course_name", updatable = false, insertable = false, columnDefinition = "VARCHAR")
    private String courseName;

    @Column(name = "price")
    private Integer price;

    @Column(name = "subscription_date")
    private Date subscriptionDate;

}
