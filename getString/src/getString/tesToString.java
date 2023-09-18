package getString;


public class tesToString {
    private int id;
    private String name;

    public tesToString(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "tesToString{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
    	tesToString obj = new tesToString(1, "NOME");
        System.out.println(obj.toString()); // Calls the overridden toString() method
    }
}