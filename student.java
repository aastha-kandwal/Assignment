package MA104_assignment;
import java.util.*;

 abstract public class student{
	String Name;
	int Roll_No;
	String DOB;
	String Branch="Mathematics and Computing";
	int Semester;
	String sex;
	String w;
	student(String Name,int Roll_No,String DOB,int Semester,String sex){
		this.Name=Name;
		this.Roll_No=Roll_No;
		this.DOB=DOB;
		this.Semester=Semester;
		this.sex=sex;
	}
	String scholarship() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Have you been granted scholarship?");
		System.out.println("Enter Y for yes and N for no");
		String x=sc.next();
		return x;
		}
	abstract String caste(String w);
}
