public class Aircraft extends Vehicle {
    private int maxAltitude;
    private boolean isFlying;
    public Aircraft(int id,String brand,String model,int year,int maxAltitude,boolean isFlying){
        super(id, brand, model, year);
        this.maxAltitude=maxAltitude;
        this.isFlying=isFlying;
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: "+super.getId());
        System.out.println("Марка: "+super.GetBrand());
        System.out.println("Модель: "+super.GetModel());
        System.out.println("Год выпуска: "+super.GetYear());
        System.out.println("Максимальная высота полета: "+maxAltitude+" метров");
        System.out.println("Текущий статус состояния полета: "+isFlying);
    }
    @Override
    public void startEngine(){
        System.out.println("Запускаем двигатель");
    }

    @Override
    public void stopEngine(){
        System.out.println("Останавливаем двигатель");
    }

    @Override
    public void accelerate(int speed){

    }
    @Override
    public void brake(){

    }

}
