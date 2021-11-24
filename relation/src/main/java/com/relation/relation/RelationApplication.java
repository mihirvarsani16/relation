package com.relation.relation;

import java.util.Arrays;
import java.util.List;

import com.relation.relation.entity.manytomany.Employee;
import com.relation.relation.entity.manytomany.Project;
import com.relation.relation.repository.manytomany.EmployeeRepository;
import com.relation.relation.repository.manytomany.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelationApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ProjectRepository projectRepository;

	public static void main(String[] args) {

		SpringApplication.run(RelationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// Employee e1 = new Employee();
		// Employee e2 = new Employee();

		// e1.setEid(1);
		// e1.setName("mihir");

		// e2.setEid(2);
		// e2.setName("salu");

		// Project p1 = new Project();
		// Project p2 = new Project();

		// p1.setPid(5);
		// p1.setName("employee manegment");

		// p2.setPid(6);
		// p2.setName("e-learning");

		// List<Employee> list1 = new ArrayList<Employee>();
		// List<Project> list2 = new ArrayList<Project>();

		// list1.add(e1);
		// list1.add(e2);

		// list2.add(p1);
		// list2.add(p2);

		// // e1.setProject(list2);
		// p2.setEmployee(list1);

		// this.employeeRepository.save(e1);
		// this.employeeRepository.save(e2);
		// this.projectRepository.save(p1);
		// this.projectRepository.save(p2);

		display();

	}

	private void display() {

		Project p1 = new Project("e-learning");
		Project p2 = new Project("manegment");
		List<Project> p = Arrays.asList(p1, p2);

		Employee e1 = new Employee("mihir");
		Employee e2 = new Employee("raju");

		List<Employee> e = Arrays.asList(e1, e2);

		employeeRepository.saveAll(e);

		// e1.setProject(p);
		// e2.setProject(p);

		p1.projectemployee(e1);
		p2.projectemployee(e2);
		p2.projectemployee(e1);

		projectRepository.saveAll(p);

	}

}
