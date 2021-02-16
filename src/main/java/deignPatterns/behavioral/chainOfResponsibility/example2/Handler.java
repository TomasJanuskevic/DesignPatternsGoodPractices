package deignPatterns.behavioral.chainOfResponsibility.example2;

public interface Handler {

    void setHandler(Handler handler);
     void process (File file);
     String getHandlerName();
}
