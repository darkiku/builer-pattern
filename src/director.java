public class director {
    Builder builder;
    public director(Builder builder){
        this.builder = builder;
    }

    public Car buildBmw(){
        return builder.withColor("Red").withEngine("V8").withModel("Bmw").withSeats(4).build();
    }
    public Car buildMercedes(){
        return builder.withColor("Blue").withSeats(5).withModel("Benz").withEngine("V12").build();
    }
}
