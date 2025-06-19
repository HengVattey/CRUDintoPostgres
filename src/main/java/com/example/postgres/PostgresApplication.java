package com.example.postgres;

import com.example.postgres.Entity.Teacher;
import com.example.postgres.Repository.TeacherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "api/v1")
@SpringBootApplication
public class PostgresApplication {
private TeacherRepository teacherRepository;


    public static void main(String[] args) {
        SpringApplication.run(PostgresApplication.class, args);
    }
//Add data to database
    PostgresApplication(TeacherRepository teacherRepository) {
        //List<Teacher> teachers = new ArrayList<>();
       // teachers=getTeachers();
       //teacherRepository.saveAll(teachers);

        this.teacherRepository = teacherRepository;
      //  teacherRepository.save(addTeacher(new Teacher()));

    }
    @GetMapping
    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers=teacherRepository.findAll();
        return teachers;
    }
    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        teacherRepository.save(teacher);
        return teacher;
    }

    @GetMapping("/{Id}")
    public Teacher SearchTeacherById(@PathVariable("Id") Integer id) {

        return teacherRepository.findById(id).get();

    }

    @PutMapping("/{Id}")
    public Teacher updateTeacher(@PathVariable("Id") Integer id, @RequestBody Teacher teacher) {
        teacher.setId(id);
        teacherRepository.save(teacher);
        return teacher;
    }
   @DeleteMapping("/{Id}")
    public void deleteTeacher(@PathVariable("Id") Integer id) {
        teacherRepository.deleteById(id);
   }

//    @PatchMapping("{Id}")
//    public Teacher patchTeacher(@PathVariable("Id") Integer id, @RequestBody Teacher teacher) {
//        teacher.setId(id);
//        teacherRepository.save(teacher);
//        return teacher;
//    }



}
