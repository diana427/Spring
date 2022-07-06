package com.example.demoTwo;

import com.example.demoTwo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
@RestController
public class DemoTwoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoTwoApplication.class, args);
	}

	@GetMapping
	public List<Student> getStudents() {
		return List.of(
				new Student(1L, "Mariam", "mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 24))
		);
	}

}
