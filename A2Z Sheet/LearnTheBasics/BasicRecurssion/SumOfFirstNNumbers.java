class SumOfFirstNNumbers {
    public int NnumbersSum(int N) {
       if(N==0)
       return 0;
       return N+NnumbersSum(N-1); //your code goes here
    }
}
