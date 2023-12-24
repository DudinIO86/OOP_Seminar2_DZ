public class Boat extends Vehicle{
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int id,String brand,String model,int year,int maxSpeed,boolean isSailing){
        super(id, brand, model, year);
        this.maxSpeed=maxSpeed;
        this.isSailing=isSailing;
    }

    @Override
    public void displayInfo(){
        System.out.println("ID: "+super.getId());
        System.out.println("Марка: "+super.GetBrand());
        System.out.println("Модель: "+super.GetModel());
        System.out.println("Год выпуска: "+super.GetYear());
        System.out.println("Максимальная скорость на воде: "+maxSpeed+" км/ч");
        System.out.println("Текущий статус состояния движения: "+isSailing);
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
