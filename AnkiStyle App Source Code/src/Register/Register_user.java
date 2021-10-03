package Register;

import java.util.Scanner;

class Register
{
	private String f_name ;
		private String l_name ;
		private String username ;
		private String password ;
		private long mob_number;
		
		 public String  getF_name() {
		       return   f_name ;}
		
	     public void setF_name(String f_name) {
	       this.f_name =f_name; }
	     
	     public  String  getL_name() {
		        return l_name; }
	     
	     
	     public  void setL_name(String l_name) {
		       this.l_name = l_name; }
	     
	     public  String  getUsername() {
		       return username ; }
	     
	     public  void  setUsername(String username) {
		       this.username=username; }
	     
	     public  String  getPassword() {
		       return password ; }
	     
	     public  void setPassword(String password) {
		       this.password=password; }
	     
	     public  long  getMob_number() {
		       return mob_number ; }
   
	     
	     public  void  setMob_number(long mob_number) {
		       this.mob_number=mob_number; }
}
public class Register_user {
	
    public static void main(String args[])
    {
  	  Register r=new Register(); 
  	  try (Scanner sc=new Scanner(System.in)) {
  	  	System.out.println(" Enter your First name ");
				String  F_Name=sc.nextLine();
				r.setF_name(F_Name);
				
				System.out.println(" Enter your Last name ");
				String  L_Name=sc.nextLine();
				r.setL_name(L_Name);
				
				System.out.println(" Enter Mobile number ");
				long  Mob_number=sc.nextLong();
				r.setMob_number(Mob_number);
				
				System.out.println(" Create username ");
				String   username=sc.next();
				r.setUsername(username);
				
				System.out.println("Create  Password ");
				String  password=sc.next();
				r.setPassword(password);
				System.out.println("         Register Successfully        ");
				} 
  	  register_data(r);
    }
    
    private   static void  register_data(Register r)
    {
  	  System.out.println(r.getF_name());
  	  System.out.println(r.getL_name());
  	  System.out.println(r.getMob_number());
  	  System.out.println(r.getUsername());
  	  System.out.println(r.getPassword());
     }   	  
	  
}

	     
	     
	     
	     
