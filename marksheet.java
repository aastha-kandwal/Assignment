package MA104_assignment;
import java.util.*;

class result extends student{
	char g1;
	char g2;
	char g3;
	char g4;
	char g5;
	char g6;
	int s1;
	int s2;
	int s3;
	int s4;
	int s5;
	int s6;
	String Name;
	int Roll_No;
	String DOB;
	int Semester;
	String sex;
	String w;
	result(String Name,int Roll_No,String DOB,int Semester,String sex,int s1,int s2,int s3,int s4,int s5,int s6){
		super(Name,Roll_No,DOB,Semester,sex);
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		this.s5=s5;
		this.s6=s6;
	}
	String caste(String w) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Caste (General/OBC/SC/ST)");
		w=sc.next();
		return w;
	}
	char gradetype(int s) {
		char g;
		if (s>=91){
			g='A';
		}
		else if(s>=81) {
			g='B';
		}
		else if(s>=71) {
			g='C';
		}
		else if(s>=51) {
			g='D';
		}
		else if(s>=33) {
			g='E';
		}
		else {
			g='F';
		}
		return g;
	}
	void display(String Name,int Roll_No,String DOB,int Semester,String sex) {
		System.out.println("**************STUDENT's REPORT CARD*************");
		System.out.println("Student's Name is "+Name);
		System.out.println("Student's Roll Number is "+Roll_No);
		System.out.println("Student's Date of Birth is "+DOB);
		System.out.println("Student's Branch "+Branch);
		System.out.println("Student's Current Semester is "+Semester);
		System.out.println("Student's Gender is "+sex);
		System.out.println();
		System.out.println("##Electronics##");
		System.out.println("Marks:"+s1);
		g1=gradetype(s1);
		System.out.println("Grade:"+g1);
		System.out.println();
		System.out.println("##Data Structure##");
		System.out.println("Marks:"+s2);
		g2=gradetype(s2);
		System.out.println("Grade:"+g2);
		System.out.println();
		System.out.println("##Engineering Mathematics 2##");
		System.out.println("Marks:"+s3);
		g3=gradetype(s3);
		System.out.println("Grade:"+g3);
		System.out.println();
		System.out.println("##Information and Techonology Workshop##");
		System.out.println("Marks:"+s4);
		g4=gradetype(s4);
		System.out.println("Grade:"+g4);
		System.out.println();
		System.out.println("##Algebra##");
		System.out.println("Marks:"+s5);
		g5=gradetype(s5);
		System.out.println("Grade:"+g5);
		System.out.println();
		System.out.println("##Creative Practice##");
		System.out.println("Marks:"+s6);
		g6=gradetype(s6);
		System.out.println("Grade:"+g6);
		System.out.println();		
	}
	
}

