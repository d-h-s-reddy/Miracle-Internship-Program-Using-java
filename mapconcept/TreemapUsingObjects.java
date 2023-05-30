package mapconcept;
import java.util.*;
class Students{
	int id;
	String name,branch;
	int marks;
	Students(int id,String name,String branch,int marks){
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	
}
public class TreemapUsingObjects {

	public static void main(String[] args) {
		Students s1=new Students(14,"hari","IT",90);
		Students s2=new Students(60,"mukund","IT",91);
		TreeMap<Integer,Students> hm=new TreeMap();
		hm.put(1, s1);
		hm.put(2,s2);
		//enhanced for loop
		for(Map.Entry m:hm.entrySet()) {
			int k=(int)m.getKey();
			Students s=(Students)m.getValue();
			System.out.print("key is:"+k);
			System.out.println("The values are:"+s.id + s.name + s.branch + s.marks);
		}
	}
}
