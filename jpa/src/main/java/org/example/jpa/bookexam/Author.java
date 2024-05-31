package org.example.jpa.bookexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
@Getter @Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)    // 실존하지 않으므로 mappedBy 가필요. Book 엔티티의 어떤 필드와 연관되어있는지
    private List<Book> books = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }


}
