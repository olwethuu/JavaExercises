package MyPack;

public class Pizza{
String opener = "Open the door";		//package-private access
public String closer = "Close the door";	//public access
protected String left = "Fix the left door";	//protected access
private String right = "Fix the right door";	// private access


public static void main(String[] args){
Pizza pz = new Pizza();
Pizza delete = new Pizza();
delete = null; // this object is no longer visible to the JVM, but pz is still

System.out.println("Hello");

// operators

int a = 4;
int b = 5;
boolean x = true;
int max;

// selection statement

if(x){
if(b < a){
System.out.println("Right answer");
} else if(b>a){
System.out.println("Wrong answer");
}
else{
System.out.println("Welcome");
}
}
else


/* System.out.println(a++);	//post
System.out.println(++a);
System.out.println(b++);
System.out.println(++b);
System.out.println(a);	//final value of a
System.out.println(b);	//final value of b

// value overflow and underflow

byte e = -128;
e = (byte)(e-1);
System.out.println(e);

byte f = 127; // 
f = (byte)(f + 1);
System.out.println(f); */


}
}