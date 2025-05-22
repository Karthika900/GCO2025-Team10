
# 🧩 The Great Code Off: Safe Coordinates Challenge

In a 2D grid world, a robot starts at coordinate (0, 0) and can move **only horizontally or vertically** one square at a time.

However, the world is dangerous:  
**any coordinate where the sum of the digits of the product of the x and y values is equal to or greater than 19 is mined.**

### For example:
- (3, 4) → 3×4 = 12 → 1+2 = 3 → ✅ Safe  
- (6, 9) → 6×9 = 54 → 5+4 = 9 → ✅ Safe  
- (96, -69) → 96×69 = 6624 → 6+6+2+4 = 18 → ✅ Safe  
- (67, 43) → 67×43 = 2881 → 2+8+8+1 = 19 → 💣 Mined
- (123, 456) → 123×456 = 56088 → 5+6+0+8+8 = 27 → 💣 Mined  

---

## 🧠 Functions to Implement

### `boolean isSafe(int x, int y)`
Checks if a coordinate is safe to visit.

**Parameters:**
- `x` (int): x-coordinate  
- `y` (int): y-coordinate  

**Returns:**
- `true` if the sum of the digits of (x × y) is < 19  
- `false` otherwise

---

### `int totalSafeSquares()`
Calculates the total number of safe squares the robot can reach from (0, 0), using only horizontal and vertical moves.

**Returns:**
- The number of reachable safe squares

---

### `int shortestSafeJourney(int a, int b, int x, int y)` _(Extension Task)_
Finds the shortest safe path from (a, b) to (x, y), if one exists.

**Parameters:**
- `a`, `b`: starting coordinates  
- `x`, `y`: destination coordinates  

**Returns:**
- The number of steps in the shortest safe path  
- `-1` if no safe path exists

---

## 🏆 Prizes

There are **two prizes** available:

### 🥇 Fastest Correct Answer
Awarded to the team that submits a correct and efficient solution to `totalSafeSquares()` in the shortest time.

**Why we should win this prize:**  
_(Team to complete)_

---

### 🧠 Most Unique Solution
Awarded to the team with the most creative, elegant, or unconventional approach to solving `shortestSafeJourney()`.

**Why we should win this prize:**  
_(Team to complete)_

---

## ✍️ Team Write-Up

**Team Name:**  
**Team Members:**  

**Approach Summary:**  
_(Explain your algorithm, any optimizations, creative ideas, or fun twists you added!)_

---

## 📬 Submission Instructions

1. **Fork the official challenge repository.**  
2. Add your solution and team write-up to your fork.  
3. **Before the deadline, share your forked repository with the judges**
4. Ensure your code is well-documented and easy to run.
5. answer form for totalSafeSquares: https://forms.office.com/e/T90mYcnF1r
6. feedback from: https://forms.office.com/e/ewqSbUq593

---
