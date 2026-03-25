public class UnaryOperator {
    public static void main(String[] args) {
        int x=5;
        System.out.println("Original:"+x);
        //x++ (Post increment)
        System.out.println("Post Increment: "+(x++));//5
        System.out.println("After increment: "+x);//6
        System.out.println("Pre Increment: "+(+x));//5
        System.out.println("After Increment: "+x);
        System.out.println("Post Decrement: "+(x--));

    }
}
