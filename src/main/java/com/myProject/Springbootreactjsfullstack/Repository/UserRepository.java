package com.myProject.Springbootreactjsfullstack.Repository;

import com.myProject.Springbootreactjsfullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
