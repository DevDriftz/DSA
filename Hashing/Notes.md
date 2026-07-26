# HashMap in Java

## What is a HashMap?

A `HashMap` is a data structure that stores data in **key-value pairs**.

- Keys are **unique**.
- Values can be duplicated.
- Average time complexity for `put()`, `get()`, and `remove()` is **O(1)**.

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

---

# C++ STL Mapping

| C++ STL | Java |
|----------|------|
| unordered_map<int,int> | HashMap<Integer,Integer> |
| map<int,int> | TreeMap<Integer,Integer> |

---

# Declaration

```java
import java.util.*;

HashMap<Integer, Integer> map = new HashMap<>();
```

---

# Basic Operations

## Insert

```java
map.put(10, 5);
```

Map

```
10 → 5
```

---

## Update

```java
map.put(10, 8);
```

Map

```
10 → 8
```

`put()` inserts if the key is absent and updates if it is already present.

---

## Access Value

```java
System.out.println(map.get(10));
```

Output

```
8
```

---

## Remove

```java
map.remove(10);
```

---

## Check if Key Exists

```java
map.containsKey(10);
```

Returns

```
true / false
```

---

## Check if Value Exists

```java
map.containsValue(8);
```

---

## Size

```java
map.size();
```

---

## Empty

```java
map.isEmpty();
```

---

## Clear

```java
map.clear();
```

---

# get()

```java
map.get(key);
```

Returns

- value if key exists
- `null` if key does not exist

Example

```java
HashMap<Integer,Integer> map = new HashMap<>();

map.put(5,2);

System.out.println(map.get(5));
System.out.println(map.get(10));
```

Output

```
2
null
```

---

# getOrDefault()

Syntax

```java
map.getOrDefault(key, defaultValue);
```

Returns

- value if key exists
- default value otherwise

Example

```java
HashMap<Integer,Integer> map = new HashMap<>();

map.put(5,2);

System.out.println(map.getOrDefault(5,0));
System.out.println(map.getOrDefault(10,0));
```

Output

```
2
0
```

---

# Frequency Counting

Most common interview use.

```java
HashMap<Integer,Integer> freq = new HashMap<>();

for(int x : arr){
    freq.put(x, freq.getOrDefault(x,0)+1);
}
```

Equivalent C++

```cpp
unordered_map<int,int> freq;

for(int x : arr)
    freq[x]++;
```

---

# Dry Run

Array

```
2 3 2 5 2
```

Initially

```
{}
```

### Read 2

```
getOrDefault(2,0)
↓

0

put(2,1)
```

Map

```
{
2=1
}
```

---

### Read 3

```
getOrDefault(3,0)

↓

0

put(3,1)
```

Map

```
{
2=1,
3=1
}
```

---

### Read 2

```
getOrDefault(2,0)

↓

1

put(2,2)
```

Map

```
{
2=2,
3=1
}
```

---

### Read 5

```
getOrDefault(5,0)

↓

0

put(5,1)
```

Map

```
{
2=2,
3=1,
5=1
}
```

---

### Read 2

```
getOrDefault(2,0)

↓

2

put(2,3)
```

Final Map

```
{
2=3,
3=1,
5=1
}
```

---

# Finding Frequency of a Number

```java
System.out.println(freq.getOrDefault(2,0));
```

Output

```
3
```

---

# Iterating Through HashMap

```java
for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

Output

```
2 -> 3
3 -> 1
5 -> 1
```

---

# Finding Maximum Frequency

```java
int maxFreq = 0;
int maxElement = -1;

for(Map.Entry<Integer,Integer> entry : map.entrySet()){

    if(entry.getValue() > maxFreq){
        maxFreq = entry.getValue();
        maxElement = entry.getKey();
    }
}

System.out.println(maxElement);
System.out.println(maxFreq);
```

---

# Time Complexity

| Operation | Complexity |
|------------|------------|
| put() | O(1) Average |
| get() | O(1) Average |
| remove() | O(1) Average |
| containsKey() | O(1) Average |
| Iteration | O(n) |

Worst case

```
O(n)
```

due to hash collisions.

---

# HashMap vs TreeMap

| Feature | HashMap | TreeMap |
|----------|----------|----------|
| Order | No | Sorted by Key |
| Complexity | O(1) Avg | O(log n) |
| Null Key | One Allowed | Not Allowed |
| DSA Usage | ⭐⭐⭐⭐⭐ | ⭐⭐⭐ |

---

# C++ vs Java

## C++

```cpp
unordered_map<int,int> mp;

mp[x]++;
```

## Java

```java
HashMap<Integer,Integer> map = new HashMap<>();

map.put(x, map.getOrDefault(x,0)+1);
```

---

# Interview Tips

✅ Use `HashMap` when ordering is **not required**.

✅ Use `TreeMap` when keys must remain **sorted**.

✅ Use `getOrDefault()` for frequency counting.

✅ `put()` inserts and updates.

✅ `get()` returns `null` if the key is absent.

✅ `getOrDefault()` returns the supplied default value if the key is absent.

---

# LeetCode Problems

- Two Sum
- Contains Duplicate
- Valid Anagram
- Group Anagrams
- Top K Frequent Elements
- Majority Element
- Happy Number
- Longest Consecutive Sequence
- Subarray Sum Equals K
- Isomorphic Strings

---

# Key Takeaways

- `HashMap` stores **key-value pairs**.
- Keys are unique.
- Average lookup is **O(1)**.
- `put()` inserts or updates.
- `get()` returns `null` if the key doesn't exist.
- `getOrDefault()` avoids `NullPointerException`.
- Frequency counting pattern:

```java
map.put(x, map.getOrDefault(x,0)+1);
```

- Java equivalent of C++:

```cpp
mp[x]++;
```
