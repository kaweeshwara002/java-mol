class MOL {
    static void b(int x){
        System.out.println(x);
    }
    static void b(int y,String z){
        System.out.println(y + " and " + z);
    }
    static void b(String a,String b){
        System.out.println(a + " " + b);
    }
    static void b(double c){
        System.out.println(c);
    }
    public static void main(String[] args) {
        b(12345);
        b(123,"abc");
        b("54","abcd");
        b(3.89);
    }
}
