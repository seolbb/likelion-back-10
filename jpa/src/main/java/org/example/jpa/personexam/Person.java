package org.example.jpa.personexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "persons")
@Getter@Setter
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true) // 연결되는 Passport 엔티티의 상수명
    private Passport passport;

    public Person(String name) {
        this.name = name;
    }
}
