// นี่คือคลาส OtherProvincesShippingCalculator ซึ่งเป็นคลาสที่สืบทอดมาจาก FlashShippingCalculator2
// คลาสนี้ใช้สำหรับคำนวณค่าจัดส่งไปยังต่างจังหวัด
public class OtherProvincesShippingCalculator extends FlashShippingCalculator2 {
    @Override
    // เมธอดนี้Overrideเมธอด calculateShippingCostToOtherProvincesในคลาสหลัก(FlashShippingCalculator2)
    protected double calculateShippingCostToOtherProvinces(double weight, double width, double length, double height) {
        // โค้ดคำนวณค่าจัดส่งไปยังต่างจังหวัด
        double dimension = width + length + height;

        if (dimension >= 40 && dimension <= 280) {
            int[] dimensions = {40, 50, 60, 70, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280};
            double[] shippingCosts = {35, 40, 45, 50, 55, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500};

            for (int i = 0; i < dimensions.length; i++) {
                if (dimension <= dimensions[i]) {
                    return shippingCosts[i];
                }
            }
        } else {
            if (weight >= 1 && weight <= 50) {
                int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
                double[] shippingCosts = {35, 40, 45, 50, 55, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500};

                for (int i = 0; i < weights.length; i++) {
                    if (weight <= weights[i]) {
                        return shippingCosts[i];
                    }
                }
            }
        }

        return 0.0; // ค่าจัดส่งเริ่มต้นหรือค่าไม่ถูกต้อง
    }

    @Override
    // เมธอดนี้Overrideเมธอด calculateShippingCostInBangkok ในคลาสหลัก(FlashShippingCalculator2)
    protected double calculateShippingCostInBangkok(double weight, double width, double length, double height) {
         // โค้ดคำนวณค่าจัดส่งในกรุงเทพ
        double dimension = width + length + height;
    
        if (dimension >= 40 && dimension <= 280) {
            int[] dimensions = {40, 50, 60, 70, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280};
            double[] shippingCosts = {25, 30, 35, 40, 45, 60, 75, 90, 105, 120, 135, 150, 165, 180, 195, 210, 225, 240, 255, 270, 285, 300, 315, 330, 345, 360, 375, 390, 405, 420, 435, 450, 465, 480, 495, 510, 525, 540, 555, 570, 585, 600, 615, 630, 645, 660, 675, 690, 705, 720};
    
            for (int i = 0; i < dimensions.length; i++) {
                if (dimension <= dimensions[i]) {
                    return shippingCosts[i];
                }
            }
        } else {
            if (weight >= 1 && weight <= 50) {
                int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
                double[] shippingCosts = {25, 30, 35, 40, 45, 60, 75, 90, 105, 120, 135, 150, 165, 180, 195, 210, 225, 240, 255, 270, 285, 300, 315, 330, 345, 360, 375, 390, 405, 420, 435, 450, 465, 480, 495, 510, 525, 540, 555, 570, 585, 600, 615, 630, 645, 660, 675, 690, 705, 720};
    
                for (int i = 0; i < weights.length; i++) {
                    if (weight <= weights[i]) {
                        return shippingCosts[i];
                    }
                }
            }
        }
    
        return 0.0; // ค่าจัดส่งเริ่มต้นหรือค่าไม่ถูกต้อง
    }

    @Override
    // เมธอดนี้ถูกOverrideจากอินเทอร์เฟซ ShippingCalculator เพื่อให้คำนวณค่าจัดส่งทั้งหมด
    public double calculateShippingCost(double weight, double width, double length, double height) {
        return calculateShippingCostToOtherProvinces(weight, width, length, height);
    }
}