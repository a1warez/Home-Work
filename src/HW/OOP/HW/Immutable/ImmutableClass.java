package HW.OOP.HW.Immutable;

import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
  private final String name;
  private final List<Integer> numbers;
  private CustomMutableClass CustomMutableClass;


    /**
     * Конструктор для создания объекта класса
     * @param name имя тип String
     * @param numbers лист чисел тип Integer
     * @param CustomMutableClass тип класс CustomMutableClass
     */
    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass CustomMutableClass) {
        this.name = name;
        this.numbers = numbers;
        this.CustomMutableClass = new CustomMutableClass(CustomMutableClass);
    }

    @Override
    /**
    * Переопределение toString
    */
    public String toString() {
        return "ImmutableClass{" + "name='" + name + '\'' + ", numbers=" + numbers +
                ", CustomMutableClass=" + CustomMutableClass + '}';
    }

    @Override
    /**
    * Переопределение equals
    */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name)
                && Objects.equals(numbers, that.numbers)
                && Objects.equals(CustomMutableClass, that.CustomMutableClass);
    }

    @Override
    /**
     * Переопределение hashCode
     */
    public int hashCode() {
        return Objects.hash(name, numbers, CustomMutableClass);
    }
}

class CustomMutableClass{
    int value;

    /**
     * Конструктор для создания объекта класса
     * @param value значение int
     */
    public CustomMutableClass(int value) {
        this.value = value;
    }

    /**
     * Конструктор для создания объекта класса
     * @param other значение CustomMutableClass other
     */
    public CustomMutableClass(CustomMutableClass other){
        this.value = other.value;
    }

    /**
     * Получает значение int value
     * @return Возвращает полученное значение int value
     */
    public int getValue() {
        return value;
    }

    /**
     * Изменяет значение int value
     * @param value значение int
     */
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    /**
     * Переопределение toString
     */
    public String toString() {
        return "CustomMutableClass{" + "value=" + value + '}';
    }
}
