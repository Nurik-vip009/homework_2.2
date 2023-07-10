public class Main {
    public static void main(String[] args) {
       Parent[] objects = new Parent[3];

       objects[0] = createObject("2й");
       objects[1] = createObject("3й");
       objects[2] = createObject("4й");

       for (Parent object : objects) {
           if (object instanceof printTable){
               printTable printTable = (printTable) object;
               printTable.print();
           }
       }
    }
    public static Parent createObject(String className){
        switch (className){
            case "2й":
                return new Child_2("Parent Property 1", 10);
            case  "3й":
                return new Child_3("Parent Property 2", 3.14);
            case "4й":
                return new Child_4("Parent Property 3", true);
            default:
                throw new IllegalArgumentException("Неизвестный класс: " + className);
        }
    }
}