def triangle_type(a, b, c):
    # Kiểm tra xem có phải là tam giác không
    if a + b <= c or a + c <= b or b + c <= a:
        return "NotATriangle"
    
    # Kiểm tra tam giác đều
    if a == b and b == c:
        return "Equilateral"
    
    # Kiểm tra tam giác cân
    if a == b or a == c or b == c:
        return "Isosceles"
    
    # Kiểm tra tam giác vuông
    if a*a + b*b == c*c or a*a + c*c == b*b or b*b + c*c == a*a:
        return "RightTriangle"
    
    # Nếu không phải bất kỳ loại tam giác nào trên
    return "Scalene"

# Đọc dữ liệu đầu vào từ người dùng
a = int(input("Nhập cạnh a: "))
b = int(input("Nhập cạnh b: "))
c = int(input("Nhập cạnh c: "))

# Gọi hàm và in kết quả
result = triangle_type(a, b, c)
print("Loại tam giác:", result)