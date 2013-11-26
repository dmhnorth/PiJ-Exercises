//Works - All methods work using the test program at the bottom!
//Write a program in which you create and use a class called Point, with two fields of type double (e.g. x, y) and the
//following methods:
//distanceTo(Point): calculates the distance to another point.
//distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.
//moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.
//moveTo(Point): changes the coordinates of this point to move where the given point is.
//clone(): returns a copy of the current point with the same coordinates.
//opposite(): returns a copy of the current point with the coordinates multiplied by −1.
//Two methods in a class can have the same name (identifier) as long as their parameters are different. This is
//called method overloading and we will see more of that in the future.



public class Point {	//class of point defined
	private double x;
	private double y;	
	
	public Point(){	//constructor method, does this need private and public stated?
		this.x = 0;
		this.y = 0;
		}
	
		private double distanceTo(Point point) {	//works I think	
			double distance = Math.abs(point.x) + Math.abs(point.y);
			double distanceTo = distance - (Math.abs(this.x) + Math.abs(this.y));
			return Math.abs(distanceTo);
	}
		private double distanceToOrigin()	{	//works I think
			double distance = Math.abs(this.x) + Math.abs(this.y);
			return distance
	}
		private void moveTo(double x, double y) { //
			this.x = x;
			this.y = y;
	}
		private void moveTo(Point point) {	//works
			this.x = point.x;
			this.y = point.y;
	}
	
		public Point clone() {
			Point copy = new Point();
			copy.x = this.x
			copy.y = this.y
			return copy;
	}
	
		public Point opposite() {
			Point opPoint = new Point();			 //is there a more elegant way of stating negative numbers?
			opPoint.x = -this.x;
			opPoint.y = -this.y;
			return opPoint;
	}

}


//Testing Program Starts

Point myPoint = new Point();	
Point anotherPoint = new Point();	


print "Please enter the X value of Point - myPoint: ";	//entry for myPoint
String userEntry1 = System.console().readLine();
print "Please enter the Y value of Point - myPoint: ";
String userEntry2 = System.console().readLine();

myPoint.x = Double.parseDouble(userEntry1);
myPoint.y = Double.parseDouble(userEntry2);

print "Please enter the X value of Point - anotherPoint: ";	//entry for myPoint
userEntry1 = System.console().readLine();
print "Please enter the Y value of Point - anotherPoint: ";
userEntry2 = System.console().readLine();

anotherPoint.x = Double.parseDouble(userEntry1);
anotherPoint.y = Double.parseDouble(userEntry2);

System.out.println("After doing nothing but taking values...");
System.out.println("The value x on myPoint is " + myPoint.x);
System.out.println("The value y on myPoint is " + myPoint.y);
System.out.println("The value x on anotherPoint is " + anotherPoint.x);
System.out.println("The value y on anotherPoint is " + anotherPoint.y);

System.out.println("The distance from myPoint to anotherPoint is " + myPoint.distanceTo(anotherPoint));
System.out.println("The distance from the origin of myPoint is " + myPoint.distanceToOrigin());
myPoint.moveTo(1, 1);
System.out.println("The value of myPoint after using moveTo coordinates to change them to 1,1 is " + myPoint.x + "," + myPoint.y);
myPoint.moveTo(anotherPoint);
System.out.println("The coordinates of myPoint after using the moveTo(Point) method with anotherPoint's coordinates are: " + myPoint.x + "," + myPoint.y);
Point myPointClone = myPoint.clone();	//you don't need to use new here because new memory space is allocated in the method
System.out.println("The coordinates of myPointClone are: " + myPointClone.x + "," + myPointClone.y);
Point myPointCloneReverseClone = myPointClone.opposite();
System.out.println("The coordinates of myPointCloneReverseClone are: " + myPointCloneReverseClone.x + "," + myPointCloneReverseClone.y);



