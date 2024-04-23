public class NextDate {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2012;
        
        // Gọi hàm để tính ngày kế tiếp
        String nextDate = calculateNextDate(day, month, year);
        System.out.println("Ngày kế tiếp: " + nextDate);
    }
    
    public static String calculateNextDate(int day, int month, int year) {
        // Kiểm tra nếu ngày hoặc tháng không hợp lệ
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            return "Ngày hoặc tháng không hợp lệ.";
        }
        
        // Kiểm tra năm nhuận
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Kiểm tra tháng 2
        int maxDay;
        if (month == 2) {
            maxDay = isLeapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            maxDay = 31;
        }
        
        // Kiểm tra nếu ngày không hợp lệ cho tháng đó
        if (day < 1 || day > maxDay) {
            return "Ngày không hợp lệ cho tháng này.";
        }
        
        // Tính ngày kế tiếp
        if (day < maxDay) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
        
        return day + "/" + month + "/" + year;
    }
}