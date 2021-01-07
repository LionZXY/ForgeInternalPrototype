import java.lang.reflect.InvocationTargetException;

@Mod("AnyString")
public class MyMod {
    public MyMod() throws InvocationTargetException, IllegalAccessException {
        // Это вызывается сразу после создания нового инстанса класса
        FMLEvent.subscribeOnServerStart(this);
    }

    @SubscribeOnServerStart
    public void someMethod() {
        // Тут наш метод
    }
}
