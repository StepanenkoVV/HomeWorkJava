package Hibernate;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Courses")
@Data
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum")
    private CourseType type;

    @Column(name = "description")
    private String description;

    @Column(name = "students_count")
    private int studentsCount;

    @Column(name = "price")
    private int price;

    @Column(name = "price_per_hour")
    private float pricePerHour;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Subscriptions",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @OneToMany(mappedBy = "course")
    private List<Subscription> subscriptions;


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", studentsCount=" + studentsCount +
                ", price=" + price +
                ", pricePerHour=" + pricePerHour +
                ", teacher=" + teacher +
                ", students=" + students +
                ", subscriptions=" + subscriptions +
                '}';
    }
}
