# Sumber Belajar
##### Youtube Channel Proggrammer Zaman Now [Link ke Youtube](https://www.youtube.com/watch?v=f3ZhNnvtV-w&list=PL-CtdCApEFH-p_Q2GyK4K3ORoAT0Yt7CX&index=3&t=1240s)

# Apa itu Object Oriented Programming?

- Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep "Object".
- Ada banyak sudut pandang bahasa pemrograman, namun OOP adalah yang sangat populer saat ini.
- Ada banyak istilah yang perlu dimengerti dalam OOP, yaitu: Object dan Class.

# Apa itu Object?

- Object adalah data yang berisi field/properties/attributes dan method/function/behavior.
- Semua data yang bukan primitif di Java adalah object dari mulai Integer, Boolean, Character, String, dan yang lainnya.

# Apa itu Class?

- Class adalah blueprint, prototype atau cetakan untuk  membuat Object.
- Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object.
- Setiap Object selalu dibuat dari Class.
- Dan sebuah Class bisa membuat Object tanpa batas.

# Class & Object : Person

| Class Person                   |
|:-------------------------------|
| String firstName               |
| String lastname                |
| **Method**                     |
| String sayHello(Sting name)    |
| String sayGoodBye(String name) |

&darr;

| rifki                          |
|:-------------------------------|
| firstName = "Rifki"            |
| lastname  = "Rahmattullah"     |

&darr;

| hardlan               |
|:----------------------|
| firstName = "Hardlan" |
| lastname  = "Tholaby" |

&darr;

| fikri                  |
|:-----------------------|
| firstName = "Firki"    |
| lastname  = "Ramadhan" |

# Method

- Selain menambahkan field, kita juga bisa menambahkan method ke object.
- Caranya dengan mendeklarasikan method tersebut didalam block class.
- Sama seperti method biasanya, kita juga bisa menambahkan return value, 
parameter dan method overloading di method yang ada di dalam block class.
- Untuk mengakses method tersebut, kita bisa menggunakan tanda titik(.) 
dan diikuti dengan nama method-nya sama seperti field

# Constructor

- Saat kita membuat object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ().
- Di dalam class Java, kita bisa membuat constructor, 
constructor adalah method yang akan dipanggil saat pertama kali Object dibuat.
- Mirip seperti dimethod, kita bisa memberi parameter pada constructor.
- Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value.

## Constructor Overloading

- Sama seperti di method, di constructor pun kita bisa melakukan overloading.
- Kita bisa membuat constructor lebih dari satu, dengan syarat tipe parameternya berbeda, 
atau jumlah parameter harus berbeda.

## Memanggil Constructor Lain

- Constructor bisa memanggil constructor lain.
- Hal ini memudahkan kita saat butuh menginisialisasi data dengan berbagai kemungkinan.
- Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method,
namun dengan kata kunci this.

# Variable Shadowing

- Variable Shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope 
yang menutupi variable dengan nama yang sama di scope diatasnya.
- Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class.
- Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses.

# This Keyword

- Saat kita membuat kode didalam  block constructor atau method didalam class, 
kita bisa menggunakan kata kunci this untuk mengakses Object saat ini.
- Misal kadang kita butuh mengkses sebuah field yang namanya sama dengan parameter method, 
hali ini tidak bisa dilakukan jika langsung menyebut nama field, 
kita bisa mengakses nama field tersebut dengan kata kunci this.
- This juga tidak hanya digunakan untuk mengakses field milik object saat ini,
namun juga bisa digunakan untuk mengakses method.
- This bisa digunakan untuk mengatasi masalah variable shadowing.

# Inheritance

- Inheritance atau perwarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.
- Dalam artian, kita bisa membuat class Parent dan class Child.
- Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child.
- Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent,
secara otomatis akan dimiliki oleh class Child.
- Untuk melakukan pewarisan, di class Child, kita harus menggunakan kata kunci extends 
lalu diikuti dengan nama class Parent nya.

Example : 
```
class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager {
    
} 
```

# Method Overriding

- Method Overriding adalah kemampuan mendeklarasikan ulang method di chlid class,
yang sudah ada di parent class.
- Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, 
method yang di class parent tidak bisa diakses lagi.

# Super Keyword

- Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child.
- Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super.
- Sederhananya, super digunakan untuk mengakses class parent.
- Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super.

# Super Constructor

- Tidak hanya untuk mengakses method atau field yang ada di parent class, 
kata kunci super juga bisa digunakan untuk mengakses constructor
- Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya didalam class child constructor.
- Jika sebuah class parent tidak memiliki constructor yang tidak ada parameternya(tidak memiliki default constructor),
maka class child wajib mengakses constructor class parent tersebut.

# Object Class

- Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class Object.
- Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, 
tapi secara otomatis java akan membuat class kita extends Object.
- Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java.

# Polymorphism

- Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
- Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
- Polymorphism erat hubungannya dengan Inheritance.