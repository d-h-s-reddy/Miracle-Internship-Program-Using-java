package day1internship;

public class SumAndAverage {

    int sum(int i,int j,int k) {
    	return i+j+k;
    }
    float avg(int sum) {
    	return sum/3;
    }
	public static void main(String[] args) {
		//find the sum and average of two numbers
		SumAndAverage p=new SumAndAverage();
		int a=p.sum(10,20,30);
		System.out.println("The sum of three numbers is:"+a);
		System.out.println("The Average of three numbers is:"+p.avg(a));

	}

}
