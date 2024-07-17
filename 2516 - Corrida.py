import sys

def time_to_get(S, va, vb):
    if va <= vb:
        return "impossivel"
    else:
        time = S / (va - vb)
        return f"{time:.2f}"

def main():
    input = sys.stdin.read()
    lines = input.strip().split('\n')
    
    for line in lines:
        S, va, vb = map(int, line.split())
        result = time_to_get(S, va, vb)
        print(result)
    
    
if __name__ == "__main__":
    main()
