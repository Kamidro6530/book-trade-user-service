package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserId;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

interface UserRepository extends JpaRepository<User, UUID> {

    @Transactional
    @Modifying
    @Query("update User u set u.isCollectionPrivate = ?1 where u.id = ?2")
    UserId changeUserCollectionPrivateStatus(boolean status,UserId userId);

    @Query("SELECT u.isCollectionPrivate FROM User u WHERE u.id = ?1")
    boolean findCollectionPrivateStatusByUserId(UserId userId);
}
