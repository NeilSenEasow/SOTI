def no_boring_zeros(n):
    # handle 0 early
    if n == 0:
        return 0

    number = abs(n)
    digits = []

    while number > 0:
        digits.append(number % 10)
        number //= 10

    while digits and digits[0] == 0:
        digits.pop(0)

    result = 0
    for d in reversed(digits):
        result = result * 10 + d

    return result if n > 0 else -result
