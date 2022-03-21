# Insertion_Sort_Projesi
## Patika Dev - Insertion Sort Projesi

## PROJE 1

1) -------------------------------------------------------------
```
[2,2,6,16,18,22,27]
```
### Searching metodu ile elemanları sıraladık.
```
[2,2] [2,6] [6,16] [16,18] [18,22] [22,27]
```
### Closest pair metodu ile yakın elemanları birbirleri ile eşleştirdik.
```
[2]
```
### Aynı eleman kontrolü ile aynı elemanları saydık.
```
[2,2,6,16,18,22,27]
```
### Mode bulma metodu ile sıraladık ve modunu bulduk.

2) -------------------------------------------------------------
```
- - [22,27,16,2,18,6] - -

1. aşama [2,27,16,22,18,6]
2. aşama [2,6,16,22,18,27]
3. aşama [2,6,16,18,22,27]
```

### n + (n-1) + (n-2) + (n-3) + 1 => (n(n+1)/2) ise Big-O gösterimi n**2 olacaktır.

3) -------------------------------------------------------------

### dizi sıralamasına göre;
```
2     2     6     16     18     22     27
```
### aradığımız sayı ortadadır bu sebeple Average Case kapsamına girer.

----------------------------------------------------------------
```
[7,3,5,8,2,9,4,15,6]   n
[2,3,5,8,7,9,4,15,6]   n-1
[2,3,4,8,7,9,5,15,6]   n-2
[2,3,4,5,7,9,8,15,6]   n-3
[2,3,4,5,6,9,8,15,7]   n-4
[2,3,4,5,6,7,8,15,9]   n-5
[2,3,4,5,6,7,8,9,15]   n-6
```
### Big-O gösterimi => n + (n-1) + (n-2) + (n-3) + (n-4) + (n-5) + (n-6) + 1

