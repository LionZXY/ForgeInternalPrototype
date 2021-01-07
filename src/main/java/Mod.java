import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотации - это инструмент для маркировки в Java
 * Ты можешь аннотацие пометить класс, метод или переменную
 *
 * Подробнее
 * https://habr.com/ru/post/139736/
 */
@Retention(RetentionPolicy.RUNTIME) // Как долго живет аннотация
public @interface Mod {
    /**
     * У аннотаций могут быть параметры. Это примерно такие же классы/интерфейсы как и обычные
     */
    String value();
}
