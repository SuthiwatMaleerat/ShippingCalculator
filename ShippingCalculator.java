// นี่คืออินเทอร์เฟซ ShippingCalculator 
public interface ShippingCalculator {
    // นี่คือเมธอดที่ต้องถูกประกาศในคลาสที่ใช้อินเทอร์เฟซ ShippingCalculator
    // เมธอดนี้ใช้ในการคำนวณค่าจัดส่งของสินค้า
    // โดยรับข้อมูลเกี่ยวกับน้ำหนัก ความกว้าง ความยาว และความสูง
    double calculateShippingCost(double weight, double width, double length, double height);
}