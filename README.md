# Sumber Belajar
##### Youtube Channel Programmer Zaman Now [Link ke Youtube](https://www.youtube.com/watch?v=f3ZhNnvtV-w&list=PL-CtdCApEFH-p_Q2GyK4K3ORoAT0Yt7CX&index=3&t=1240s)

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

```Java
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

# Type Check & Casts

- Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif.
- Casts juga bisa digunakan untuk tipe data bukan primitif.
- Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check(Pengecekan tipe data),
dengan menggunakan kata kunci instanceof
- Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false juka tidak sesuai.

# Variable Hiding

- Variable Hiding merupakan masalah yang terjadi ketika kita membuat nama field yang sama di class child
dengan nama field di class parent.
- Tidak ada yang namanya field overriding, ketika kita buat nama field di class, class itu berarti variable hiding.
- Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword.
- Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts.
- Saat Object di Casts, method akan tetap mengakses method overriding,
namun variable akan mengakses variable yang ada di class-nya.

# Package

- Saat kita membuat aplikasi, bisa dipastikan kita akan membuat banyak sekali class.
- Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklasifikasikan jenis-jenis class.
- Java memiliki fitur package, yaitu fitur mirip folder/direktori 
dimana kita bisa menyimpan class-class kita di dalam packge.
- Sama seperti folder/direktori, package juga bisa nested, kita bisa menggunakan tanda titik (.) 
untuk membuat nested package.
- Ketika kita menyimpan class di dalam package, maka diatas file Java nya, kita wajib menyebutkan nama package-nya.

```java
// Nama Package
package rifki.rahmattullah.data;

class Product {

    String name;
    int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
```

# Access Modifier

- Access Modifier adalah kemampuan membuat class field, method dan constructor dapat diakses dari mana saja.
- Sebelumnya kita sudah melihat 2 access modifier, yaitu public dan default(no-modiefier).
- Sekarang kita bahas access modifier lainnya.

| Modifier    | Class  | Package  | SubClass  | World  |
|:------------|:------:|:--------:|:---------:|:------:|
| public      |   Y    |    Y     |     Y     |   Y    |
| protected   |   Y    |    Y     |     Y     |   N    |
| no modifier |   Y    |    Y     |     N     |   N    |
| private     |   Y    |    N     |     N     |   N    |

**Y = YES**

**N = NO**

## Public Class

- Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java.
- Selain itu, nama public class harus sama dengan nama file.
- Karena itu disarankan untuk membuat file baru jika ingin membuat class.

```java
// Nama Package
package rifki.rahmattullah.data;

// Bisa diakes dimana saja.
public class Product {

    // Hanya bisa diakses dipackage data saja.
    protected String name;
    protected int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
```

# Import

- Import adalah kemampuan untuk menggunakan class yang berbeda di package yang berbeda.
- Syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus public.
- Jika kita ingin menimport semua class di dalam sebuah package, kita bisa menggunakan tanda bintang(*).
- contoh: 
```java
import rifki.rahmattullah.data.*;
```

# Default Import

- Secara default, semua class yang ada di package java.lang suda auto import,
jadi kita tidak perlu melakukan import secara manual.
- Contoh class String, Integer, Long, Boolean, dll, terdapat di package java.lang.
Oleh karena itu, kita tidak perlu meng-import nya secara manual.

# Abstract Class

- Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
- Abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung,
hanya bisa diturunkan.
- Untuk membuat Abstract Class, kita bisa menggunakan kata kunci abstract sebelum kata kunci class.
- Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child.

# Abstract Method

- Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class abstract tersebut.
- Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut.
- Artinya, abstract method wajib di override di class child.
- Abstract method tidak boleh memiliki access modifier private.

# Encapsulation

- Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar.
- Hal ini bertujuan agar kita bisa menjaga data sebuah object tetap baik dan valid.
- Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private,
sehingga tidak bisa diakses atau diubah dari luar.
- Agar bisa diubah, kita bisa menyediakan method untuk mengubah dan mendapatkan field tersebut.

## Getter and Setter

- Di java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter and Setter method.
- Getter adalah function yang digunakan untuk mengambil data field.
- Setter adalah function yang digunakan untuk mengubah data field.

| Tipe Data | Getter Method |     Setter Method      |
|:----------|:-------------:|:----------------------:|
| boolean   |    isXxx()    | setXxx(boolean value)  |
| primitif  |   getXxx()    | setXxx(primitif value) |
| Object    |   getXxx()    |  setXxx(Object value)  |


# Interface

- Sebelumnya, kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya.
- Namun sebenarnya yang lebih tepat untuk kontrak adalah interface.
- Jangan salah sangka bahwa interface disini bukanlah User Interface(GUI).
- Interface mirip seperti abstract class, yang membedakan adalah di interface, 
semua method otomatis abstract, tidak memiliki block.
- Di Interface kita tidak boleh memiliki field, kita hanya boleh memiliki constrant (field yang tidak bisa diubah).
- Untuk mewariskan interface, kita tidak menggukanan kata kunci extends, melainkan implements.

# Interface Inheritance

- Sebelumnya kita sudah tahu kalau di Java, Child Class hanya bisa mempunyai 1 Class Parent.
- Namun berbeda dengan Interface, sebuah Child Class bisa implement lebih dari 1 Interface.
- Bahkan Interface pun bisa implement Interface-Interface lain, bisa lebih dari 1.
- Namun jika Interface ingin mewarisi Interface lain, kita menggunakan kata kunci extends, bukan implements.