package mapconcept;
import java.util.*;
class Student{
	int id;
	String name,branch;
	int marks;
	Student(int id,String name,String branch,int marks){
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	
}
public class HashmapUsingObjects {

	public static void main(String[] args) {
		Student s1=new Student(14,"hari","IT",90);
		Student s2=new Student(60,"mukund","IT",91);
		HashMap<Integer,Student> hm=new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		//enhanced for loop
		for(Map.Entry m:hm.entrySet()) {
			int k=(int)m.getKey();
			Student s=(Student)m.getValue();
			System.out.print("key is:"+k);
			System.out.println("The values are:"+s.id + s.name + s.branch + s.marks);
		}
	}
}
