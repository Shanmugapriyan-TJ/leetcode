class Solution(object):
    def subtreeWithAllDeepest(self, root):
        def dfs(root):
            if not root:
                return 0, None
            dl, l = dfs(root.left)
            dr, r = dfs(root.right)

            if dl == dr:
                return dl+1, root
            
            if dl>dr:
                return dl+1, l
            
            return dr+1, r
        
        _, ans = dfs(root)
        return ans