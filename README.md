# Find Prime Number


Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

A whole number greater than 1 that can not be made by multiplying other whole numbers. Example: 5 is a prime number. We cannot multiply 2, 3 or 4 together to make 5.


###### Program
```java
class Prime 
{
    public static void main(String args[])
    {
        byte limit = 100;
        System.out.println("The numbers are :");
        for(int i = 1; i <= limit; i++)
        {
            int num = findPrime(i);
            if(num > 1)
            {
                System.out.println(num);
            }
        }
    }

    public static int findPrime(int number)
    {
        boolean flag = false;
        int num = number / 2;
        for(int i = 2; i <= num; i++)
        {
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag ? 0 : number;
    }
}
```
#### Compile java program

javac ClassName.java


#### Run java Program

java ClassName

### findPrime() function


this function determine "number" prime or not. the number is prime it will return the corresponding number otherwise return zero.
```java
public static int findPrime(int number)
    {
        boolean flag = false;
        int num = number / 2;
        for(int i = 2; i <= num; i++)
        {
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag ? 0 : number;
    }
```

### Response

>compile java program : javac Prime.java

>run java program : java Prime

```java
The numbers are :
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
```



