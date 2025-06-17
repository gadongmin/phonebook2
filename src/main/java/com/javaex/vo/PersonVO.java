package com.javaex.vo;

public class PersonVO {
	// 필드
	private int personId;
	private String name;
	private String hp;
	private String campany;

	// 생성자
	public PersonVO() {
	}

	public PersonVO(int personId, String name, String hp, String campany) {
		this.personId = personId;
		this.name = name;
		this.hp = hp;
		this.campany = campany;
	}

	// 메소드 gs
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCampany() {
		return campany;
	}

	public void setCampany(String campany) {
		this.campany = campany;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "PersonVo [personId=" + personId + ", name=" + name + ", hp=" + hp + ", campany=" + campany + "]";
	}
}
