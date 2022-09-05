package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TeacherRepo;
import com.example.demo.model.*;

@Service

public class TeacherService {

 @Autowired

 TeacherRepo teacherRepository;

 public String saveTeacher(Teacher teacher) {

	 teacherRepository.save(teacher);

 return "Teacher Information saved Successfully";

 }

 public List<Teacher> getTeacher(){

 return teacherRepository.findAll();

 }

 public Teacher updateTeacher(int id) {

 return teacherRepository.getOne(id);

 }

 public void deleteTeacher(int id) {

	 teacherRepository.deleteById(id);

 }

}




