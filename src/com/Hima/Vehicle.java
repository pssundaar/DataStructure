package com.Hima;

public class Vehicle implements Cloneable {
    private String engine;
    private int wheels;
    private int airBags;

    static class VehicleBuilder{
        private String engine;
        private int wheels;
        private int airBags;
        public VehicleBuilder(String engine, int wheels){
            this.engine=engine;
            this.wheels=wheels;
        }
        public VehicleBuilder setAirBag(int airBag){
            this.airBags=airBag;
            return this;
        }
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
    public Vehicle(VehicleBuilder builder){
        this.engine= builder.engine;
        this.wheels= builder.wheels;;
        this.airBags= builder.airBags;
    }
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getAirBags() {
        return airBags;
    }

    public void setAirBags(int airBags) {
        this.airBags = airBags;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle Car= new VehicleBuilder("1000", 4)
                .setAirBag(8)
                .build();

        System.out.println(Car.engine+" "+ Car.airBags);
        System.out.println(Car.getAirBags()+" "+ Car.getEngine());
        Vehicle car2= (Vehicle) Car.clone();

    }
}
