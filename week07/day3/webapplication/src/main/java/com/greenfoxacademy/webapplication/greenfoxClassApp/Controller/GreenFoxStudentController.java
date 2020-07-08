package com.greenfoxacademy.webapplication.greenfoxClassApp.Controller;

import com.greenfoxacademy.webapplication.greenfoxClassApp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxStudentController {

  private StudentService studentService;

  @Autowired
  public GreenFoxStudentController(
      StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String main(){
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String getStudents(Model model){
    model.addAttribute("name", studentService.findAll());
    return "list";
  }

  @GetMapping("gfa/add")
  public String addStudent(){
    return "add";
  }

  @PostMapping("gfa/save")
  public String saveStudent(@ModelAttribute String student){
    studentService.save(student);
    return "redirect:/gfa/list";
  }

}
