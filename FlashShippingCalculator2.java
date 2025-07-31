import java.util.Scanner;

// นี่คือคลาสที่มีชื่อว่า FlashShippingCalculator2 และเป็น abstract class
// และเรากำหนดให้คลาสนี้สืบทอด (implements) อินเทอร์เฟซ(interface) ที่ชื่อว่า ShippingCalculator
public abstract class FlashShippingCalculator2 implements ShippingCalculator {
    // นี่คือเมธอด main ซึ่งเป็นจุดเริ่มต้นของโปรแกรม
    public static void main(String[] args) {
        // เราจะใช้ Scanner เพื่อรับข้อมูลจากผู้ใช้ผ่านทางคีย์บอร์ด
        Scanner scanner = new Scanner(System.in);

        // แสดงข้อความให้ผู้ใช้เลือกประเภทการจัดส่ง (1: กรุงเทพ, 2: กรุงเทพ-ต่างจังหวัด)
        System.out.print("โปรดเลือกประเภทการจัดส่ง (1: กรุงเทพ, 2: กรุงเทพ-ต่างจังหวัด): ");
        // ประกาศตัวแปร shippingType เพื่อรับข้อมูลประเภทการจัดส่งที่ผู้ใช้เลือก 
        int shippingType = scanner.nextInt();
        
        // ประกาศตัวแปรสำหรับเก็บข้อมูลน้ำหนักและขนาดกล่อง
        double weight, width, length, height;

        // ตรวจสอบประเภทการจัดส่งที่ผู้ใช้เลือก ถ้าเป็น 1 ให้ทำ
        if (shippingType == 1) {
            // กรุงเทพ: รับข้อมูลเกี่ยวกับขนาดกล่อง
            System.out.print("น้ำหนัก (กรัม): ");
            weight = scanner.nextDouble();
            System.out.print("ความกว้าง (เซนติเมตร): ");
            width = scanner.nextDouble();
            System.out.print("ความยาว (เซนติเมตร): ");
            length = scanner.nextDouble();
            System.out.print("ความสูง (เซนติเมตร): ");
            height = scanner.nextDouble();
            
            // สร้างอ็อบเจกต์ของคลาส BangkokShippingCalculator ซึ่งเป็นตัวอย่างของ ShippingCalculator
            ShippingCalculator calculator = new BangkokShippingCalculator();

            // เรียกใช้เมธอด calculateShippingCost เพื่อคำนวณค่าจัดส่ง
            double shippingCost = calculator.calculateShippingCost(weight, width, length, height);

            // แสดงผลลัพธ์ค่าจัดส่งที่คำนวณได้
            System.out.println("ค่าจัดส่ง: " + shippingCost + " บาท");
        } else if (shippingType == 2) {
            // กรุงเทพ-ต่างจังหวัด: รับข้อมูลเกี่ยวกับขนาดกล่อง
            System.out.print("น้ำหนัก (กรัม): ");
            weight = scanner.nextDouble();
            System.out.print("ความกว้าง (เซนติเมตร): ");
            width = scanner.nextDouble();
            System.out.print("ความยาว (เซนติเมตร): ");
            length = scanner.nextDouble();
            System.out.print("ความสูง (เซนติเมตร): ");
            height = scanner.nextDouble();
            
           // สร้างอ็อบเจกต์ของคลาส OtherProvincesShippingCalculator ซึ่งเป็นตัวอย่างของ ShippingCalculator
            ShippingCalculator calculator = new OtherProvincesShippingCalculator();

            // เรียกใช้เมธอด calculateShippingCost เพื่อคำนวณค่าจัดส่ง
            double shippingCost = calculator.calculateShippingCost(weight, width, length, height);

            // แสดงผลลัพธ์ค่าจัดส่งที่คำนวณได้
            System.out.println("ค่าจัดส่ง: " + shippingCost + " บาท");
        } else {
             // ถ้าผู้ใช้เลือกประเภทการจัดส่งที่ไม่ถูกต้อง(user กด เป็นตัวเลขอื่นมาที่ไม่ใช่ 1,2)ให้ print ประเภทการจัดส่งไม่ถูกต้อง
            System.out.println("ประเภทการจัดส่งไม่ถูกต้อง");
        }
        // ปิด Scanner เพื่อป้องกันการรั่วของทรัพยากร
        scanner.close();
    }
    // เมธอดนี้เป็น abstract ที่ต้องถูกOverrideในคลาสที่สืบทอด FlashShippingCalculator2
    protected abstract double calculateShippingCostInBangkok(double weight, double width, double length, double height);
    // เมธอดนี้เป็น abstract ที่ต้องถูกOverrideในคลาสที่สืบทอด FlashShippingCalculator2
    protected abstract double calculateShippingCostToOtherProvinces(double weight, double width, double length, double height);
}