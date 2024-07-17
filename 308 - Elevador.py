def check_elevator(M, A1, A2, A3):
        
    if A1 + A2 + A3 > 1:
        return 'X' 
        
    if M == 1 or M == 0 and A1 + A2 + A3 == 0:
        return 0

    return 1

def main():
    N = int(input().strip())
    
    for i in range(0, N):
        M, A1, A2, A3 = map(int, input().strip().split())
        
        result = check_elevator(M, A1, A2, A3)
        
        print(result)
    
if __name__ == "__main__":
    main()