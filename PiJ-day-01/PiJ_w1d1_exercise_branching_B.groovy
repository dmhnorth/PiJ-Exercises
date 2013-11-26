//How to create a switch example

println "Please choose an option:"
println "For �Checking you balance�, please enter 1"
println "For �Purchases�, please enter 2"
println "For �Refunds�, please enter 3"
println "For �Queries about the warranty�, please enter 4"
println "For �Returning faulty goods�, please enter 5"
println "For any other query, please enter 0"
int choice = 100

while (choice == 100) {

String s = System.console().readLine()
choice = Integer.parseInt(s)

switch (choice) {
case 1:
println "Your balance is "
break;
case 2:
println "You can purchase some of our goods using this menu"
break;
case 3:
println "You would like a refund? follow these instructions"
break;
case 4:
println "This menu will give you warranty information"
break;
case 5:
println "Please stay on the line for details on returning your goods"
break;
default:
println "That is not a valid option, please try again"
choice = 100
break
;
}
}
