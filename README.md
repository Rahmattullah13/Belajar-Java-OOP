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

# Default Method

- Sebelumnya kita tahub bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block method.
- Namun sejak Java versi 8, ada fitur default method di interface.
- Fitur ini terjadi karena sulit untuk maintain kontrak interface 
jika sudah terlalu banyak class yang implement interface tersebut.
- Ketika kita menambahkan satu method di interface, secara otomatis semua class yang implement akan rusak
karena harus meng-override method tersebut.
- Dengan menggunakan Default Method, kita bisa menambahkan konkrit method di interface.

```java
package rifki.rahmattullah.data;

// Contoh Interface dan Multi Interface
public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int getTier();
    
    // Contoh Default Method
    default boolean isBig(){
        return false;
    }
}
```

# ToString Method

- toString() adalah method yang terdapat di class object.
- Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String.
- Secara default toString() ini akan menghasilkan:
```
nameclass+@+hashCode
```
- Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca.

# Equals Method

- Hal yang agak membingungkan di Java adalah cara membandingkan object.
- Di bahasa pemrogramman lain, untuk mengecek apakah sebuah object sama biasanya menggunakan operator ==,
di Java operator == hanya untuk mengecek data primitif.
- Untuk non primitif pengecekan nya menggunakan method equals.
- Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory,
artinya jika kita membuat 2 object yang isi field nya sama tetap dianggap beda oleh method equals nya.
- Oleh karena itu, ada baiknya meng-override method equals milik class Object tersebut.

# HashCode Method

- Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan representasik String,
hashCode adalah representasi dari Integer.
- HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dll.
Karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita.
- Secara default hashCode akan mengembalikan nilai integer sesuai data di memory,
namun kita bisa meng-override nya jika kita mau.

## Kontrak HashCode Method

Tidak mudah meng-override method hashCode, karena ada kontraknya:

- Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus mengahasilkan data integer yang sama.
- Jika ada 2 object yang sama lalu dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama.
- Tidak wajib hashCode berbeda jika method equals menghasilkan false,
karena memang keterbatasan jumlah integer sekitar 2 milyar.

# Final Class

- Sebelumnya kita pernah menggunakan kata kunci final di java.
- Jika digunakan di variable, maka variabe tersebut tidak bisa berubah datanya.
- Final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class,
maka kita menandakan bahwa class tersebut tidak bisa diwariskan lagi.
- Secara otomatis semua class child nya akan error.

```java
class  SocialMedia {
    String name;
}

// Final Class
final class Facebook extends SocialMedia {
    
}

class fakeFacebook extends Facebook {
    // Class ini akan Error
}
```

# Final Method

- Kata kunci final juga bisa digunakan di Method.
- Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa
di override lagi di class child nya.
- Ini sangat cocok jika kita ingin mengunci implementasi dari sebua method agar tidak bisa
diubah lagi oleh class child nya.

```java
class  SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    // Contoh Final Method
    final void login(String username, String password);
}

class fakeFacebook extends Facebook {
    void login(String username, String password);{
        // Method ini akan Error
    }
}
```

# Inner Class 

- Di Java, kita bisa membuat class didalam class, atatu disebut dengan Inner Class.
- Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan,
dimana sebuah class tidak bisa dibuat tanpa class lain.
- Misal kita membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class Employee
sebagai inner class Company.
- Cara membuat inner class cukup membuatnya di dalam blok class outer class nya.

```java
public class Company {
    
    private  String name;
    
    // inner Class
    public class Employee {
        
        private String name;
        
        public String getName(){
            return name;
        }
    }
}
```

## Mengakses Outer Class

- Keuntungan saat kita membuat inner class adalah, kemampuan untuk mengakses outer class nya.
- Inner Class bisa membaca semua private member yang ada di outer class nya.
- Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuiti dengan kata kunci this,
misal Company.this. 
- Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan
kata kunci super, misal Company.Super.

Contoh mengaksese Outer Class:

```java
public class Company {
    
    private  String name;
    
    // inner Class
    public class Employee {
        
        private String name;
        
        // Mengakses Outer Class
        public String getCompany(){
            return Company.this.getName();
        }
    }
}
```

# Anonymous Class

- Anonymous Class atau Class tanpa nama.
- Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung.
- Anonymous class sebenarnya, termasuk inner class dimana outer class nya adalah tempat dimana 
kita membuat anonymous class tersebut.
- Anonymous Class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi 
interface atau abstract class sederhana, tanpa harus membuat implementasi class nya.
- Kekurangan Anonymous Class adalah tidak bisa di reuse/digunakan kembali.

