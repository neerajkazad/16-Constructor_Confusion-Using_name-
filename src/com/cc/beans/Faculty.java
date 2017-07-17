package com.cc.beans;

import java.beans.ConstructorProperties;

public class Faculty {
	private int facultyId;
	private String name;
	private String subject;

	@ConstructorProperties({"facultyId", "name", "subject"})
	public Faculty(int facultyId, String name, String subject) {
		this.facultyId = facultyId;
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", name=" + name + ", subject=" + subject + "]";
	}

}
