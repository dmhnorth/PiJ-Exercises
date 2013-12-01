//Works
//exercise 13 - Write a program that reads the X and Y coordinates of two points and then outputs the area of a rectangle where both points are opposite corners. Use the following class to store the data for the points:
//
//	class Rectangle {
//	Point upLeft;
//	Point downRight;
//	}
// Your program should calculate (and write on the screen) the perimeter and area of the rectangle.


String userEntry1, userEntry2


class Point {
	double x = 0;
	double y = 0;
	double absolute_value;
	Point(){

	}
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle rect1 = new Rectangle();
rect1.upLeft = new Point()
rect1.downRight = new Point()		//Instantiate (create an instance, instructing the system to reserve some memory for us, it IS NOT initialisation) and we assign a reference to it to our member variable (downRight in this case)

print "Please enter the X value of the top left coordinate of the rectangle: "
userEntry1 = System.console().readLine()
print "Please enter the Y value of the top left coordinate of the rectangle: "
userEntry2 = System.console().readLine()

rect1.upLeft.x = Double.parseDouble(userEntry1)	//don't quite understand what's going on here, syntax is out?
rect1.upLeft.y = Double.parseDouble(userEntry2)

print "Please enter the X value of the bottom right coordinate of the rectangle: "
userEntry1 = System.console().readLine()
print "Please enter the Y value of the bottom right coordinate of the rectangle: "
userEntry2 = System.console().readLine()

rect1.downRight.x = Double.parseDouble(userEntry1)
rect1.downRight.y = Double.parseDouble(userEntry2)

//Rectangle 2

Rectangle rect2 = new Rectangle();
rect2.upLeft = new Point()
rect2.downRight = new Point()

print "Please enter the X value of the top left coordinate of the rectangle: "
userEntry1 = System.console().readLine()
print "Please enter the Y value of the top left coordinate of the rectangle: "
userEntry2 = System.console().readLine()

rect2.upLeft.x = Double.parseDouble(userEntry1)	//don't quite understand what's going on here, syntax is out?
rect2.upLeft.y = Double.parseDouble(userEntry2)

print "Please enter the X value of the bottom right coordinate of the rectangle: "
userEntry1 = System.console().readLine()
print "Please enter the Y value of the bottom right coordinate of the rectangle: "
userEntry2 = System.console().readLine()

rect2.downRight.x = Double.parseDouble(userEntry1)
rect2.downRight.y = Double.parseDouble(userEntry2)











print "Please enter the X value of a local Point: "
userEntry1 = System.console().readLine()
print "Please enter the Y value of a third Point: "
userEntry2 = System.console().readLine()

Point local = new Point();


local.x = Double.parseDouble(userEntry1)
local.y = Double.parseDouble(userEntry2)




println "The coordinates taken are as follows: "
println rect1.upLeft.x
println rect1.upLeft.y
println rect1.downRight.x
println rect1.downRight.y

int width = rect1.upLeft.x - rect1.downRight.x
int height = rect1.upLeft.y - rect1.downRight.y

boolean insideBoth = false
boolean insideOne = false

//one or the other
if ((local.x >= rect1.upLeft.x && local.x <= rect1.downRight.x && local.y <= rect1.upLeft.y && local.y >= rect1.downRight.y) ^ (local.x >= rect2.upLeft.x && local.x <= rect2.downRight.x && local.y <= rect2.upLeft.y && local.y >= rect2.downRight.y)) {
	insideOne = true;
}

//both
if ((local.x >= rect1.upLeft.x && local.x <= rect1.downRight.x && local.y <= rect1.upLeft.y && local.y >= rect1.downRight.y) && (local.x >= rect2.upLeft.x && local.x <= rect2.downRight.x && local.y <= rect2.upLeft.y && local.y >= rect2.downRight.y)) {
	insideBoth = true;
}



Integer area = Math.abs(width) * Math.abs(height)	//Math.abs are required to make the outcome positive
Integer perimeter = Math.abs(width * 2) + Math.abs(height * 2)	//It's worth noting that Integer is used because the math.abs require that


println "The area of the Rectangle is: " + area
println "The perimeter of the Rectangle is: " + perimeter
println "The point you've entered is in both of the rectangles?: " + insideBoth
println "The point you've entered is in just one of the rectangles?: " + insideOne