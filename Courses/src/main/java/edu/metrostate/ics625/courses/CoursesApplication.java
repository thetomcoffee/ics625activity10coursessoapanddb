package edu.metrostate.ics625.courses;

import edu.metrostate.ics625.courses.entity.Course;
import edu.metrostate.ics625.courses.entity.CourseRepo;
import edu.metrostate.ics625.courses.entity.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
            ConfigurableApplicationContext ctx = 	
                SpringApplication.run(CoursesApplication.class, args);
            /*
            StudentService service =  ctx.getBean(StudentService.class);
            service.add("Lisa Simpson", "list@gmail.com");
            service.getAll();
*/
	}

}





