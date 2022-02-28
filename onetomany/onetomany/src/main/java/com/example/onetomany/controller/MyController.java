package com.example.onetomany.controller;

import com.example.onetomany.dto.InputRequest;
import com.example.onetomany.dto.InputResponse;
import com.example.onetomany.entity.Student;
import com.example.onetomany.repository.StudentRepository;
import com.example.onetomany.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    @PostMapping("/placeInput")
    public Student placeInput(@RequestBody InputRequest request){
        return studentRepository.save(request.getStudent());
    }
    @GetMapping("/findAllInputs")
    public List<Student> findAllInputs(){
        return studentRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<InputResponse> getJoinInformation(){
        return studentRepository.getJoinInformation();
    }

}
