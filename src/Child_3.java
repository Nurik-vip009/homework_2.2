public class Child_3 extends Parent implements printTable{
    private double child_3Property;

    public Child_3(String parentProperty, double v) {
        super(parentProperty);
        this.child_3Property = child_3Property;
    }

    public double getChild_3Property() {
        return child_3Property;
    }

    public void setChild_3Property(double child_3Property) {
        this.child_3Property = child_3Property;
    }

    public void print(){
        System.out.println("Class 3 properties: ");
        System.out.println("Parent properties: " + getParentProperty());
        System.out.println("Child_3: " + getChild_3Property());
    }
}