# Static Keyword

- Dengan menggunakan kata kunci static, kita bisa membuat field, method,
atau class bisa diakses langsung tanpa melalui object nya.
- Perlu diingat, static hanya bisa mengakses static lainnya.

#### Static dapa digunakan dimana saja sih?

- Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
- Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
- Block, static block akan otomatis dieksekusi ketika sebuah class di load.
- Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class nya
terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya.

# Record Class

- Kadang kita sering membuat class, hanya untuk class yang berisikan data.
Hanya berisi getter, equals, hashCode, dan toString method.
- Record Class digunakan untuk mempermudah pembuatan jenis class tersebut.
- Saat kita membuat record class, secara otomatis Java akan membuat getter, equals, hashCode dan toString 
method secara otomatis dan juga constructor secara otomatis.
- Saat membuat record class , secara otomatis kita akan meng-extends class java.lang.Record, yang artinya
kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface.

# Record Class Constructor

- Secara default constructor di record class akan dibuat secara otomatis sesuai dengan definisi record class parameter.
- Namun jika kita ingin melakukan sesuatu di constructor tersebut kita bisa membuat compact constructor
yaitu constructor tanpa tanda ().
- Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya yaitu, 
constructor overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan direcord class.

# Enum Class

- Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbtas.
- Misal gender, ada Male dan Femal atau tipe customer ada standard, premium, atau vip, dll.
- Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nillai terbatas
yang sudah ditentukan.
- Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu 
class enum tidak bisa extends class lain, namun masih tetap bisa implements interface.

```java
public enum Level {
    STANDARD,
    PREMIUM,
    VIP,
}
```

### Enum Members

- Sama seperti class biasanya, di class enum pun kita bisa menambahkan members(field, method, dan constructor).
- Khusus constructor, kita tidak bisa membuat public constructor,
karena tujuan enum bukan untuk di instansiasi secara bebas.

```java
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    // Menambahkan Enum Constructor
    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
```

# Jenis-Jenis Exception

Secara garis besar, di Java exception dibagi menjadi 3 jenis:

1. Checked Exception, yaitu exception yang wajib di try-catch.
2. Runtime Exception
3. Error

# Exception

- Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error.
- Di Java, error direpresentasikan dengan istilah Exception, dan semua direpresentasikan dalam bentuk class exception.
- Kita bisa menggunakan class exception sendiri atau menggunakan yang sudah disediakan oleh java.
- Jika kita ingin membuat exception maka kita harus membuat class yang extends class Throwable atau turunan nya.

```java
public class ValidationException extends Throwable{

    public ValidationException(String message){
        super(message);
    }
}
```

### Membuat Exception

- Exception biasanya terjadi di method, ketika kita membuat exception di sebua method maka,
method tersebut harus ditandai dengan kata kunci throws diikuti dengan class exception nya.
- Jika method tersebut bisa menimbulkan lebih dari satu jenis exception,
kita bisa menambahkan lebih dari satu class exception.
- Didalam kide program kita, untuk membuat exception kita cukup menggunakan kata kunci throw,
diikuti dengan object exception nya.

```java
public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null){
            throw new ValidationException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if (loginRequest.password() == null){
            throw new ValidationException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }
}
```

# Try Catch

- Saat kita memanggil sebuah function yang bisa menyebabkan exception,
maka kita wajib menggunakan try-catch expression di Java.
- Ini berguna untuk menangkap exception yang terjadi, karena jika kita tidak menangkap nya
lalu terjadi exception maka secara otomatis program kita akan berhenti.
- Cara menggunakan try-catch expression di java sangat mudah,
di block try kita tinggal panggil method yang bisa menyebabkan exception 
dan di block catch kita bisa melakukan sesuatu jika terjadi exception.

```java
public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        // Cara menggunakan try-catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        }
    }
}
```

### Mulitple Try-Catch 1

```java
public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }
}
```

```java
public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Rifki", null);

        // Cara menggunakan multiple try-catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Data null : " + exception.getMessage());
        }
    }
}
```

### Multiple Try-Catch 2

```java
public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        // Cara menggunakan  multiple try-catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Terjadi Error dengan pesan : " + exception.getMessage());
        }
    }
}
```

# Finally Keyword

- Dalam try-catch kita bisa menambahkan block finally.
- Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception atau tidak.
- Ini sangat cocok ketika kita ingin melakukan sesuatu tidak peduli sukses atau gagal,
misal di block try kita ingin membaca file, di block catch kita akan tangkap jika ada terjadi error,
dan di block finally error ataupun sukses membaca file,
kita wajib menutup koneksi ke file tersebut biar tidak menggantung di memory.

