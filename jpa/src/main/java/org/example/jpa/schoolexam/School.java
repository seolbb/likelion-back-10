package org.example.jpa.schoolexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "schools")
@Getter @Setter
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)  // 학교 하나에 학생 여러명,orphanRemoval : 고아객체 지울건지
    private List<Student> students = new ArrayList<>();
//    학생리스트는 실존하는 컬럼이 아니므로 mappedBy를 사용하여 Student 엔티티 중 연관된 필드인 school을 적어준다.

    public School(String name) {
        this.name = name;
    }
}
