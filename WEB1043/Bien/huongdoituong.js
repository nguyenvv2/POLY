// Tạo ra 1 đối tượng
//Cách 1
var dog = {
  mauLong: "Xam",
  soChan: 4,
  tiengKeu: function () {
    return "gau gau";
  },
};
// Cách 2
var dog1 = new Object();
dog1.mauLong = "long vang";
dog1.soChan = 4;
dog1.tiengKeu = function () {
  return "go go";
};
// truy xuất đến phương thức
console.log(dog1.tiengKeu());
console.log(dog.tiengKeu());

//truy xuất đến thuộc tính
console.log(dog1.mauLong);
console.log(dog.mauLong);

/*
Trong trường hợp nhiều đối tượng có đặc điểm giống nhau -> tạo ra 1 class
 */
// Cách tạo class
function SinhVien(hoten, diachi, namsinh) {
  this.hoten = hoten;
  this.diachi = diachi;
  this.namsinh = namsinh;
  this.tinhtuoi = function () {
    return 2022 - this.namsinh;
  };
}
// tạo ra 1 đói tượng sinh viên
var sinhvien = new SinhVien("Nguyen Van A", " Ha Noi", 2000);
console.log(sinhvien);
//truy xuất đến phuong thức tính tuổi
console.log(sinhvien.tinhtuoi());

// Tạo ra 1 mảng sinh viên
SinhVien[0] = sinhvien;
console.log(SinhVien[0]);
// hoặc
SinhVien[1] = new SinhVien("Nguyen Van A", " Ha Noi", 2000);
console.log(SinhVien[1]);

// duyệt
for (var i in SinhVien) {
  console.log(SinhVien[i]);
}
