package com.jepark.compareExam;

public class Robot {
	
	private String name;
	private String no;
	private int age;
	
	/**
	 * @param name
	 * @param no
	 * @param age
	 */
	public Robot(String name, String no, int age) {
		super();
		this.name = name;
		this.no = no;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Robot [name=" + name + ", no=" + no + ", age=" + age + "]";
	}
}
