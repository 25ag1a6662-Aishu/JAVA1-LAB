class Super{
    void show(){
        System.out.println("Iam in a super class");
    }
}
class sub extends Super{
    void display(){
        System.out.println("Iam in a sub class");
    }
}


public class singleinheritance {
    public static void main(String[] args){
        sub obj = new sub();
        obj.show();
        obj.display();
    }
    
}
