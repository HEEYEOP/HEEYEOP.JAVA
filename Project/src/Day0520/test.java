package Day0520;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		point t = new point();
		t.print();

		t.move(3, 5);
		t.print();
		
		point t2 = new point(t);
		t2.print();
		*/
		
		point3D p = new point3D();
		p.print();
		p.move(5, 5, 5);
		p.print();
		p.move(10, 10);
		p.print();
		point3D p2 = new point3D(p);
		p2.print();
		
		
	}

	
}
