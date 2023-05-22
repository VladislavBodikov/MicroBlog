package ru.bodikov.microblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.bodikov.microblog.domain.UserAccount;

@Repository
public interface UserAccountRepository extends MongoRepository<UserAccount, Long> {

}
