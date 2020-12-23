def solution(s):
    stack = []
    table = {
        ')' : '(',
        '}' : '{',
        ']' : '['
    }

    # 스택 이용, 예외 처리 및 일치 여부 판별
    for char in s:
        if char not in table: # '({['인 경우 push
            stack.append(char)
        elif not stack or table[char] != stack.pop(): # 스택이 비어있거나, pop()한 값이 기대한 값과 다를 경우 False
            return False

    return len(stack) == 0

print(solution('()[]{}'))