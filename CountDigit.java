class CountDigit {
    public static void main(String[] args) {
        int n=-7789;
        int c=(int)  Math.log10(Math.abs(n))+1;
        // while(n!=0){
        //     n/=10;
        //     c++;
        // }
        System.out.println(c);
        
    }
}
