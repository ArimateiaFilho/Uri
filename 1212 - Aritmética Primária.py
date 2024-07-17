def count_carries(a, b):
    carry_count = 0
    carry_over = 0
    
    while a > 0 or b > 0:
        digit_a = a % 10
        digit_b = b % 10
        
        sum_digits = digit_a + digit_b + carry_over
        
        if sum_digits > 9:
            carry_count += 1
            carry_over = 1
        else:
            carry_over = 0
        
        a //= 10
        b //= 10
    
    return carry_count

def main():
    while True:
        num1, num2 = map(int, input().split())
        if num1 == 0 and num2 == 0:
            break
        
        carry_count = count_carries(num1, num2)
        
        if carry_count == 0:
            print("No carry operation.")
        elif carry_count == 1:
            print("1 carry operation.")
        else:
            print(f"{carry_count} carry operations.")
            
if __name__ == "__main__":
    main()