public class marksheet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int n=sc.nextInt();
		for(int i=0;i<n;) {
			int s1=0;
			int s2=0;
			int s3=0;
			int s4=0;
			int s5=0;
			int s6=0;
			System.out.println("Enter Student's Name");
			String nm=sc.next();
			System.out.println("Enter Student's Roll Number");
			int rn=sc.nextInt();
			System.out.println("Enter Student's Date of Birth in DD/MM/YYYY format");
			String db=sc.next();
			System.out.println("Enter Student's Semester");
			int sem=sc.nextInt();
			System.out.println("Enter Student's Gender \nEnter F for female \nEnter M for male \nEnter O for Others");
			String sx=sc.next();
			for(int j=0;j<6;j++) {
				
				if (j==0) {
					System.out.println("**********Electronics**********");
					System.out.println("Enter mid_sem marks __/20: ");
					int a1=sc.nextInt();
					System.out.println("Enter end_sem marks __/50: ");
					int b1=sc.nextInt();
					System.out.println("Enter quiz1 marks  __/5: ");
					int q11=sc.nextInt();
					System.out.println("Enter quiz2 marks  __/5: ");
					int q21=sc.nextInt();
					System.out.println("Enter quiz3 marks  __/5: ");
					int q31=sc.nextInt();
					System.out.println("Enter assignment1 marks __/10: ");
					int a11=sc.nextInt();
					System.out.println("Enter assignment2 marks __/10: ");
					int a21=sc.nextInt();
					System.out.println("Enter Lab1 marks __/10: ");
					int l11=sc.nextInt();
					System.out.println("Enter Lab2 marks __/10: ");
					int l21=sc.nextInt();
					System.out.println("Enter Lab3 marks __/10: ");
					int l31=sc.nextInt();
					System.out.println("Enter Lab4 marks __/10: ");
					int l41=sc.nextInt();
					exams1 obj1=new exams1(a1,b1,q11,q21,q31,a11,a21,l11,l21,l31,l41);
					s1+=obj1.best(q11,q21,q31)+obj1.avg(l11,l21,l31,l41)+obj1.total(a1,b1,a11,a21);			
				}
					
				else if (j==1) {
					System.out.println("**********Data Structure**********");
					System.out.println("Enter mid_sem marks __/30: ");
					int a2=sc.nextInt();
					System.out.println("Enter end_sem marks __/50: ");
					int b2=sc.nextInt();
					System.out.println("Enter assignment1 marks __/10: ");
					int a12=sc.nextInt();
					System.out.println("Enter assignments2 marks __/10: ");
					int a22=sc.nextInt();
					System.out.println("Enter Lab1 marks __/10: ");
					int l12=sc.nextInt();
					System.out.println("Enter Lab2 marks __/10: ");
					int l22=sc.nextInt();
					System.out.println("Enter Lab3 marks __/10: ");
					int l32=sc.nextInt();
					System.out.println("Enter Lab4 marks __/10: ");
					int l42=sc.nextInt();
					exams2 obj1=new exams2(a2,b2,a12,a22,l12,l22,l32,l42);
					s2+=obj1.avg(l12,l22,l32,l42)+obj1.total(a2,b2,a12,a22);
				}
				
				else if (j==2) {
					System.out.println("**********Engineering Mathematics 2**********");
					System.out.println("Enter mid_sem marks __/30: ");
					int a3=sc.nextInt();
					System.out.println("Enter end_sem marks __/50: ");
					int b3=sc.nextInt();
					System.out.println("Enter quiz1 marks  __/5: ");
					int q13=sc.nextInt();
					System.out.println("Enter quiz2 marks  __/5: ");
					int q23=sc.nextInt();
					System.out.println("Enter quiz3 marks  __/5: ");
					int q33=sc.nextInt();
					System.out.println("Enter assignment1 marks __/10: ");
					int a13=sc.nextInt();
					System.out.println("Enter assignment2 marks __/10: ");
					int a23=sc.nextInt();
					exams3 obj1=new exams3(a3,b3,q13,q23,q33,a13,a23);
					s3+=obj1.best(q13,q23,q33)+obj1.total(a3,b3,a13,a23);
				}
				
				else if (j==3) {
					System.out.println("**********Information and Techonology Workshop**********");
					System.out.println("Enter mid_sem marks __/25: ");
					int a4=sc.nextInt();
					System.out.println("Enter end_sem marks __/25: ");
					int b4=sc.nextInt();
					System.out.println("Enter assignment1 marks JAVA__/5: ");
					int q14=sc.nextInt();
					System.out.println("Enter assignment2 marks OOPs __/5: ");
					int q24=sc.nextInt();
					System.out.println("Enter assignment3 marks PYTHON__/5: ");
					int q34=sc.nextInt();
					System.out.println("Enter project1 marks of JAVA __/20: ");
					int a14=sc.nextInt();
					System.out.println("Enter project2 marks of PYTHON __/20: ");
					int a24=sc.nextInt();
					System.out.println("Enter Lab1 marks for JAVA __/10: ");
					int l14=sc.nextInt();
					System.out.println("Enter Lab2 marks for JAVA __/10: ");
					int l24=sc.nextInt();
					System.out.println("Enter Lab3 marks for PYTHON__/10: ");
					int l34=sc.nextInt();
					System.out.println("Enter Lab4 marks for PYTHON__/10: ");
					int l44=sc.nextInt();
					exams4 obj1=new exams4(a4,b4,q14,q24,q34,a14,a24,l14,l24,l34,l44);
					s4+=obj1.best(q14,q24,q34)+obj1.avg(l14,l24,l34,l44)+obj1.total(a4,b4,a14,a24);
				}
				else if (j==4) {
					System.out.println("**********Algebra**********");
					System.out.println("Enter mid_sem marks __/30: ");
					int a5=sc.nextInt();
					System.out.println("Enter end_sem marks __/50: ");
					int b5=sc.nextInt();
					System.out.println("Enter quiz1 marks  __/5: ");
					int q15=sc.nextInt();
					System.out.println("Enter quiz2 marks  __/5: ");
					int q25=sc.nextInt();
					System.out.println("Enter quiz3 marks  __/5: ");
					int q35=sc.nextInt();
					System.out.println("Enter assignment1 marks __/10: ");
					int a15=sc.nextInt();
					System.out.println("Enter assignment2 marks __/10: ");
					int a25=sc.nextInt();
					exams5 obj1=new exams5(a5,b5,q15,q25,q35,a15,a25);
					s5+=obj1.best(q15,q25,q35)+obj1.total(a5,b5,a15,a25);
				}
				else if(j==5) {
					System.out.println("**********Creative Practice**********");
					System.out.println("Enter Creative Practice activity name: ");
					String w6=sc.next();
					System.out.println("Enter end_sem marks __/50: ");
					int b6=sc.nextInt();
					System.out.println("Enter assignment1 marks __/10: ");
					int a16=sc.nextInt();
					System.out.println("Enter assignments2 marks __/10: ");
					int a26=sc.nextInt();
					System.out.println("Enter Practical marks __/20: ");
					int l16=sc.nextInt();
					System.out.println("Enter Viva marks __/20: ");
					int l26=sc.nextInt();
					exams6 obj1=new exams6(w6,b6,6,a26,l16,l26);
					s6+=obj1.avg(l16,l26,0,0)+obj1.total(0,b6,a16,a26);
				}
			}
			
			result obj=new result(nm,rn,db,sem,sx,s1,s2,s3,s4,s5,s6);
			String w=null;
			System.out.println();
			String p=obj.scholarship();
			System.out.println();
			String q=obj.caste(w);
			System.out.println();
			obj.display(nm,rn,db,sem,sx);
			System.out.println();
			System.out.println("##Scholarship Status##");
			System.out.println(p);
			System.out.println();
			System.out.println("##Caste##");
			System.out.println(q);
			
		}
		sc.close();
	}
}