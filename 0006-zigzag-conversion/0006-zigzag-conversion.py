class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows==1: return s

        matrix=[[0]*len(s) for i in range(numRows)] # Matrix
        i,r,c=0,0,0

        # Build the structure
        while i<len(s):
            if r==0:
                while r<numRows and i<len(s):
                    matrix[r][c]=s[i]
                    r+=1
                    i+=1
                r-=2 # Reset the pointer for diagonal
            else:
                matrix[r][c]=s[i]
                r-=1
                i+=1
            c+=1

        # Add all the values to ans string, row by row
        ans=''
        for i in range(numRows):
            for j in range(len(s)):
                if matrix[i][j]!=0:
                    ans+=matrix[i][j]
        return ans