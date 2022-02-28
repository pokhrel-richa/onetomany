package com.example.onetomany.repository;

import com.example.onetomany.dto.InputResponse;
import com.example.onetomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("SELECT new com.example.onetomany.dto.InputResponse( s.name, p.subjectName) From Student s JOIN s.subjects p")
    public List<InputResponse> getJoinInformation();

}
