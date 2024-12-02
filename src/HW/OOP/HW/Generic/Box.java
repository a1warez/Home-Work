package HW.OOP.HW.Generic;

public class Box<T> {
    private T object;
    private int num = 0;

    /**
     * Конструктор для создания объекта класса
     * @param object объекта класса
     */
    public Box(T object) {
        this.object = object;
        num++;
    }

    /**
     * Получает значение объекта класса
     * @return Возвращает полученное значение объекта класса
     */
    public T getObject() {
        return object;
    }

    /**
     * Изменяет значение объекта класса
     * @param object объект класса
     */
    public void setObject(T object) {
        this.object = object;
    }

    /**
     *  Проверяет, является ли данный объект пустым
     * @return Возвращает true, если в объект нет элементов, и false, если в нём есть элемент
     */
    public boolean isEmpty() {
        if (this.object == null){
            return true;
        }else {
            return false;
        }
    }

    /**
     *  Удаляет все элементы объекта
     */
    public void clear () {
        this.object = null;
    }
}
