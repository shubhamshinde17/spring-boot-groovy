package com.app.app.repositories

import com.app.app.models.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface UserRepository extends MongoRepository<User, Long>{
    @Query("{email:'?0'}")
    User findByEmail(String email);
}