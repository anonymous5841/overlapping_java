
public class Rectangle {

	double length;

	double width;

	int x;

	int y;

	Rectangle(double length, double width, int x, int y){

		setLength(length);

		setWidth(width);

		setX(x);

		setY(y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double area(){

		return length * width;
	}



	public double circumference(){

		return 2 * (length + width);
	}


	public Rectangle getMinRec(Rectangle R1, Rectangle R2){

		if (R1.area() < R2.area())
			return R1;
		else
			return  R2;
	}


   public Rectangle overLap(Rectangle R1, Rectangle R2){
        double x1 = R1.width + R1.x;
       double x2 = R2.width + R2.x;
	   double y1 = R1.y + R1.length;
	   double y2 = R2.y + R2.length;

	   //(R1.x <= R2.x || x1 >= R2.x) && (R1.y <= R2.x || x1 >= R2.x)
       if (((R2.x >= R1.x && R2.x <= x1) || (x2 >= R1.x && x2 <= x1)) && ((R2.y >= R2.y && R2.y <= y1) || (y2 >= R1.y && y2 <= y1))) {

	       return R2;
       }

	   else{

	       return R1;
       }

	}

   public String Print(Rectangle R1, Rectangle R2, Rectangle R){

	   double x1 = R1.width + R1.x;
	   double y1 = R1.y + R1.length;
	   double area1 = (x1 - R2.x) * (y1 - R2.y);

		if(R == R2){

 		return String.format("Both the rectangles overlap and the overlapped area is %.2f", area1);
		}

		else if (R == R1){
			return " Both the rectangles don't overlap";
		}

	return "nope";
	}

}


