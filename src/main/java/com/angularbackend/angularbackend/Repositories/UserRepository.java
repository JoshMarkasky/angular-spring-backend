package com.angularbackend.angularbackend.Repositories;

import com.angularbackend.angularbackend.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
