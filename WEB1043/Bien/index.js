// cho mang arr chứa các giá trị số và string
// hãy tạo giá trị cho mảng arr

// var arr = [];

// array.forEach((element) => {
//   // viết code ở đây
// });

// Null là một giá trị gán, có nghĩa là bạn có thể gán giá trị null cho bất kỳ biến nào khi bạn muốn biến đó trống. Nó được cố ý để trống và sẽ trỏ đến một giá trị trống.
// Undefined là một biến tồn tại nhưng chưa được khởi tạo YET. Có nghĩa là sau này, tôi có thể quay lại biến của mình và gán cho nó một giá trị mà trước đó nó không có. Vì vậy, nếu tôi khai báo một biến mà không có giá trị, nó chỉ được coi là không được khởi tạo.
// undefined : chua dc khoi tao
// null : khoi tao empty
let a;
console.log(typeof a);
let b = null;
console.log(typeof b);
let c = "";
console.log(typeof c);
console.log("aaaa");
arr1 = new Array("hello", "world", "javascript", "array");
arr2 = ["hello", "world", "javascript", "array"];
arr2.forEach((element) => {
  console.log(element);
});
console.log("For thuong");
for (let i = 0; i < arr2.length; i++) {
  console.log(arr2[i]);
}

console.log("for in");
// for in
for (let i in arr2) {
  console.log(i);
}

console.log("for of");
// for of
for (let i of arr2) {
  console.log(i);
}

// let arr5 = [1, 2, 3];
// let arr6 = [4, 5, 6];
// let arr7 = arr5.concat(arr6); // noi 2 mang
// console.log(arr7);
// let arr8 = arr7.concat(7, 8, 9);
// console.log(arr8);
// arr8.pop(); // xoa phan tu cuoi trong mang
arr8 = [2, 3, 4, 5, 6, 7, 8];
arr8.splice(1, 2); // xoa phan tu x toi y
console.log(arr8);

let findIndex = arr8.indexOf(6); // tra ve vi tri cua phan tu
let findIndex2 = arr8.indexOf(10);
console.log(findIndex, findIndex2);
// lastIndexOf(): trả về vị trí cuối cùng của phần tử x
// Cac ham trong thu vien Math ( show slide)
// console.log(typeof arr1);
// console.log(arr1);
// console.log(arr2);
// console.log(arr1[0]);
// console.log(arr1[-1]);
// hãy lọc ra các phần tử trong mảng có kiểu số
// sau đó in các phần tử kiểu số đó ra màn hình
arr9 = [1, 2, 3, "â"];
console.log("day la mang thuong");
arr9.forEach((arr) => {
  console.log(arr);
});

var i = 0;
while (i < 10) {
  console.log(i);
  i++;
}

// var input = prompt("Nhap vao 1 thang trong nam ");
// if (!isNaN(input)) {
//   console.log(typeof input);
//   switch (Number(input)) {
//     case 1:
//       alert("Day la thang 1");
//       break;
//     case 2:
//       alert("Day la thang 2");

//     default:
//       break;
//   }
// } else {
//   alert("Moi ban nhap so");
// }
