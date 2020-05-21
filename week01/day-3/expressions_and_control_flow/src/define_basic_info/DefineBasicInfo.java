package define_basic_info;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String name = "Eszter Greskovics";
        Integer age = 35;
        double height = 1.76;
        boolean married = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");

        if (married == true)
            System.out.println("Married");
        else
            System.out.println("Not married");


    }
}
