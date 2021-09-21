package GetSet;

public class SettersGetters {
    //this is an example of encapsulation
    private int size;

    //making the getter method public
    public int getSize(){
        return size;
    }

    // this is making the setter method public as well
    public void setSize(int s){
        size = s;
    }

    // example code bellow

    Void bark(){
        if (size>60){
            System.out.println("WOOOF WOOOF MF");
        } else if (size >14){
            System.out.println("Ruff ruff");
        }else {
            System.out.println("rawr");
        }
        return bark();
    }


}
