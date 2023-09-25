public enum Color3 {
    GREEN(10, "зел."),
    BLUE(20, "син."),
    RED(30, "кр."),
    BLACK(0, "ч.");

    private int intValue;
    private String stringValue;

    Color3(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    @Override
    public String toString() {
        return "Color3{" +
                "intValue=" + intValue +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }
}
