package methodoverriding;

public class BMW extends car {

    public void theftsafety() {
        System.out.println(" BMW--Theft safety");

    }
    // iam adding this comment to learn git

    @Override // in the overriding method the child and parent class methods
              // should have the same argument
    public void start() {
        System.out.println("BMW--car start");// whenever a method is present in
                                             // the parent as well as child
                                             // class, preference is given to
                                             // the child class method
        // same name same number of arguments is method overriding

    }
}
