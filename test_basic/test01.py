# https://www.notion.so/a5a0fafe306e4cb78ec4476a272d156d?v=e116f6cdc6e34075bf8e4c0e56429a26

text = ['   + -- + - + -   ',
        '   + --- + - +   ',
        '   + -- + - + -   ',
        '   + - + - + - +   ']

# strip() : 양쪽 공백 제거
# replace(a, b) : a를 b로 변환
# int(a, 2) : 문자열을 이진법으로 인식해서 십진법으로 변환
# ord() : 문자 -> 숫자
# chr() : 숫자 -> 문자
l = []
for i in text:
    l.append(chr(int(i.strip().replace(' ', '').replace('+', '1').replace('-', '0'), 2)))
print(l)

# join() : 리스트 -> 문자열
print(''.join(l))

# 한줄로 출력하기
print(''.join([chr(int(i.strip().replace(' ', '').replace('+', '1').replace('-', '0'), 2)) for i in text]))

sample = [i.strip().replace(' ', '').replace('+', '1').replace('-', '0') for i in text]
print(sample)

sample_map = ''.join(list(map(lambda x : chr(int(x, 2)), sample)))
print(sample_map)

def f(x):
    return chr(int(x, 2))
sample_function = ''.join(list(map(f, sample)))
print(sample_function)

#################################################
print('########################################')

# 짝수 출력
print([i for i in range(0, 10) if i % 2 == 0])

# 구구단 출력
print([f'{i} X {j} = {i*j}' for i in range(2, 10) for j in range(1, 10)])

# zfill(x) : x만큼 자릿수를 맞춰준다.
print('111'.zfill(10))