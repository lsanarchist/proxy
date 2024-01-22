// Клієнтський код
public class ProxyPatternExample {
    public static void main(String[] args) {
        // Клієнт працює через замісник, не прямо з реальним об'єктом
        RealObject proxy = new ProxyObject();
        proxy.performAction();
    }
}
