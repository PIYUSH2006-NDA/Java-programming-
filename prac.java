class d {
    int num;

    d(int num) {
     this.num=num;
    }

    void dis() {
        System.out.println("the num is:- " + num);
    }
}

public class prac {
    public static void main(String[] args) {
        d dk = new d(1);
        dk.dis();
    }
}
