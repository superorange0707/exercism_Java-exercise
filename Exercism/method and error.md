# Method and Error

## String

### 1.substring

#### 1. check substring

```java
contains()  // to return the boolean value, if it has substring,return true, otherwise return false
indexOf()  // return the the start value of index of the substring
```



```
String a = "fastfood";
a.indexOf("food");
//it will return 4
```



### 2.LowerCase/UpperCase

#### 1.make string lowercase/uppercase

toLowerCase()

```java
 String.toLowerCase()
```

toUpperCase()

```java
 String.toUpperCase()
```



### 3.Reverse

#### 1.charAt(index)

get the unit of code:

```java
String string1 = "fast";
char code_unit = string1.charAt(0);
//code_unit = "f"

String inputString;
int length = inputString.length();
String inputString;
for (int i=0; i<length; i++){
   	string1 = inputString.charAt(i) + string1;
 }
return string1;
```





#### 2. toCharArray()

to make the string to array type

```java
String inputString;
int length = inputString.length();
char[] try1 = inputString.toCharArray();
String string1 = "";
for (int i = length -1; i>=0; i--){
	string1 =  string1 + try1[i];
	}
  return string1;
```

### 4. Emoji in the string

#### get the correct index of element in the string(with emoji)

because the string has emojis(Java UTF-16), so the length of the emoji in the string is not fixed,  use codepoint to get the excat length of each element in the string. and get the index of the element use summary of these length

```java
String s = '';
for (int i = 0; i < s.length(); ) {
   //get the length of the element
        int cp = s.codePointAt(i);
        int index = Character.charCount(cp);
 	
  // get the correct index of each character
       i = i + index;
  
    }
```

https://stackoverflow.com/questions/43538456/get-correct-index-of-character-in-string-by-counting-emojis-only-as-one-characte



### 5.Replace

#### replace or remove something in the string

```java
String string1 = "six-years-old";
string1.replaceAll("-","");
//get sixyearsold
```



### 6.Remove Control character in the string with regex

#### 6.1 ASCII control characters

```java
string.replaceAll("\\p{Cntrl}" , "")
```



#### 6.2 Unicode control characters

```java
string.replaceAll("(?U)\\p{Cntrl}", "");
```

https://stackoverflow.com/questions/9057083/remove-all-control-characters-from-a-java-string



#### 6.3 Keep only letters in the string iwth regex

```java
string.replaceAll("[^A-Za-z]+", "")
```

**keep letters included unicode characters**

```java
string.replaceAll("\\P{L}+", "");
```



## Array

#### 1. Length

```java
array.length
```



## Object-Oriented Construction

#### 1.Field

```java
	  private int distance;
	  public int speed;
    public int battery;
    public NeedForSpeed(int speed, int battery){
        this.speed = speed;
        this.battery = battery;
    }
var car = new NeedForSpeed(5,2);
```



##### 1.1 Public and Private

- `public`:the member can be accessed by any code (no restrictions).
- `private`: the member can only be accessed by code in the same class



##### 1.2  Variable

the variables delcared in the field so that all method in the class can use them



#### 2.Constructor

build the template for the object









## Operator

#### 1.1 ternary conditional operator

```java
condition? expression1 : expression2 ; 
```









## Exception

#### 1.Throw Exception

```java
throw new Type_Exception();
```



```java
 throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
```

