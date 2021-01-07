
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Это прототип класса Forge.
 * Упрощенная версия кишков (что под капотом) Forge
 */
public class FMLEvent {

    /**
     * В любой программе есть main метод, иначе программа не запуститься.
     * Если интересно, можешь попробовать найти такой метод в Minecraft с которого все начинается : )
     * То, что ты делаешь - это все интерфейс, придуманный Forge для упрощения разработки
     */
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // Вначале мы находим все классы
        // Это forge делает с помощью библиотек.
        // По сути он просто берет все классы в jar файле и проверяет каждый
        final Class findClass = MyMod.class;

        // Далее forge проверяет, есть ли аннотация в этом классе
        boolean present = findClass.isAnnotationPresent(Mod.class);
        if (present) {
            findClass.newInstance(); // Создаем новый класс и вызываем конструктор
        }
    }

    public static void subscribeOnServerStart(Object anyObject) throws InvocationTargetException, IllegalAccessException {
        // Получаем все методы в классе
        Method[] declaredMethods = anyObject.getClass().getMethods();

        for (Method useMethod: declaredMethods) {
            if (useMethod.isAnnotationPresent(SubscribeOnServerStart.class)) {
                useMethod.invoke(anyObject);
            }
        }
    }
}
