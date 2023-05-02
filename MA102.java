package MA104_assignment;
import java.util.*;

class exams3 extends Assignment implements Lab,Quiz{
	int mid_ms;
	int end_ms;
	int q1;
	int q2;
	int q3;
	int l1=0;
	int l2=0;
	int l3=0;
	int l4=0;
	
	exams3(int mid_ms,int end_ms,int q1,int q2,int q3,int ms1,int ms2){
		super(ms1,ms2);
		this.mid_ms=mid_ms;
		this.end_ms=end_ms;
		this.q1=q1;
		this.q2=q2;
		this.q3=q3;;
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
	
	public int avg(int l1,int l2,int l3,int l4) {;
		int s=0;
		return s;
	}
	
	int total(int mid_ms,int end_ms,int ms1,int ms2) {
		int s=mid_ms+end_ms+scaling_assingment(ms1,ms2);
		return s;
	}
}

public class MA102 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mid_sem marks __/30: ");
		int a=sc.nextInt();
		System.out.println("Enter end_sem marks __/50: ");
		int b=sc.nextInt();
		System.out.println("Enter quiz1 marks  __/5: ");
		int q1=sc.nextInt();
		System.out.println("Enter quiz2 marks  __/5: ");
		int q2=sc.nextInt();
		System.out.println("Enter quiz3 marks  __/5: ");
		int q3=sc.nextInt();
		System.out.println("Enter assignment1 marks __/10: ");
		int a1=sc.nextInt();
		System.out.println("Enter assignment2 marks __/10: ");
		int a2=sc.nextInt();
		exams3 obj1=new exams3(a,b,q1,q2,q3,a1,a2);
		int s=0;
		s+=obj1.best(q1,q2,q3)+obj1.total(a,b,a1,a2);
		System.out.println("The Final Marks of Engineering Mathematics 2 are "+s);
		sc.close();
	}

}

