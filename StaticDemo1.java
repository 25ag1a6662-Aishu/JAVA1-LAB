class StaticDemo1{
//static block
 static{
	IO.println("This is static block");
}
//class main method
public static void main1(String[] args){
IO.println("Class Main Method");
}
//instance main method
void main2(){
IO.println("Instance Main Method");
}
}
void main(String...args){
	main1();
	main2();
}
//why we cannot use static block inside unnamed class of java?
 //**Static blocks are not allowed in unnamed classes because unnamed classes are meant for simple programs and do not support static initialization.**
//is it a security purpose based on which static block is not allowed in unnamed classes of java?
//No. It is not for security purposes.The reason is simplicity, not security.
//how void main in unnamed class of java works implicitly without having an object?
//inside a named class i have created instance main method through which iam calling both static and non-static method without using any object how it works? give answer 