package debugging;

class Person {
	private String name;
	private int age;
	

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Oliver");
		person.setAge(26);
		System.out.println("My name is " + person.getName());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
