int min(int a, int b) {
    if ( a < b) {
        return a;
    }
    return b;
}

int minPathSum(int** grid, int gridSize, int* gridColSize) {
    
    int ret;
    int m = gridSize;
    int n = gridColSize[0];

    int** pathSums = malloc(m  * sizeof(int*));

    for (int i = 0; i < m; i++) {
        pathSums[i] = malloc(n * sizeof(int));
    }

    pathSums[0][0] = grid[0][0];

    for (int i = 1; i < m; i++ ){
        pathSums[i][0] = pathSums[i - 1][0] + grid[i][0];
    }
    for (int j = 1; j < n; j++) {
            pathSums[0][j] = pathSums[0][j - 1] + grid[0][j];
    }

    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            pathSums[i][j] = min(pathSums[i][j - 1], pathSums[i - 1][j]) + grid[i][j];
        }
    }

    ret = pathSums[m - 1][n - 1];
    for (int i = 0; i < m; i++) {
        free(pathSums[i]);
    }
    free(pathSums);

    return ret;
}