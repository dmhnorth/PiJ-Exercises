//Works - would be good to find out if abs value could be calculated within the class
//Distance point to point - Write a program that reads the X and Y coordinates of three points and then outputs which of the three are closer. 
//Use the following class to store the data for the points:
// 		class Point {
//			double x;
//			double y;
//		}


String userEntry1, userEntry2

class Point {
	String name;
	double x;
	double y;
	double value;
	
//	double getPointValue (Point point) {
//		point.value = Math.abs(point.x) + Math.abs(point.y)
//		} result println "The value of point " + this.point.name + " is " + point.value 				//is there a way of calculating this within the class? Yes, create a method within the class that adds up the x and y and gets the Math.abs
}

Point point1 = new Point()
point1.name = "Point 1"
Point point2 = new Point()
point2.name = "Point 2"
Point point3 = new Point()
point3.name = "Point 3"

println "This program will take three sets of X and Y coordinates and tell you which one is closest to 0,0: "

print "Please enter the X value of Point 1: "	//entry for point 1
userEntry1 = System.console().readLine()
print "Please enter the Y value of Point 1: "
userEntry2 = System.console().readLine()


point1.x = Double.parseDouble(userEntry1)
point1.y = Double.parseDouble(userEntry2)



print "Please enter the X value of Point 2: "	//entry for point 2
userEntry1 = System.console().readLine()
print "Please enter the Y value of Point 2: "
userEntry2 = System.console().readLine()


point2.x = Double.parseDouble(userEntry1)
point2.y = Double.parseDouble(userEntry2)

print "Please enter the X value of Point 3: "	//entry for point 3
userEntry1 = System.console().readLine()
print "Please enter the Y value of Point 3: "
userEntry2 = System.console().readLine()


point3.x = Double.parseDouble(userEntry1)
point3.y = Double.parseDouble(userEntry2)

println "\n"
println "The coordinates you have entered are as follows: "
println point1.name + " is: " + point1.x + ", " + point1.y
println point2.name + " is: " + point2.x + ", " + point2.y
println point3.name + " is: " + point3.x + ", " + point3.y

point1.value = Math.abs(point1.x) + Math.abs(point1.y)	//is it possible to define this in the class
println point1.name + " absolute value is " + point1.value
point2.value = Math.abs(point2.x) + Math.abs(point2.y)	//is it possible to define this in the class
println point2.name + " absolute value is " + point2.value
point3.value = Math.abs(point3.x) + Math.abs(point3.y)	//is it possible to define this in the class
println point3.name + " absolute value is " + point3.value

if (point1.value < point2.value && point1.value < point3.value) {
	nearest = point1.name
} else 
if (point2.value < point1.value && point2.value < point3.value) {
	nearest = point2.name
} else
	nearest = point3.name



println nearest + " is the nearest coordinate to (0.0,0.0)"
