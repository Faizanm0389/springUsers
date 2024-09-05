package com.example.myProj.Repository;



import com.example.myProj.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Custom query method to find name by ID
    String findNameById(int id);
}

