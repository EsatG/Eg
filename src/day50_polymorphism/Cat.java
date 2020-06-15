package day50_polymorphism;

public final class Cat extends Animal {    // it can not be overridden since this class is final

    public String catName;

    public Cat(String catName,String gender, int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Cat " + catName +  " is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat " + catName + " is sleeping");
    }

    public  void scratch(){
        System.out.println("Cat " + catName + " is scratching");

    }

}
