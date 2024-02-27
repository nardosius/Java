@FunctionalInterface
public interface Operation<T>  {//functional Interface. Only has one abstract method
    T operate(T value1, T value2);
}
