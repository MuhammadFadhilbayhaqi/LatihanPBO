public class ExtarnalFilter {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "External Filter {" + type + "}";
    }
}