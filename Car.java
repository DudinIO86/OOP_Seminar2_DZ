/*
Наследует от Vehicle.
Реализует методы абстрактного класса displayInfo.
Добавляет свойства: int fuelCapacity (емкость топливного бака), int currentFuelLevel (текущий уровень топлива).
Реализует методы:
void startEngine() - запуск двигателя автомобиля.
void stopEngine() - остановка двигателя автомобиля.
void accelerate(int speed) - увеличение скорости автомобиля на указанное значение.
void brake() - прекращение движения автомобиля.
void refuel(int liters) - заправка автомобиля (увеличение уровня топлива).
 */
public class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel;
    public Car(int id,String brand,String model,int year,int fuelCapacity,int currentFuelLevel){
        super(id, brand, model, year);
        this.fuelCapacity=fuelCapacity;
        this.currentFuelLevel=currentFuelLevel;
    }
    @Override
    public void displayInfo(){
        System.out.println("ID: "+super.getId());
        System.out.println("Марка: "+super.GetBrand());
        System.out.println("Модель: "+super.GetModel());
        System.out.println("Год выпуска: "+super.GetYear());
        System.out.println("Емкость топливного бака: "+fuelCapacity+" литров");
        System.out.println("Текущий уровень топлива: "+currentFuelLevel+" литров");
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
    public void brake(){
        System.out.println("Прекращаем движение");
    }

    @Override
    public void accelerate(int speed){
        System.out.println("Увеличиваем скорость на "+speed+" км/ч");
    }

    public void refuel (int liters){
        System.out.println("Заправлено "+liters+" литров бензина");
    }



}
