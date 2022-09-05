package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepo;
import com.example.demo.service.TeacherService;

@RestController

@RequestMapping(value="/teacher")

public class TeacherController {

 @Autowired

 TeacherService teacherService;

 @GetMapping

 public List<Teacher> getEmp(){

 return teacherService.getTeacher();

 }

 @PostMapping

 public void save(@RequestBody Teacher teacher) {

 teacherService.saveTeacher(teacher);

 }

 @PutMapping

 public void updateTeacher(@RequestBody @PathVariable int id, Teacher teacher)

 {

 Teacher e = teacherService.updateTeacher(id);

 e.setName(teacher.getName());

 e.setSalary(teacher.getSalary());

 teacherService.saveTeacher(e);

 }

 @DeleteMapping

 public void deleteEmployee(@PathVariable int id) {

	 teacherService.deleteTeacher(id);

 }

}

