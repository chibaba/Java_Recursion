public class RunAndStop {
    public static void main(String[] args) {
        RunAndStop runAndStop = new RunAndStop();
        System.out.println( runAndStop.add(1));
    }
    public int add(int num) {
        if (num < 100) {
            return add(num + 1);
        }
        return num;
    }
}
