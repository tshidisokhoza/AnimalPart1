public class Animal {
    private String name;

    public void sound(){
        System.out.println("sound...");
    }

    public void eat(){
        System.out.println(getName() +"eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
