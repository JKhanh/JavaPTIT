
package n23_10;


public class Acount {
   private int id;
   private String name;

    public Acount() {
    }

    public Acount(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public Object[] tObject(){
       return new Object[]{
         id,name
       };
   }
}
