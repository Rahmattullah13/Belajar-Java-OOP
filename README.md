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















