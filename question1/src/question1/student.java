package question1;

public class student {
	private String name;
	private int age;
	
	public void setAge(int age) throws AgeException {
		if (age < 15 || age > 30) {
			throw new AgeException("年龄范围15-30");
		} else {
			this.age =age;
		}
	}
	
	public void setName(String name) throws nameException{
		if (name.length() <2 || name.length() >4) {
			throw new nameException("姓名范围2-4");
		} else {
			this.name = name;
		}
	}
	
	
	public student(String name, int age) {
		
		try {
			setName(name);
			setAge(age);
		} catch (AgeException e) {
			e.printStackTrace();
		} catch (nameException e) {
			e.printStackTrace();
		}
		
	}

	public String toString() {
		return "student name:" + name + ", age = " + age;
	}
		
}

