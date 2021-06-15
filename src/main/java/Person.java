public class Person {
    private String name;
    private boolean isCool;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, boolean cool){
        this.name = name;
        this.isCool = cool;
    }

    public boolean isCool() {
        return isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }
}
