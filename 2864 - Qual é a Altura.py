import math

def max_high(A, B, C):
    x_max = -B / (2 * A)
    h_max = A * x_max ** 2 + B * x_max + C

    return h_max

def main():
    T = int(input())
    for i in range(0, T):
        A, B, C = map(int, input().split())
        result = max_high(A, B, C)
        print(f"{result:.2f}")
    
if __name__ == "__main__":
    main()