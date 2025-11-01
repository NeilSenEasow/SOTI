def first(seq, n=None):
    list=[]
    if n is None:
        return [seq[0]]
    if n == 0:
        return []
    if n>len(seq):
        n=len(seq)
    for i in range(n):
        list.append(seq[i])
    return list

@test.describe('Example Tests')
def example_tests():
    seq = ['a', 'b', 'c', 'd', 'e']
    test.assert_equals(first(seq), ['a'])
    test.assert_equals(first(seq, 0), [])
    test.assert_equals(first(seq, 1), ['a'])
    test.assert_equals(first(seq, 2), ['a', 'b'])
    test.assert_equals(first(seq, 10), ['a', 'b', 'c', 'd', 'e'])