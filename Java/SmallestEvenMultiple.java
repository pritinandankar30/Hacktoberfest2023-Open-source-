class SmallestEvenMultiple {
  public int smallEven(int n) {
    int i=1;
    while(n>0) {
      if(i%n==0 && i%2==0) {
        return i;
    }
      i++;
  }
    return 0;
}
