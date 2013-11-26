//Example of an if statement

int positives = 0 
int negatives = 0
int zero = 0
boolean ended = false



while (!ended) {
println "Enter a number, or type END to finish: "

String user_input = System.console().readLine()

if (user_input == "END") {
ended = true
println "There were " + positives + " positive inputs"
println "There were " + negatives + " negative inputs"
println "There were " + zero + " zero inputs"
}

int i = Integer.parseInt(user_input)
if (i == 0) {
zero = zero + 1
} else {
if (i >= 1) { 
positives = positives + 1
} else {
if (i <= -1) {
negatives = negatives + 1
}
}
}
