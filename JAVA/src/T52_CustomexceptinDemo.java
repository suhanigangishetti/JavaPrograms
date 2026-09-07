class AgeException extends Exception {

    AgeException(String msg) {
        super(msg);
    }

    AgeException() {
    }
}

class Customer6 {

    void setAge(int age) throws AgeException {

        if (age < 18 || age > 60) {
            throw new AgeException("Age should be between 18 and 60");
        } else {
            System.out.println("Your age: " + age);
        }
    }
}

public class T52_CustomexceptinDemo {

    public static void main(String[] args) {

        Customer6 c = new Customer6();

        try {
            int age = Integer.parseInt(args[0]);
            c.setAge(age);
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}