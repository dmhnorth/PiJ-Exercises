//WORKS
//Write a program that reads three numbers and prints them in order, from lowest to highest.

int ent1, ent2, ent3, sml, med, lrg


println "This program tells you the order of numbers"

println "Please enter your first number: "
ent1 = Integer.parseInt(System.console().readLine())

println "Please enter your second number: "
ent2 = Integer.parseInt(System.console().readLine())

println "Please enter your third number: "
ent3 = Integer.parseInt(System.console().readLine()) //something is going wrong here, is it a switch?


if (ent1 >= ent2 && ent1 >= ent3) {	//checks if ent1 is the largest
		lrg = ent1
	}
	else if (ent1 >= ent3 || ent1 >= ent2)	//checks if its larger than either of just one of the others
	{
		med = ent1
	} else {
		sml = ent1	//if its not larger than either of the others it just becomes the smallest
	}

if (ent2 >= ent1 && ent2 >= ent3)
	{
		lrg = ent2
	} 
	else if (ent2 >= ent3 || ent2 >= ent1)
	{
		med = ent2
	} else {
		sml = ent2
	}
if (ent3 >= ent2 && ent3 >= ent1) {
	lrg = ent3
	} 
	else if (ent3 >= ent1 || ent3 >= ent2) 
	{
		med = ent3
	} else {
		sml = ent3
	}



println "The order of numbers is " + sml + "," + med + "," + lrg