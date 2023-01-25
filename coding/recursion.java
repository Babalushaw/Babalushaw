class recursion {
    public static int solve(int n){
        if(n<=0){return 0;}
        int x=n+solve(n-1);
        System.out.println(x);
        return x;
    }
    public static void main(String[] args) {
        System.out.print(solve(10));
    }
}
