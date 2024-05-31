package org.example.jpa.schoolexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter @Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // 자동생성
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToOne  // 학생 여러명에 학교 한개.
    @JoinColumn(name = "school_id")
    private School school;  // 객체의 설계와 관계형 db의 설계가 달라진다.

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
    }
}
