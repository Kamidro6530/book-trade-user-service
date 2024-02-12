package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.ISBN;
import com.example.booktradeuserservice.user.api.UserId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private UserId id;
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;
    private String password;
    @ElementCollection(targetClass = ISBN.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "books", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "book")
    private List<ISBN> booksCollection;
    private Long rating;
    private boolean isCollectionPrivate;

    public void addBookToTheUserCollection(ISBN isbn){
        booksCollection.add(isbn);
    }


}
