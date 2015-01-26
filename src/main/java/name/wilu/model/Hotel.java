package name.wilu.model;

public class Hotel {

    private String name, city;

    public Hotel() {
        System.out.println("Automatic hotel init!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name='" + name + '\'' + ", city='" + city + '\'' + '}';
    }

}
