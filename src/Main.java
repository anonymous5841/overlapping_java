public class Main {
	public static void main(String[] args) {


		Time t1 = new Time(12,34,40);

		Rectangle R1 = new Rectangle(4,4,0,0);

		Rectangle R2 = new Rectangle(3,3,2,2);

		Rectangle smallRec = R1.getMinRec(R1,R2);

		Rectangle over1 = R1.overLap(R1,R2);

//		System.out.println(R1.length);
//		System.out.println(R1.width);
//		System.out.println(R1.getLength());
//		System.out.println(R1.getWidth());
//		System.out.println(R1.area());
//		System.out.println(R1.circumference());


		System.out.println(t1.getTime());

		System.out.println(smallRec.area());

		System.out.println(over1.Print(R1,R2,over1));

}}