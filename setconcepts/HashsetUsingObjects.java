package setconcepts;
import java.util.*;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class HashsetUsingObjects {

	public static void main(String[] args) {
		Student s1=new Student(14,"hari");
		Student s2=new Student(45,"mohan");
		HashSet<Student> hs=new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			Student s=(Student)i.next();
			System.out.println(s.id+" "+s.name);
		}
		System.out.println("By using the enhanced for loop");
		for(Student s4:hs) {
			System.out.println(s4.id+" "+s4.name);
		}

	}

}
