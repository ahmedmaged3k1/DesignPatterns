package com.example.designpatterns.behavioralDesignPatterns.chainOfResponibilityPattren;

public abstract class AbstractLogger {
    public   static  int info  = 1;
    public   static  int debug = 2 ;
    public  static  int error = 3 ;
    protected   int level ;
    private  AbstractLogger nextLogger ;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}
