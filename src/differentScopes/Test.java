package differentScopes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("Student.xml");
		
		Student student = apc.getBean("stu", Student.class);
		System.out.println(student.hashCode());
		System.out.println(apc.isSingleton("stu"));
		System.out.println(apc.isPrototype("stu"));
		
		Student student2 = apc.getBean("stu",Student.class);
		System.out.println(student2.hashCode());
		System.out.println(apc.isSingleton("stu"));
		System.out.println(apc.isPrototype("stu"));
		
		
	
	}

}
