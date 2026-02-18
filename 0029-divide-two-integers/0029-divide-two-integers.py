class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        int_max=2**31 -1
        int_min=-2**31

        if dividend==int_min and divisor==-1:
            return int_max
        
        sign= (dividend<0) ^ (divisor<0)
        
        a=abs(dividend)
        b=abs(divisor)
        ans=0
        while a>=b:
            temp=b
            multiple=1
            while a>(temp<<1):
                temp=temp<<1
                multiple=multiple<<1
            a-=temp
            ans+=multiple


        return 0-ans if sign else ans
        