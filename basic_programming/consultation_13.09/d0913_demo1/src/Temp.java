public class Temp {
    Integer value;

    public Temp(Integer value) {
        this.value = value;
    }

    public int hashCode(){
        return value.intValue();
    }
}
