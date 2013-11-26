//WORKS
//Write a program that read a (arbitrarily long) sequence of positive numbers. The sequence is ended when the users enters “-1”. At that point, the program must output the highest number in the sequence.
boolean ended = false
int highest, current





while (!ended) {
	println "Please input a number, I will tell you the highest when you enter -1: "
	current = Integer.parseInt(System.console().readLine())
	if (current == -1) {
		ended = true
	}
	if (current > highest) {
		highest = current
	}
}
println "The highest was " + highest