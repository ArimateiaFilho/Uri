import sys

def calcular_tempo_para_alcancar(S, va, vb):
    if va <= vb:
        return "impossivel"
    else:
        tempo = S / (va - vb)
        return f"{tempo:.2f}"

def main():
    input = sys.stdin.read()
    lines = input.strip().split('\n')
    
    for line in lines:
        S, va, vb = map(int, line.split())
        resultado = calcular_tempo_para_alcancar(S, va, vb)
        print(resultado)
    
    
if __name__ == "__main__":
    main()
