//
//day 5 - 1a test document

void printNumbers(int n) {
	if (n <= 0) {
		System.out.println("RETURNED FROM " + n);
	return;
	}
	System.out.println("first print of: " + n);
	printNumbers(n-2);
	printNumbers(n-3);
	System.out.println("second print of " + n);
	System.out.println("CURRENT CYCLE ENDS FOR " + n);
}

printNumbers(6);

/*
the answer is 
6	six is printed first as it's n
4	four is printed as its dropped in at 09
2   two is printed as its dropped in at 09 for 4
2   two is printed a second time as 10 cannot be carried out
1   one is printed at line 09 as it is carried out for four
1   one is printed again as both methods just get called back from their base case
4   four is printed as the four cycle has now finished(after passing through 11)
3   three is printed as the six cycle is carried out on line 11
1   one is printed as part of the three cycle from six at line 11
1   one is printed a second time for the three cycle
3   the three cycle is finish and therefore it is printed a second time
6   six is printed as the cycle has been completed totally
*/


