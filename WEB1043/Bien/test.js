// function DongVat(tenDv, tuoiDv, gioiTinh, tiengKeu) {
//   this.tenDv = tenDv;
//   this.tuoiDv = tuoiDv;
//   this.gioiTinh = gioiTinh;
//   this.tiengKeu = function () {
//     alert(tiengKeu);
//   };
// }

// DongVat["meo"] = new DongVat("meo", 20, "cai", "meo meo");
// DongVat["cho"] = new DongVat("cho", 20, "cai", "gau gau");

// console.log(DongVat["meo"]);
// console.log(DongVat["cho"]);
// for (var x in DongVat) {
//   console.log(DongVat[x].tenDv);
// }
// console.log(typeof DongVat["meo"]);

// if ("cho" in DongVat) {
//   alert(" Doi tuong Dao da duoc tao");
// } else {
//   alert(" Đối tượng Dao chua duoc tao");
// }

// if ("cho" in DongVat) {
//   DongVat["cho"].soChan = 4;
// }
// console.log(DongVat["cho"]);

// window.defaultStatus = "js";

/**
 * 1. Gioi thieu qua ve Object
 *  cach khoi tao 1 object,
 *  Thêm thuộc tính cho đối tượng,
 *  Truy cập đến thuộc tính của đối tượng
 *  Thêm phương thức cho đối tượng
 *  Gọi phương thức của đối tượng
 * 2. Gioi thieu qua ve Class
 * 3. Object va Array
 * 4. Link tham khao:
 * https://codelearn.io/sharing/object-trong-javascript
 * https://freetuts.net/doi-tuong-object-trong-javascript-408.html
 * https://kipalog.com/posts/Ban-ve-khai-niem-Object-trong-Javascript
 * https://niithanoi.edu.vn/class-trong-javascript.html
 */

/**
 * 1. Objet
 * Các bạn có 3 cách để khai báo đối tượng trong Javascript: 
        Sử dụng từ khóa {}
        Sử dụng từ khóa new Object()
        Sử dụng phương thức static // it dung
    // literal
    const dog = { }

    // constructor
    const cat = new Object();

    // static method
    const horse = Object.create({ })
 */
// cach 1

// var hoaHong = {
//   mau: "Hong",
//   soCanh: 5,
//   set mauInfo(age) {
//     console.log("setter - " + this.age);
//     this.age = age;
//   },

//   get mauInfo() {
//     console.log("getter");
//     return "Thông tin mau: " + this.mau;
//   },
// };

/* trong trường hợp muốn định nghĩa setter / getter trong hàm tạo đối tượng thì bạn
  cần định nghĩa theo nguyên tắc thêm một thuộc tính vào đối tượng đã có với
  lệnh Object.defineProperty */
// function person(age) {
//   this.age = 0;
//   Object.defineProperty(this, "ageInfo", {
//     set: function (age) {
//       console.log("setter - " + age);
//       this.age = age;
//     },
//     get: function () {
//       console.log("getter");
//       return "Thông tin tuổi: " + this.age;
//     },
//   });
// }
// // log
// // console.log(hoaLoaKen);
// // truoc
// console.log(hoaHong);
// hoaHong.mau = "Xanh";
// hoaHong.mauInfo = "Do";
// console.log(hoaHong.mau);
// console.log(hoaHong.mauInfo);
// // sau
// // console.log(hoaHong);
// // Cach 2
// var hoaLoaKen = new Object();
// // them thuoc tinh
// hoaLoaKen.mau = "vang";
// hoaLoaKen.soCanh = 5;

// 2. Class
// C1:
function Dog(dogName, weight, color, type) {
  this.dogName = dogName;
  this.weight = weight;
  this.color = color;
  this.type = type;
  this.sua = function () {
    return "Gau Gau";
  };
}

// Dog["choNhat"] = new Dog("cho", 0.5, "vang", "long ngan");

// console.log(Dog["choNhat"]);

Dog[0] = new Dog("Jacky", 0.8, "brown", "short hair");
Dog[1] = new Dog("Javascript", 1, "brown", "long hair");
Dog[2] = new Dog("Jscript", 1, "white", "long hair");
Dog[3] = new Dog("Jscript", 1, "black & white", "short hair");

function SinhVien(maSv, tenSv, tuoi) {
  this.maSv = maSv;
  this.tenSv = tenSv;
  this.tuoi = tuoi;
  this.display = function () {
    return "Minh la tan sinh vien";
  };
}

var Sinhvien = {
  tenSv: "AA",
  maSv: "Sv002",
  tuoi: 12,
};

SinhVien[0] = new SinhVien("Sv0", "Nguyen Van A", 20);
SinhVien[1] = new SinhVien("Sv1", "Nguyen Van B", 19);
SinhVien[2] = new SinhVien("Sv2", "Nguyen Van C", 21);
SinhVien[3] = new SinhVien("Sv3", "Nguyen Van D", 22);
SinhVien[4] = Sinhvien;

for (var i in SinhVien) {
  console.log(SinhVien[i]);
  // console.log(i);
}

// Dog[1].dogName;
// for (var x in Dog) {
//   console.log(Dog[x]);
// }
// // // C2:
// // class Polygon {
// //   constructor() {
// //     this.name = "Polygon";
// //   }
// // }

// // const poly1 = new Polygon();

// // console.log(poly1.name);
// // // expected output: "Polygon"

// // // 3. Mang chua object
// // // Đối tượng Comment
// var Comment = {
//   title: "",
//   content: "",
//   email: "",
//   fullname: "",
// };

// Khởi tạo mảng
// var Comments = [];

// // Gán giá trị cho phần tử mảng
// Comments[0] = Comment;

// Gọi tới thuộc tính
// Comments[0].title = "Tiêu đề bình luận";
// console.log(Comments[0]);

// Lap cac phan tu trong obejct
// let user = {
//   name: "John",
//   age: 30,
//   isAdmin: true,
// };

// for (let key in user) {
//   console.log(`Key ${key} có giá trị là ${user[key]}`);
// }
