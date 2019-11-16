import model.Student;
public class Output {
    public static void main(String[] args) {
        model.Student student1 = new model.Student("Hilary", 22,"Female","12345678");
        System.out.println("Name: "+ student1.getName()+ ", Age: "+ student1.getAge()+", Gender: "+student1.getGender()+", ID_NO: "+student1.getID_NO());
    }
}
