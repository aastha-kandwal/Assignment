package MA104_assignment;
import java.util.*;

class exams4 extends Assignment implements Lab,Quiz{
	int mid_ms;
	int end_ms;
	int q1;
	int q2;
	int q3;
	int l1;
	int l2;
	int l3;
	int l4;
	
	exams4(int mid_ms,int end_ms,int q1,int q2,int q3,int ms1,int ms2,int l1,int l2,int l3,int l4){
		super(ms1,ms2);
		this.mid_ms=mid_ms;
		this.end_ms=end_ms;
		this.q1=q1;
		this.q2=q2;
		this.q3=q3;
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		this.l4=l4;
	}
	
	public int best(int q1,int q2,int q3) {
		int s=0;
		if (q1>=q2 || q2>=q3){
			s=q1+q2;
		}
		else if (q2>=q3 || q3>=q1){
			s=q2+q3;
		}
		else if (q3>=q1 || q1>=q2){
			s=q3+q1;
		}
		else if (q1>=q3 ||q3>=q2){
			s=q1+q3;
		}
		else if (q2>=q1 || q1>=q3){
			s=q2+q1;
		}
		else if (q3>=q2 || q2>=q1) {
			s=q3+q1;
		}
		return s;
	}
	
	public int avg(int l1,int l2,int l3,int l4) {
		l1+=l2;
		l3+=l4;
		int s=(l1+l3)/2;
		return s;
	}
	
	int total(int mid_ms,int end_ms,int ms1,int ms2) {
		int s=mid_ms+end_ms+scaling_assingment(ms1,ms2);
		return s;
	}
}

public class MA104 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mid_sem marks __/25: ");
		int a=sc.nextInt();
		System.out.println("Enter end_sem marks __/25: ");
		int b=sc.nextInt();
		System.out.println("Enter assignment1 marks JAVA__/5: ");
		int q1=sc.nextInt();
		System.out.println("Enter assignment2 marks OOPs __/5: ");
		int q2=sc.nextInt();
		System.out.println("Enter assignment3 marks PYTHON__/5: ");
		int q3=sc.nextInt();
		System.out.println("Enter project1 marks of JAVA __/20: ");
		int a1=sc.nextInt();
		System.out.println("Enter project2 marks of PYTHON __/20: ");
		int a2=sc.nextInt();
		System.out.println("Enter Lab1 marks for JAVA __/10: ");
		int l1=sc.nextInt();
		System.out.println("Enter Lab2 marks for JAVA __/10: ");
		int l2=sc.nextInt();
		System.out.println("Enter Lab3 marks for PYTHON__/10: ");
		int l3=sc.nextInt();
		System.out.println("Enter Lab4 marks for PYTHON__/10: ");
		int l4=sc.nextInt();
		exams4 obj1=new exams4(a,b,q1,q2,q3,a1,a2,l1,l2,l3,l4);
		int s=0;
		s+=obj1.best(q1,q2,q3)+obj1.avg(l1,l2,l3,l4)+obj1.total(a,b,a1,a2);
		System.out.println("The Final Marks of Information and Techonology Workshop are "+s);
		sc.close();
	}

}