```java
public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        // Cara menggunakan try-catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Terjadi Error dengan pesan : " + exception.getMessage());
            // Contoh menggunakan keyword finally
        } finally {
            System.out.println("Selalu di eksekusi");
        }
    }
}
```

# Runtime Exception

- Runtime Exception adalah jenis exception yang tidak wajib ditangkap menggunakan try-catch.
- Kompiler Java tidak akan protes walaupun kita tidak menggunakan try-catch ketika kita 
memanggil method yang bisa menyebabkan runtime exception.
- Untuk membuat class runtime exception kita wajib meng-extends class RuntimeException.
- Ada banyak di Java yang merupakan runtime exception seperti NullPointerException, IllegalArgumentException, dll.

```java
public class BlankException extends RuntimeException{

    public BlankException(String message){
        super(message);
    }
}
```

### Method Dengan Runtime Exception

```java
public class ValidationUtil {
    
    // Contoh menggunakan Runtime Exception
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("Username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("Password is blank");
        }
    }
}
```

### Tanpa Try-Catch

```java
public class ValidationApp {
    public static void main(String[] args) {

        // Tanpa menggunakan Try-Catch
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
```

### Perlu Diperhatikan

- Walaupun runtime exception tidak wajib menggunakan try-catch tapi ada baiknya kita tetap menggukan try-catch.
- Karena jika terjadi runtime exception yang ditakutkan adalah program kita berhenti.

# Error

- Error adalah sebuah class di Java yang tidak direkomendasikan untuk di try-catch.
- Biasanya error terjadi ketika ada masalah serius dan sangat tidak direkomendasikan untuk di try-catch.
- Artinya, direkomendasikan untuk mematikan aplikasinya.
- Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database,
maka direkomendasikan untuk membuat exception jenisa ERROR dan menghentikan aplikasi nya.

```java
public class DatabaseError extends Error{
    
    public DatabaseError(String message) {
        super(message);
    }
}
```

### Jika terjadi Error

```java
public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Rifki", "secret");
        System.out.println("Sukses");
    }

    // Jika terjadi Error akan dieksekusi
    public static void connectDatabase(String username, String password){
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa conect ke database");
        }
    }
}
```

# StackTraceElement Class

- Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StactTraceElement object.
- StackTraceElement berisikan informarsi tentang class, file bahkan baris lokasi terjadinya error.
- Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi.
- Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable,
untuk memprint ke console detail error StackTraceElement nya.

```java
public class StackTraceApp {
    public static void main(String[] args) {

        try {
            sampleError();
        }catch (RuntimeException exception) {
            exception.printStackTrace();
        }

        try {
            String[] names = {
                    "Rifki", "Hasby", "Agifa"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "Rifki", "Hasby", "Agifa"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
```

# Try with Resource

- Di Java 7, terdapat fitur yang bernama Try with Resource.
- Try with Resource adalah sebuah makanisme agar kita lebih mudah menggunakan resource(yang wajib di close) 
dalam block try.
- Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AuthoCloseable.

#### Cara Manual

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new FileReader("Sample.md")
            );

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Sukses menutup");
                } catch (IOException exception) {
                    System.out.println("Error menutup resource " + exception.getMessage());
                }
            }
        }
    }
}
```

#### Cara dengan menggunakan Try with Resource

```java
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new FileReader("Sample.md"))){

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }
    }
}
```

# Annotation

- Annotation adalah menambahkan metadata ke kode program yang kita buat.
- Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library/framework.
- Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti.
- Untuk membuat annotation, kita bisa menggunakan kata kunci @interface.
- Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value.

#### Attrubute Annotation

| Attribute  | Keterangan                                                                                          |
|:-----------|:----------------------------------------------------------------------------------------------------|
| @Target    | Memberitahu annotation bisa digunakan dimana? Class, method, field, dll.                            |
| @Retention | Membertitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection? |

**Example**

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();

    String[] tags() default {};
}
```

## Predefined Annotation

Java juga sudah memiliki annotation bawaan, seperti:

- @Override, untuk menandai bahwa method yang meng-override method parent class nya.
- @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan.
- @FunctionalInterface, untuk menandai class tersebut bisa dibuat sebagai lamda expression.
- dan lain-lain.

# Reflection

- Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan.
- Reflection biasanya sangat berguna saat kita ingin membuat library atau framework,
sehingga bisa meng-otomatisasi pekerjaan.
- Untuk mengakses reflection class dari sebuat object, kita bisa menggunakan method getClass() atau NamaClass.class.

```java
public class ValidationUtil {
    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // Validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
```