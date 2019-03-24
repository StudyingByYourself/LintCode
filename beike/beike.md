## 乔乔的包(QiaoQiaoBag)

## 小明卖食物(SellFood)

题目的测试用例是错的，本题是基于区间型的DP。

![](https://github.com/StudyingByYourself/image/raw/master/algorithm/%E5%8C%BA%E9%97%B4DP.jpg)

f[i][j] means arr[i...j]符合要求的最大值

<center>
	f[i][j] = max{f[i][j - 1] + arr[j] * (n - len + 1), f[i + 1][j]+ arr[i] * (n - len + 1)}
</center>




