public class car {
    private String Color;
    private String Brand;
    private int  Year;

    public String getColor(){
        return this.Color;
    }

    public String getBrand(){
        return this.Brand;
    }

    public int getYear(){
        return this.Year;
    }

    public void setBrand(String Brand){
        this.Brand = Brand;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public void setYear(int Year){
        this.Year = Year;
    }
    //color
    //brand
    //year
    public static void main(String[] args) {
        // 2 car objects
        // set and get
        car c1 = new car();
        c1.setBrand("Toyota");
        c1.setColor("Red");
        c1.setYear(2023);
        System.out.println(c1.getYear());

        car c2 = new car();


    }
}
