class throwsuse {

    void check() throws ArithmeticException {
        int a = 10/0;
    }

    public static void main(String[] args) {
        throwsuse t = new throwsuse();
        try {
            t.check();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
