package org.example.springjdbc05;

import lombok.Setter;
import lombok.ToString;

import java.sql.Array;
import java.util.ArrayList;

@ToString
@Setter
public class User {
    private Long id;
    private String name;
    private String email;

    //권한 List..
//    List<Role> roles = new ArrayList<>();
}
