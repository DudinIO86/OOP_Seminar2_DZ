/*
```задание, включающее в себя использование абстрактных классов, интерфейсов и принципов ООП (инкапсуляции, наследования и полиморфизма):

Задание: Разработка системы управления транспортными средствами

Создайте систему управления транспортными средствами с использованием принципов объектно-ориентированного программирования. В системе должны присутствовать следующие классы и интерфейсы:

Абстрактный класс Vehicle:

Содержит общие свойства и методы для всех видов транспортных средств.
Свойства: int id (уникальный идентификатор), String brand (марка), String model (модель), int year (год выпуска).
Методы:
void startEngine() - запуск двигателя (реализация в подклассах).
void stopEngine() - остановка двигателя (реализация в подклассах).
void accelerate(int speed) - увеличение скорости на указанное значение (реализация в подклассах).
void brake() - прекращение движения (реализация в подклассах).
abstract void displayInfo() - вывод информации о транспортном средстве (реализация в подклассах).
Интерфейс Flyable (летающие транспортные средства):

Методы: void takeOff(), void land().
Интерфейс Swimmable (плавающие транспортные средства):

Методы: void startSwimming(), void stopSwimming().
Класс Car (автомобили):

Наследует от Vehicle.
Реализует методы абстрактного класса displayInfo.
Добавляет свойства: int fuelCapacity (емкость топливного бака), int currentFuelLevel (текущий уровень топлива).
Реализует методы:
void startEngine() - запуск двигателя автомобиля.
void stopEngine() - остановка двигателя автомобиля.
void accelerate(int speed) - увеличение скорости автомобиля на указанное значение.
void brake() - прекращение движения автомобиля.
void refuel(int liters) - заправка автомобиля (увеличение уровня топлива).
Класс Aircraft (самолеты):

Наследует от Vehicle.
Реализует методы абстрактного класса displayInfo.
Реализует методы интерфейса Flyable.
Добавляет свойства: int maxAltitude (максимальная высота полета), boolean isFlying (флаг состояния полета).
Реализует методы:
void startEngine() - запуск двигателя самолета.
void stopEngine() - остановка двигателя самолета.
void takeOff() - взлет самолета.
void land() - посадка самолета.
Класс Boat (лодки):

Наследует от Vehicle.
Реализует методы абстрактного класса displayInfo.
Реализует методы интерфейса Swimmable.
Добавляет свойства: int maxSpeed (максимальная скорость на воде), boolean isSailing (флаг состояния движения по воде).
Реализует методы:
void startEngine() - запуск двигателя лодки.
void stopEngine() - остановка двигателя лодки.
void startSwimming() - начало движения лодки по воде.
void stopSwimming() - прекращение движения лодки по воде.
Главный класс Main для проверки:

Создайте объекты различных транспортных средств (автомобиль, самолет, лодка).
Продемонстрируйте их работу, вызывая соответствующие методы (запуск двигателя, движение, взлет, посадка и т.д.).
Выведите информацию о каждом транспортном средстве с использованием метода displayInfo.
 */


public class Main {
    public static void main(String[] args) {
        Car car=new Car(1254,"Toyota","Camry",2019,55,50);
        Aircraft aircraft=new Aircraft(432,"Maxi","Flyer",2020,500,true);
        Boat boat=new Boat(678,"Ikar","T1000",2020,120,true);

        System.out.println("АВТОМОБИЛЬ");

        car.displayInfo();
        System.out.println();
        car.startEngine();
        car.accelerate(50);
        car.brake();
        car.stopEngine();
        car.refuel(5);
        System.out.println();

        System.out.println("САМОЛЕТ");

        aircraft.displayInfo();
        System.out.println();
        aircraft.startEngine();
        Flyable.takeoff();
        Flyable.land();
        aircraft.stopEngine();
        System.out.println();

        System.out.println("ЛОДКА");
        boat.displayInfo();
        System.out.println();
        boat.startEngine();
        Swimmable.startSwimming();
        Swimmable.stopSwimming();
        boat.stopEngine();

    }
}
