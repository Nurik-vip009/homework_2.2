public class Child_4 extends Parent implements printTable{
  private boolean child_4Property;

  public Child_4(String parentProperty, boolean b) {
    super(parentProperty);
    this.child_4Property = child_4Property;
  }

  public boolean isChild_4Property() {
    return child_4Property;
  }

  public void setChild_4Property(boolean child_4Property) {
    this.child_4Property = child_4Property;
  }

  public void print(){
    System.out.println("Class 4 properties: ");
    System.out.println("Parent properties: " + getParentProperty());
    System.out.println("Child_4 properties:" + isChild_4Property());
  }
}
