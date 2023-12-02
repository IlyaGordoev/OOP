# Описание решения

1. В классе *Animal* добавил методы **to go, fly, swim**.

2. Создал два класса **Fish** и **Duck** наследника Animal.
3. В main добился того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят).
Реализовано двумя способами.  
1-ый  
В классе *Animal* метод **toGo** включает в себя оператор if с проверкой класса на соответствие *Fish*:
```java
public void toGo(){
    if (getClass() == Fish.class){
        System.out.println(getClass().getSimpleName()+" don't walk");
    }
    else{
        System.out.println(getClass().getSimpleName()+" to go");
    }
}
```
2-ый
В классе *Cat* переопределил метод **fly**:
```java
@Override
public void fly() {
    System.out.println(getClass().getSimpleName() + " no fly");
}
```
В классе *Dog* переопределил метод **fly** c оператором if:
```java
    @Override
    public void fly() {
        if (getName().equals("Belka")) {
            System.out.println(getClass().getSimpleName() + " " + getName() + " flew because of the astranaft");
        }
        else {
            System.out.println(getClass().getSimpleName() + " " + getName() + " only Belka and Strelka fly");
        }
    }
```
В классе *main* создал экземпляр класса *Dog*:
```java
Dog dog1 = new Dog("Belka",new Chumka("aerophobia"),"Korolev" ,LocalDate.of(1960,8,19));
```
И вызвал методы для проверки:
```java
        fish.toGo();
        dog.fly();
        dog1.fly();
        cat.fly();
        duck.fly();
```
Полученный результат:

>Fish don't walk  
>Dog Bobik only Belka and Strelka fly  
>Dog Belka flew because of the astranaft  
>Cat no fly  
>Duck to fly  