package MA104_assignment;
import java.util.*;

class exams6 extends Assignment implements Lab,Quiz{
	String w;
	int mid_ms=0;
	int end_ms;
	int q1=0;
	int q2=0;
	int q3=0;
	int l1;
	int l2;
	int l3=0;
	int l4=0;
	
	exams6(String w,int end_ms,int ms1,int ms2,int l1,int l2){
		super(ms1,ms2);
		this.w=w;
		this.end_ms=end_ms;
		this.l1=l1;
		this.l2=l2;
	}
	
	public int best(int q1,int q2,int q3) {
		int s=0;
		return s;
	}
	
	public int avg(int l1,int l2,int l3,int l4) {
		int s=l1+l2;
		return s;
	}
	
	int total(int mid_ms,int end_ms,int ms1,int ms2) {
		int s=mid_ms+end_ms+scaling_assingment(ms1,ms2);
		return s;
	}
}

public class CP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Creative Practice activity name: ");
		String w=sc.next();
		System.out.println("Enter end_sem marks __/50: ");
		int b=sc.nextInt();
		System.out.println("Enter assignment1 marks __/10: ");
		int a1=sc.nextInt();
		System.out.println("Enter assignments2 marks __/10: ");
		int a2=sc.nextInt();
		System.out.println("Enter Practical marks __/20: ");
		int l1=sc.nextInt();
		System.out.println("Enter Viva marks __/20: ");
		int l2=sc.nextInt();
		exams6 obj1=new exams6(w,b,a1,a2,l1,l2);
		int s=0;
		s+=obj1.avg(l1,l2,0,0)+obj1.total(0,b,a1,a2);
		System.out.println("The Final Marks of "+w+" Creative Practice are "+s);
		sc.close();
	}

}



