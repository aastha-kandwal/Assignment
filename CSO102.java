package MA104_assignment;
import java.util.*;

class exams2 extends Assignment implements Lab,Quiz{
	int mid_ms;
	int end_ms;
	int q1=0;
	int q2=0;
	int q3=0;
	int l1;
	int l2;
	int l3;
	int l4;
	
	exams2(int mid_ms,int end_ms,int ms1,int ms2,int l1,int l2,int l3,int l4){
		super(ms1,ms2);
		this.mid_ms=mid_ms;
		this.end_ms=end_ms;
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		this.l4=l4;
	}
	
	public int best(int q1,int q2,int q3) {
		int s=0;
		return s;
	}
	
	public int avg(int l1,int l2,int l3,int l4) {
		int s=(l1+l2+l3+l4)/4;
		return s;
	}
	
	int total(int mid_ms,int end_ms,int ms1,int ms2) {
		int s=mid_ms+end_ms+scaling_assingment(ms1,ms2);
		return s;
	}
}

public class CSO102 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mid_sem marks __/30: ");
		int a=sc.nextInt();
		System.out.println("Enter end_sem marks __/50: ");
		int b=sc.nextInt();
		System.out.println("Enter assignment1 marks __/10: ");
		int a1=sc.nextInt();
		System.out.println("Enter assignments2 marks __/10: ");
		int a2=sc.nextInt();
		System.out.println("Enter Lab1 marks __/10: ");
		int l1=sc.nextInt();
		System.out.println("Enter Lab2 marks __/10: ");
		int l2=sc.nextInt();
		System.out.println("Enter Lab3 marks __/10: ");
		int l3=sc.nextInt();
		System.out.println("Enter Lab4 marks __/10: ");
		int l4=sc.nextInt();
		exams2 obj1=new exams2(a,b,a1,a2,l1,l2,l3,l4);
		int s=0;
		s+=obj1.avg(l1,l2,l3,l4)+obj1.total(a,b,a1,a2);
		System.out.println("The Final Marks of Data Structure are "+s);
		sc.close();
	}

}



