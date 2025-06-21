class Solution:
    def solve(self, A, b):
        n = len(A)
        
        curr_sum = sum(A[0:b])
        max_sum = curr_sum

        inc = n - 1
        exc = b - 1

        while inc >= 0 and exc >= 0:
            curr_sum += A[inc]   
            curr_sum -= A[exc]  
            max_sum = max(max_sum, curr_sum)
            
            inc -= 1
            exc -= 1
        
        return max_sum