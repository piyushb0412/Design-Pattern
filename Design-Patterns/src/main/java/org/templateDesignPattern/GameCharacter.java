package org.templateDesignPattern;

abstract class GameCharacter {

    //Template
    public final void takeTurn(){
        prepare();
        executeAction();
        finish();
    }

    //common method
    public void prepare(){
        System.out.println("common method");
    }

    //different methods can have different implementation of this method
    abstract void executeAction();

    //common method
    public void finish(){
        System.out.println("finish");
    }

}
