def solution(T):
    result = [0] * len(T)
    stack = []
    for i, cur in enumerate(T):
        # 현재 온도가 스택 값보다 높다면 정답 처리
        while stack and cur > T[stack[-1]]:
            last = stack.pop()
            result[last] = i - last
        stack.append(i)

    return result

print(solution([73, 74, 75, 71, 69, 72, 76, 73]))