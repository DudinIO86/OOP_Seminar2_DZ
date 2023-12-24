public abstract class Vehicle {
    private int id;//уникальный индентификатор
    private String brand;//марка
    private String model;//модель
    private int year;//год выпуска

    public Vehicle(int id,String brand,String model,int year){
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public abstract void startEngine();//запуск двигателя
    public abstract void stopEngine();//остановка двигателя
    public abstract void accelerate(int speed);//увеличение скорости на указанное значение
    public abstract void brake();//прекращение движения
    public abstract void displayInfo();//вывод информации о транспортном средстве

    public int getId(){
        return id;
    }
    public String GetBrand(){
        return brand;
    }
    public String GetModel(){
        return model;
    }

    public int GetYear(){
        return year;
    }

}
