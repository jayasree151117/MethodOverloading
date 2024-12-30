package oops;

public class MethodOverLoading2 {
	public void add() {
		System.out.println("addition");
	}
	public void add(int a) {
		System.out.println("addition "+a);
	}

	public static void main(String[] args) {
		MethodOverLoading2 m=new MethodOverLoading2();
		m.add();
		m.add(4);

	}

}
