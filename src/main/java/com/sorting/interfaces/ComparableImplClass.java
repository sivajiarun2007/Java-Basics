package com.sorting.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student stud) {
		return this.age > stud.age ? -1 : 1;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}

public class ComparableImplClass {

	public static void main(String[] args) {
		Student s1 = new Student(3, "A");
		Student s2 = new Student(1, "B");
		Student s3 = new Student(2, "C");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		Collections.sort(students, (x,y) -> x.age > y.age ? 1 : -1);
		
		System.out.println(students);
		
		
		

	}

}
