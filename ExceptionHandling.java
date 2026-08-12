class ExceptionHandling {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter the array index: ");
            int index = sc.nextInt();
            System.out.println("Array element = " + numbers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        sc.close();
    }
}