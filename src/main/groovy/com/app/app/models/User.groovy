package com.app.app.models

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
@Document(value = "users")
public class User {
    @Id
    private long id

    @Indexed(unique = true)
    private String username
    private String password
    @Indexed(unique = true)
    private String email
    private String firstName
    private String lastName

}