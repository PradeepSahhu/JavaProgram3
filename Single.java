
class Inherit {

    public void Running() {
        System.out.println("This is running");
    }

}

class Base extends Inherit {

    public void doIt() {
        System.out.println("This is ok");
    }

}

public class Single {

    public static void main(String[] args) {

        Base obj = new Base();
        obj.doIt();
        obj.Running();

    }

}
