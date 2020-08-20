package com.simpleapi.simpleapi;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class APIController {

    ArrayList<Student> students = new ArrayList<>();

    @GetMapping("/hi")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping(path = "/getstudents", produces = "application/json")
    @ResponseBody
    public ArrayList<Student> getStudents() {
        return students;
    }

    @PostMapping(path = "/addstudent", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Response postStudent(@RequestBody Student student) {

        students.add(student);
        return new Response("Success!");
    }
}
