public class Child_2 extends Parent implements printTable {

    private int child_2Property;

    public Child_2(String parentProperty, int i) {
        super(parentProperty);
        this.child_2Property = child_2Property;
    }

    public int getChild_2Property() {
        return child_2Property;
    }

    public void setChild_2Property(int child_2Property) {
        this.child_2Property = child_2Property;
    }

    public void print(){
        System.out.println("Class 2 properties: ");
        System.out.println("Parent property: " + getParentProperty());
        System.out.println("Child_2 property: " + getChild_2Property());
    }
}
