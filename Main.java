// Інтерфейс, який визначає спільні методи для оригінального об'єкта та його замісника
interface RealObject {
    void performAction();
}

// Реальний об'єкт, з яким клієнт працює напряму
class RealObjectImpl implements RealObject {
    @Override
    public void performAction() {
        System.out.println("Реальний об'єкт виконує дію");
    }
}

// Замісник (Proxy), який контролює доступ до оригінального об'єкта
class ProxyObject implements RealObject {
    private RealObject realObject;

    @Override
    public void performAction() {
        // Ініціалізація реального об'єкта при потребі
        if (realObject == null) {
            realObject = new RealObjectImpl();
        }

        // Додаткова логіка перед викликом оригінального об'єкта
        System.out.println("Замісник виконує підготовчі дії");

        // Виклик методу реального об'єкта
        realObject.performAction();

        // Додаткова логіка після виклику оригінального об'єкта
        System.out.println("Замісник виконує завершальні дії");
    }
}

