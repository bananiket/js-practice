// for(i = 0; i < 5; i++){
//     console.log(i);
// }

const store = [
  ["item: monitor", "price: 1000", "stock: 5"],
  ["item: mouse", "price: 200", "stock: 10"],
  ["item: headphones", "price: 100", "stock: 12", "condition: NA"],
  ["item: keyboard", "price: 150", "stock: 15"],
  ["item: camera", "price: 400", "stock: 6"],
  ["item: microphone", "price: 650", "stock: 12"],
];

for (let i = 0; i < store.length; i++) {
  const innerArr = store[i];
  for (let j = 0; j < innerArr.length; j++) {
    console.log(innerArr[j]);
  }
  console.log("---------------------------");
}

const school = [
  ["class: A", "strength: 69", "house: yellow", "teacher: gita"],
  ["class: B", "strength: 35", "house: blue", "teacher: vandana"],
  ["class: C", "strength: 82", "house: green", "teacher: seema"],
  ["class: D", "strength: 29", "house: red", "teacher: sharma"],
  ["class: E", "strength: 94", "house: pink", "teacher: sita"],
];

for (let i = 0; i < school.length; i++) {
  for (let j = 0; j < school[i].length; j++) {
    console.log(school[i][j]);
  }
  console.log("------------------------------------------");
}

const society = [
  
  {
    buildingNo: 1,
    wing: "A",
    floors: 20,
    rooms: 80,
    fireExits: 4,
    terraceAreas: 2,
    amenities: ["CCTV", "parking", "clubroom" ],
  },
  {
    buildingNo: 2,
    wing: "B",
    floors: 24,
    rooms: 84,
    fireExits: 4,
    terraceAreas: 2,
    amenities: ["CCTV", "parking", "clubroom" ],
  }
]
