package Creational.Prototype;

// в Java есть готовый интерфейс Cloneable
public interface Prototype {
    public static Prototype createRedPoint() {
        // найти в реестре нужный прототип и клонировать его
        return Program.protos.get("red").Clone();
    }

    Prototype Clone();
}

