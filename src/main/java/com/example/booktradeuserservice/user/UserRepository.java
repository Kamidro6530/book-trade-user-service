package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserId;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface UserRepository extends JpaRepository<User, UserId> {

    @Modifying
    @Query("update User u set u.isCollectionPrivate = ?1 where u.id = ?2")
    UserId changeUserCollectionPrivateStatus(boolean status,UserId userId);

    @Query("SELECT u.isCollectionPrivate FROM User u WHERE u.id = ?1")
    boolean findCollectionPrivateStatusByUserId(UserId userId);

    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.id = ?1 AND u.email = ?2 AND u.nickname = ?3")
    boolean existsByIdAndEmailAndNickname(UserId id, String email, String nickname);
}
