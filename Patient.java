public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private int phoneNumber;
    private double BMI;

    public Patient(int id, String name, int birthYear, double height, double weight,String bloodGroup, int phoneNumber){
            if(id > 0){
                this.id = id;
            }else this.id = 0;
            this.name = name;
            this.birthYear = birthYear;
            if(height > 0 ){
                this.height = height;
            }else {
                this.height = 0;
                System.out.println("Height Error");
//                System.out.println("Set Height Default");
            }
            if(weight > 0){
                this.weight = weight;
            }else {
                this.weight = 0;
                System.out.println("Weight Error");
//                System.out.println("Set Weight Default");
            }
            this.bloodGroup = bloodGroup;
            this.phoneNumber = phoneNumber;

    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        if(getAge(currentYear) > 0){
        System.out.println("Patient Age: " + getAge(currentYear));
        }else {
            System.out.println("Age Error");
        }
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group: " + getBloodGroup());
        System.out.println("Patient Phone Number: " + getPhoneNumber());
        System.out.println("---------------------------------------");
        System.out.println("The calculated BMI : " + getBMI());
        System.out.println("---------------------------------------");
    }

    public int getAge(int currentYear){
        if(currentYear > 0){
            return currentYear-birthYear;
        }else return 0;
    }

    public double getBMI(){
        if(height > 0 && weight > 0){
            return BMI = weight/((height/100)*(height/100));
        }else return 0.0;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getBloodGroup(){
        return this.bloodGroup;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }
}
