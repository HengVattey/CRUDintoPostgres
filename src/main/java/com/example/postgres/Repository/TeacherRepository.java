package com.example.postgres.Repository;
import com.example.postgres.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
