# EyepaxTest_ContinuousColorGridCountChallage
Eyepax Software Engineer Hiring - Practical Test

#### Used Language - Java 8

#### Problem : 
```
ColorGrid consits with random color nodes.
Each node may have left, right, top, bottom neighbours.
Find the largest unique block with same color in 2D colorGrid.
```

#### Algorithm followed by :
```
First iterating 2D colorGrid node top to bottom and earch row left to right.
then if current node has neighours for each right, left, up, down directions
and with same color, recusively move to relevent direction until color not matched
and update the cursor(i, j) to latest node that moved. 
while moving to each directions count how many nodes founded.
then each block save to a nodeList and update the nodeList with comparing which block has maximum nodes.
```


#### Time complexity : O (N * M)


#### Web Searched
* How to get random index from arraylist
* String.format: How to add padding to string
