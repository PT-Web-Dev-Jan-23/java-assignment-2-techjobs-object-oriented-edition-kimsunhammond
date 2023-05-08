package org.launchcode.techjobs.oo;

public abstract class JobField {

//    What fields do ALL FOUR of the classes have in common?

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

//    Which constructors are the same in ALL FOUR classes?

    public JobField(String value) {
        this();
        this.value = value;
    }

//    What getters and setters do ALL of the classes share?

    public int getId() {
        return id;
    }

// //   public void setId(int id) {
//        this.id = id;
//    }

//    Which custom methods are identical in ALL of the classes?

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        if (value.equals("") || value.equals(null)) {
            return "Data not available";
        } else {
            return value;
        }
    }
}
