class A{
    public A add(){
        System.out.println("Added");
        return this;
    }
    public A remove(){
        System.out.println("Removed");
        return this;
    }
}

public class Main
{
	public static void main(String[] args) {
		A a = new A();
		a.add().remove().add();
	}
}
