public class JustFive {
    private static int instanceCount = 0;
    
    private JustFive() {
        if (instanceCount < 5) {
            instanceCount++;
        } else {
            throw new IllegalStateException("Only 5 instances of JustFive are allowed.");
        }
    }

    public static JustFive getInstance() {
        return new JustFive();
    }

    public static void main(String[] args) {
        try {
            JustFive instance1 = JustFive.getInstance();
            JustFive instance2 = JustFive.getInstance();
            JustFive instance3 = JustFive.getInstance();
            JustFive instance4 = JustFive.getInstance();
            JustFive instance5 = JustFive.getInstance();
            JustFive instance6 = JustFive.getInstance(); // This will throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
